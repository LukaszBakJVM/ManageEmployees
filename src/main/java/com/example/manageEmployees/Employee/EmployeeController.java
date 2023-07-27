package com.example.manageEmployees.Employee;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeServices employeeServices;

    public EmployeeController(EmployeeServices employeeServices) {
        this.employeeServices = employeeServices;
    }
 @PostMapping
    ResponseEntity<EmployeeDto>save(@RequestBody EmployeeDto employeeDto){
     EmployeeDto dto = employeeServices.addNewEmployee(employeeDto);
     URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
             .path("/{id}").buildAndExpand(dto.getId()).toUri();
     return ResponseEntity.created(uri).body(dto);
 }
 @GetMapping("/{id}")
    ResponseEntity<EmployeeDto>findById(@PathVariable long id){
        return ResponseEntity.ok(employeeServices.findById(id));
 }
}
