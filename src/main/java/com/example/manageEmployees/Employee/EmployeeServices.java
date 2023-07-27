package com.example.manageEmployees.Employee;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServices {
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeServices(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }
    EmployeeDto addNewEmployee(EmployeeDto dto){
        Employee map = employeeMapper.map(dto);
        Employee save = employeeRepository.save(map);
        return employeeMapper.map(save);

    }
    EmployeeDto findById(long id){
        Employee employee = employeeRepository.findById(id).orElseThrow();
        return employeeMapper.map(employee);
    }
}
