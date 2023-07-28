package com.example.manageEmployees.Company.PayoutCalculation;

import com.example.manageEmployees.Company.ContractType.ContractTypeServices;

import com.example.manageEmployees.Employee.Employee;
import com.example.manageEmployees.Employee.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;


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

    public void calculate() {
        List<String> strings = contractTypeServices.allContractType();

        List<Employee> all = employeeRepository.findAll();
        for (Employee e : all) {
            int id = e.getContractType().getId();



            }
        }

    }


