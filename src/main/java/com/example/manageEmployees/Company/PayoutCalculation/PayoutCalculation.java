package com.example.manageEmployees.Company.PayoutCalculation;

import com.example.manageEmployees.Employee.Employee;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class PayoutCalculation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double netto;
    private double brutto;
    private double zus;
    @ManyToMany(mappedBy = "payoutCalculations")
    private List<Employee>employees=new ArrayList<>();

    public PayoutCalculation() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getNetto() {
        return netto;
    }

    public void setNetto(double netto) {
        this.netto = netto;
    }

    public double getBrutto() {
        return brutto;
    }

    public void setBrutto(double brutto) {
        this.brutto = brutto;
    }

    public double getZus() {
        return zus;
    }

    public void setZus(double zus) {
        this.zus = zus;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
