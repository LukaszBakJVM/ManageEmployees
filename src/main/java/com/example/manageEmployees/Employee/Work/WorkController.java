package com.example.manageEmployees.Employee.Work;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/work")
public class WorkController {
    private final WorkServices workServices;

    public WorkController(WorkServices workServices) {
        this.workServices = workServices;
    }
    @GetMapping("/{id}")
    void work(@PathVariable long id){
        workServices.start(id);

    }
}
