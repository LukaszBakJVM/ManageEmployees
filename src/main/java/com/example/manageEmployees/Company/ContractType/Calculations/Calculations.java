package com.example.manageEmployees.Company.ContractType.Calculations;

import org.springframework.stereotype.Component;

@Component
public class Calculations {
    private double ZUS;
    private final double VAT_23=0.23;

    double UoP(long timeWork,int age,double rate){
        double payment;
        if (age<=26){
            payment=rate;

        }else {
            ZUS+=(rate*0.1);
            payment=rate-(rate*0.1);
        }

        return payment ;

    }

     double UZ (long timeWork,int age,double rate){
         double payment=rate*timeWork;
        if (age<=26){
          return payment;

        }
        ZUS+=payment*0.20;


        return payment-(payment*0.2);

    }
    double B2b(long timeWork,double rate){
        double payment =timeWork*rate;
return payment+(payment*VAT_23)  ;
    }



}
