package com.psiberworks.tax.calculator.util;

public class TaxUtil2018 {

    public static double calculateRateOfTax(Double annualEarnings) {
        double taxRateAmount;
        if (annualEarnings < 189880) {
            taxRateAmount = annualEarnings * 0.18;
        }
        else if (annualEarnings > 189881 && annualEarnings < 296540) {
            taxRateAmount = 34178 + ((annualEarnings-189880)* 0.26);
        }
        else if (annualEarnings > 296541 && annualEarnings <  410460) {
            taxRateAmount = 61910 + ((annualEarnings- 296540 )* 0.31);
        }
        else if (annualEarnings > 410461 && annualEarnings < 555600) {
            taxRateAmount = 97225 + ((annualEarnings-410460)* 0.36);
        }
        else if (annualEarnings > 555601 && annualEarnings < 708310) {
            taxRateAmount = 149475 + ((annualEarnings-555600)* 0.39);
        }
        else if (annualEarnings > 708311 && annualEarnings < 1500001) {
            taxRateAmount = 209032 + ((annualEarnings-708310)* 0.41);
        }
        else {
            taxRateAmount = 533625 + ((annualEarnings-1500000)* 0.45);
        }

        return taxRateAmount;
    }

    public static double calculateTaxRebate(int age) {
        double taxRebateAmount = 13635d;

        if(age>=65 && age < 75) {
            taxRebateAmount += 7479d;
        }
        if(age>=75) {
            taxRebateAmount += 2493d;
        }

        return taxRebateAmount;
    }
}
