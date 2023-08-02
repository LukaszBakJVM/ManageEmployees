package com.example.manageEmployees.Company.PayoutCalculation;


import jakarta.persistence.*;



@Entity
public class PayoutCalculation {


    @Id

     private String localDateTime ;

    private double zus;


    public PayoutCalculation() {
    }

    public String getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(String localDateTime) {
        this.localDateTime = localDateTime;
    }

    public double getZus() {
        return zus;
    }

    public void setZus(double zus) {
        this.zus = zus;
    }
}
