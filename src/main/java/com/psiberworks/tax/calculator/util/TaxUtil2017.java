package com.psiberworks.tax.calculator.util;

public class TaxUtil2017 {

    public static double calculateRateOfTax(Double annualEarnings) {
        double taxRateAmount;
        if (annualEarnings < 188000) {
            taxRateAmount = annualEarnings * 0.18;
        }
        else if (annualEarnings > 188001 && annualEarnings < 293600) {
            taxRateAmount = 33840 + ((annualEarnings-188000)* 0.26);
        }
        else if (annualEarnings > 293601 && annualEarnings < 406400) {
            taxRateAmount = 61296 + ((annualEarnings-293600)* 0.31);
        }
        else if (annualEarnings > 406401 && annualEarnings < 550100) {
            taxRateAmount = 96264 + ((annualEarnings-406400)* 0.36);
        }
        else if (annualEarnings > 550101 && annualEarnings < 701300) {
            taxRateAmount = 147996 + ((annualEarnings-550100)* 0.39);
        }
        else {
            taxRateAmount = 206964 + ((annualEarnings-701300)* 0.41);
        }

        return taxRateAmount;
    }

    public static double calculateTaxRebate(int age) {
        double taxRebateAmount = 13500d;

        if(age>=65 && age < 75) {
            taxRebateAmount += 7407d;
        }
        if(age>=75) {
            taxRebateAmount += 2466d;
        }

        return taxRebateAmount;
    }
}
