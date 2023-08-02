package com.example.manageEmployees.Company.PayoutCalculation;


import jakarta.persistence.*;



@Entity
public class PayoutCalculation {
  //  private final DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm");

//=LocalDateTime.now().format(datePattern);

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
