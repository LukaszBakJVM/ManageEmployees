package com.example.manageemployees.Employee.Work;

import com.example.manageemployees.Employee.Employee;
import com.example.manageemployees.Employee.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class WorkServices {


    private final EmployeeRepository repository;

    public WorkServices( EmployeeRepository repository) {

        this.repository = repository;
    }
    @Transactional
    void start(long id){
        Employee employee = repository.findById(id).orElseThrow();
       if (employee.getStartWork()==null){
           employee.setStartWork(LocalDateTime.now());
       }else {
           employee.setEndWork(LocalDateTime.now());
       }
    }

}
