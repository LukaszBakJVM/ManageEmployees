package com.example.manageemployees.Company;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ContractTypeServices {
    private final ContractTypeRepository repository;

    public ContractTypeServices(ContractTypeRepository repository) {
        this.repository = repository;
    }
    List<ContractType> allContractType(){
        return repository.findAll();

    }
}
