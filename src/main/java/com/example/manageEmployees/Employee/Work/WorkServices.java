package com.example.manageEmployees.Employee.Work;

import com.example.manageEmployees.Employee.Employee;
import com.example.manageEmployees.Employee.EmployeeRepository;
import com.example.manageEmployees.Employee.History.HistoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Service
public class WorkServices {
    private final EmployeeRepository repository;
    private final HistoryRepository historyRepository;

    public WorkServices(EmployeeRepository repository, HistoryRepository historyRepository) {
        this.repository = repository;
        this.historyRepository = historyRepository;
    }
    @Transactional
    void start(long id){

        Employee employee = repository.findById(id).orElseThrow();
        long timeWork =employee.getTimeWork();
        if (employee.getStartWork()==null){
           employee.setStartWork(LocalDateTime.now());
       }else {
           employee.setEndWork(LocalDateTime.now());
           long between = ChronoUnit.SECONDS.between(employee.getStartWork(), employee.getEndWork());
           timeWork +=between;
           employee.setTimeWork(timeWork);
           employee.setStartWork(null);
           employee.setEndWork(null);
       }
    }

}
