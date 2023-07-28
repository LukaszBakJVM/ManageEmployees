package com.example.manageEmployees.Company.ContractType;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public class ContractTypeServices {
    private final ContractTypeRepository repository;

    public ContractTypeServices(ContractTypeRepository repository) {
        this.repository = repository;
    }
  public   List<String> allContractType(){
        return repository.findAll()
                .stream().map(ContractType::getType)
                .toList();

    }
    ContractType addNewContractType(ContractType contractType){
        return repository.save(contractType);
    }

}
