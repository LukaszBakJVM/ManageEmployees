package com.example.manageEmployees.Company.ContractType.Calculations;

import org.springframework.stereotype.Component;

@Component
public class Calculations {
    private double ZUS;

    double UoP(long timeWork,int age,double rate){
        double payment;
        if (age<=26){
            payment=rate;

        }else {
            payment=rate-(rate*0.1);
        }

        return payment ;

    }

     double UZ (long timeWork,int age){
        return 0;

    }
    double B2b(long timeWork){
return  0;
    }



}
