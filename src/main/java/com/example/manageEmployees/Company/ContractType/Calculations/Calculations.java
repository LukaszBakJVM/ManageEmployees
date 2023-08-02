package com.example.manageEmployees.Company.ContractType.Calculations;

import org.springframework.stereotype.Component;

@Component
public class Calculations {
    private double ZUS;
    private final double VAT_23=0.23;

  public   double UoP(long timeWork,int age,double rate){
        double payment;
        if (age<=26){
            payment=rate;

        }else {
            ZUS+=(rate*0.1);
            payment=rate-(rate*0.1);
        }

        return payment ;

    }

   public   double UZ (long timeWork,int age,double rate){
         double payment=rate*timeWork;
        if (age<=26){
          return payment;

        }
        ZUS+=payment*0.20;


        return payment-(payment*0.2);

    }
  public   double B2b(long timeWork,double rate){
        double payment =timeWork*rate;
return payment+(payment*VAT_23)  ;
    }

    public double getZUS() {
        return ZUS;
    }

    public void setZUS(double ZUS) {
        this.ZUS = ZUS;
    }
}
