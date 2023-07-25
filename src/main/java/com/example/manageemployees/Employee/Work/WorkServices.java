package com.example.manageemployees.Employee.Work;

import com.example.manageemployees.Employee.Employee;
import com.example.manageemployees.Employee.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

import java.time.temporal.ChronoUnit;

@Service
public class WorkServices {




    private final EmployeeRepository repository;

    public WorkServices( EmployeeRepository repository) {
        this.repository = repository;
    }
    @Transactional
    void start(long id){


        Employee employee = repository.findById(id).orElseThrow();
        long timeWork =employee.getTimeWork();
       if (employee.getStartWork()==null){
           employee.setStartWork(LocalDateTime.now());
       }else {
           employee.setEndWork(LocalDateTime.now());
           long between = ChronoUnit.MINUTES.between(employee.getStartWork(), employee.getEndWork());
           timeWork +=between;
           employee.setTimeWork(timeWork);
           employee.setStartWork(null);
           employee.setEndWork(null);
       }
    }

}
