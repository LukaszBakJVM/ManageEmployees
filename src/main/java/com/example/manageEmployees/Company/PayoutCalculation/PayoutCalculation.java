package com.example.manageEmployees.Company.PayoutCalculation;


import jakarta.persistence.*;
import org.hibernate.validator.constraints.UniqueElements;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Entity
public class PayoutCalculation {
    private final DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("yyyy-");


    @Id
    @UniqueElements
     private String localDateTime =LocalDateTime.now().format(datePattern);

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
