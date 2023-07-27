package com.example.manageEmployees.Company;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/ContractType")
public class ContractTypeController {
    private final ContractTypeServices services;

    public ContractTypeController(ContractTypeServices services) {
        this.services = services;
    }

    @GetMapping
    List<String> allContractType() {
        return services.allContractType();
    }

    @PostMapping
    ResponseEntity<ContractType> save(@RequestBody ContractType contractType) {
        ContractType save = services.addNewContractType(contractType);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(save.getId()).toUri();
        return ResponseEntity.created(uri).body(save);
    }
}
