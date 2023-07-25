package com.example.manageemployees.Employee.History;


import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Imie")
    private String firstName;
    @Column (name = "Nazwisko")
    private String lastName;
    private LocalDateTime startWork;

    private LocalDateTime endWork;
    private long timeWork;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
