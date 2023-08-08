package com.example.manageEmployees.Company.PayoutCalculation;

import com.example.manageEmployees.Company.ContractType.Calculations.Calculations;


import com.example.manageEmployees.Employee.Employee;
import com.example.manageEmployees.Employee.EmployeeRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


@Service
public class PayoutServices {
    private final DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm");
    private String timeStamp = LocalDateTime.now().format(datePattern);

    private final PayoutRepository payoutRepository;
    private final Calculations calculations;
    private final EmployeeRepository employeeRepository;


    public PayoutServices(PayoutRepository payoutRepository, Calculations calculations, EmployeeRepository employeeRepository) {
        this.payoutRepository = payoutRepository;
        this.calculations = calculations;
        this.employeeRepository = employeeRepository;


    }
    //Every month on the last day of the month, at noon
  //  @Scheduled(cron = "0 0 12 L * ?")

    @Transactional

    public void calculate() {
        double paycheck;
        List<Employee> all = employeeRepository.findAll();
        for (Employee employee : all) {
            int id = employee.getContractType().getId();
            long timeWork = employee.getTimeWork();
            int age = employee.getAge();
            double rate = employee.getRate();
            switch (id) {
                case 1:
                    paycheck = calculations.UoP(timeWork, age, rate);
                    employee.setPaycheck(paycheck);
                    break;
                case 2:
                    paycheck = calculations.UZ(timeWork, age, rate);
                    employee.setPaycheck(paycheck);
                    break;
                case 3:
                    paycheck = calculations.B2b(timeWork, rate);
                    employee.setPaycheck(paycheck);
                    break;


            }


        }
        PayoutCalculation save = payoutRepository.save(createEntry());




    }

    private PayoutCalculation createEntry(){
        String time= timeStamp;
        double zus =calculations.getZUS();
        writeToFile(zus,time);
        return new PayoutCalculation(time,zus);

    }
    private void writeToFile(double zus ,String time){
        List<Employee> allByTimeWorkIsNotNull = employeeRepository.findAllByTimeWorkIsNotNull();

        try(
                var file =new FileWriter(time);
                var buffer=new BufferedWriter(file)
                ) {
            for (Employee a:allByTimeWorkIsNotNull) {
                buffer.write(a.toString());
                buffer.newLine();
            }
            buffer.write(zus +" zł ");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Scheduled(cron = "0 0 22 20 1/1 ? ")
    @Transactional
    public void  clearCalculate(){
        List<Employee> all = employeeRepository.findAll();
        for (Employee e:all) {
            e.setPaycheck(0);
            e.setTimeWork(0);

        }
        calculations.setZUS(0);
    }
    }








