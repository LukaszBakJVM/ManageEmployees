package com.example.manageemployees.Company;

import com.example.manageemployees.Employee.Employee;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity

public class ContractType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
private String uop;
 private String uzl;

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

    public String getUop() {
        return uop;
    }

    public void setUop(String uop) {
        this.uop = uop;
    }

    public String getUzl() {
        return uzl;
    }

    public void setUzl(String uzl) {
        this.uzl = uzl;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
