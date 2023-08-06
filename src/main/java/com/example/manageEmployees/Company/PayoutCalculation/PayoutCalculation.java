package com.example.manageEmployees.Company.PayoutCalculation;


import jakarta.persistence.*;



@Entity
public class PayoutCalculation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

     private String localDateTime ;

    private double zus;


    public PayoutCalculation() {
    }

    public PayoutCalculation(String localDateTime, double zus) {
        this.localDateTime = localDateTime;
        this.zus = zus;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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


    @Override
    public String toString() {
        return "PayoutCalculation{" +
                "id=" + id +
                ", localDateTime='" + localDateTime + '\'' +
                ", zus=" + zus +
                '}';
    }
}
