package com.example.manageEmployees.Company.ContractType;

import com.example.manageEmployees.Employee.Employee;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity

public class ContractType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "RodzajUmowy")
    private String type;


@OneToMany(mappedBy = "contractType")
  private List<Employee>employees=new ArrayList<>();

    public ContractType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
