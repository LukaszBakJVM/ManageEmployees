package com.example.manageEmployees.Company.PayoutCalculation;

import com.example.manageEmployees.Employee.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class PayoutServices {
    private final PayoutRepository payoutRepository;
    private final EmployeeRepository employeeRepository;

    public PayoutServices(PayoutRepository payoutRepository, EmployeeRepository employeeRepository) {
        this.payoutRepository = payoutRepository;
        this.employeeRepository = employeeRepository;
    }

}
