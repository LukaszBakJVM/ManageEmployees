package com.example.manageEmployees.Employee;

import com.example.manageEmployees.Company.ContractType.ContractType;
import com.example.manageEmployees.Company.ContractType.ContractTypeRepository;
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
        employee.setPaycheck(dto.getPaycheck());
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
        dto.setPaycheck(employee.getPaycheck());
        dto.setContractType(employee.getContractType().getId());
        return dto;
    }
}
