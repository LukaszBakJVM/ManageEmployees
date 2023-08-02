package com.example.manageEmployees.Company.PayoutCalculation;

import com.example.manageEmployees.Company.ContractType.Calculations.Calculations;


import com.example.manageEmployees.Employee.Employee;
import com.example.manageEmployees.Employee.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


@Service
public class PayoutServices {
      private final DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm");
      private String timeStamp=LocalDateTime.now().format(datePattern);

    private final PayoutRepository payoutRepository;
    private final Calculations calculations;
    private final EmployeeRepository employeeRepository;


    public PayoutServices(PayoutRepository payoutRepository, Calculations calculations, EmployeeRepository employeeRepository) {
        this.payoutRepository = payoutRepository;
        this.calculations = calculations;
        this.employeeRepository = employeeRepository;



    }
@Transactional
    public void calculate() {
        double paycheck;
        List<Employee> all = employeeRepository.findAll();
        for (Employee employee : all) {
            int id = employee.getContractType().getId();
            long timeWork = employee.getTimeWork();
            int age = employee.getAge();
            double rate = employee.getRate();
            switch (id){
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
            double zus = calculations.getZUS();







        }
           }
        }



