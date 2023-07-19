package com.example.manageemployees.Employee;

import org.springframework.stereotype.Service;

@Service
public class EmployeeMapper {
    Employee map(EmployeeDto dto){
        Employee employee=new Employee();
        employee.setId(dto.getId());
        employee.setFirstName(dto.getFirstName());
        employee.setLastName(dto.getLastName());
        employee.setAge(dto.getAge());
        employee.setContractType(dto.getContractType());
        return employee;
    }
}
