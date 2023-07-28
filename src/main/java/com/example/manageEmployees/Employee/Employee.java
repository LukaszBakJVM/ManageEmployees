package com.example.manageEmployees.Employee;


import com.example.manageEmployees.Company.ContractType.ContractType;
import com.example.manageEmployees.Company.PayoutCalculation.PayoutCalculation;
import com.example.manageEmployees.Employee.History.History;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column (name = "Imie")
    private String firstName;
    @Column (name = "Nazwisko")
    private String lastName;
    @NotNull
    @Min(value = 18)
    @Column(name = "Wiek")
    private int age;
    @Column (name = "stawka")
    private double rate;

    @Column (name = "dochod")
    private double paycheck;

    private LocalDateTime startWork;

    private LocalDateTime endWork;
    private long timeWork;
    @ManyToOne()

    private ContractType contractType;
    @OneToOne
    private History history;
    @ManyToMany
    private List<PayoutCalculation>payoutCalculations=new ArrayList<>();

    public Employee() {
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getPaycheck() {
        return paycheck;
    }

    public void setPaycheck(double paycheck) {
        this.paycheck = paycheck;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
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

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }

    public List<PayoutCalculation> getPayoutCalculations() {
        return payoutCalculations;
    }

    public void setPayoutCalculations(List<PayoutCalculation> payoutCalculations) {
        this.payoutCalculations = payoutCalculations;
    }
}
