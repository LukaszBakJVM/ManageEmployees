package com.example.manageemployees.Employee.Work;

import com.example.manageemployees.Employee.Employee;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;

@Service
public class WorkMapper {
    Employee map(WorkDto dto){
        Employee employee =new Employee();
        employee.setId(dto.getId());
        LocalDateTime startWork = dto.getStartWork();
        LocalDateTime endWork = dto.getEndWork();
        employee.setTimeWork(timeWork(startWork,endWork));
        return employee;
    }
    private long timeWork(LocalDateTime start,LocalDateTime end){
        Duration between =Duration.between(end,start);
        return between.toHours();

    }
}
