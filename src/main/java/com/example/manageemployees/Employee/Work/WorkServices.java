package com.example.manageemployees.Employee.Work;

import com.example.manageemployees.Employee.Employee;
import com.example.manageemployees.Employee.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class WorkServices {

    private final EmployeeRepository repository;

    public WorkServices( EmployeeRepository repository) {

        this.repository = repository;
    }
    void start(long id){
        Employee employee = repository.findById(id).orElseThrow();
       employee.setStartWork(LocalDateTime.now());
    }
    public void  end(long id){
        Employee employee = repository.findById(id).orElseThrow();
        employee.setEndWork(LocalDateTime.now());
    }
}
