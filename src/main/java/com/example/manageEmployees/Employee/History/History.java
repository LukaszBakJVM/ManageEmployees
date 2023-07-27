package com.example.manageEmployees.Employee.History;


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


}
