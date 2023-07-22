package com.example.manageemployees.Employee.Work;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/work")
public class WorkController {
    private final WorkServices workServices;

    public WorkController(WorkServices workServices) {
        this.workServices = workServices;
    }
}
