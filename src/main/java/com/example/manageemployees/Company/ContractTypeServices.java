package com.example.manageemployees.Company;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ContractTypeServices {
    private final ContractTypeRepository repository;

    public ContractTypeServices(ContractTypeRepository repository) {
        this.repository = repository;
    }
    List<String> allContractType(){
        return repository.findAll()
                .stream().map(ContractType::getType)
                .toList();

    }
    ContractType addNewContractType(ContractType contractType){
        return repository.save(contractType);
    }

}
