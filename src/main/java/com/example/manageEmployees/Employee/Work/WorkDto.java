package com.example.manageEmployees.Employee.Work;



import java.time.LocalDateTime;

public class WorkDto {
    private long id;
    private LocalDateTime startWork;

    private LocalDateTime endWork;
    private long timeWork;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getStartWork() {
        return startWork;
    }

    public void setStartWork(LocalDateTime startWork) {
        this.startWork = startWork;
    }

    public LocalDateTime getEndWork() {
        return endWork;
    }

    public void setEndWork(LocalDateTime endWork) {
        this.endWork = endWork;
    }

    public long getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(long timeWork) {
        this.timeWork = timeWork;
    }
}
