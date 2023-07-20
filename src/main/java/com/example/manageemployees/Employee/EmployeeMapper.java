package com.example.manageemployees.Employee;

import com.example.manageemployees.Company.ContractType;
import com.example.manageemployees.Company.ContractTypeRepository;
import org.springframework.stereotype.Service;


@Service
public class EmployeeMapper {
    private final ContractTypeRepository contractTypeRepository;

    public EmployeeMapper(ContractTypeRepository contractTypeRepository) {
        this.contractTypeRepository = contractTypeRepository;
    }

    Employee map(EmployeeDto dto){
        Employee employee=new Employee();
        employee.setId(dto.getId());
        employee.setFirstName(dto.getFirstName());
        employee.setLastName(dto.getLastName());
        employee.setAge(dto.getAge());
        ContractType contractType = contractTypeRepository.findById(dto.getContractType()).orElseThrow();
        employee.setContractType(contractType);
        return employee;
    }
    EmployeeDto map(Employee employee){
        EmployeeDto dto=new EmployeeDto();
        dto.setId(employee.getId());
        dto.setFirstName(employee.getFirstName());
        dto.setLastName(employee.getLastName());
        dto.setAge(employee.getAge());
        dto.setContractType(employee.getContractType().getId());
        return dto;
    }
}
