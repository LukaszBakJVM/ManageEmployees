package com.example.manageEmployees.Company.PayoutCalculation;

import com.example.manageEmployees.Company.ContractType.ContractTypeServices;

import com.example.manageEmployees.Employee.EmployeeRepository;
import org.springframework.stereotype.Service;



@Service
public class PayoutServices {
    private final PayoutRepository payoutRepository;
    private final EmployeeRepository employeeRepository;
    private final ContractTypeServices contractTypeServices;

    public PayoutServices(PayoutRepository payoutRepository, EmployeeRepository employeeRepository, ContractTypeServices contractTypeServices) {
        this.payoutRepository = payoutRepository;
        this.employeeRepository = employeeRepository;

        this.contractTypeServices = contractTypeServices;

    }
 public    void calculate(){
        contractTypeServices.allContractType();

       /* List<Employee> all = employeeRepository.findAll();
       // for (Employee e:all) {
            e.getTimeWork();
           // if (e.getContractType().getType().equals(strings.get(0))){

            }*/
        }

    }


