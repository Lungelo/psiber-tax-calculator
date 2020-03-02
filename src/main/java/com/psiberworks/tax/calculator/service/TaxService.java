package com.psiberworks.tax.calculator.service;

import java.math.BigDecimal;
import com.psiberworks.tax.calculator.dto.TaxDto;
import com.psiberworks.tax.calculator.util.TaxUtil2017;
import com.psiberworks.tax.calculator.util.TaxUtil2018;
import org.springframework.stereotype.Service;


@Service
public class TaxService {

    public BigDecimal calculateTax(TaxDto taxDto) {

        Integer age = taxDto.getAge();
        String taxYear = taxDto.getTaxYear();
        Double earnings =taxDto.getEarnings();
        String payFreq = taxDto.getPayFreq();
        Integer dependantsCount = taxDto.getMedicalAid();

        // ensure the earnings value is the annual value
        earnings = annualEarnings(earnings,payFreq);
        double taxRateAmount=0, taxRebateAmount=0;

        if ("2017".compareToIgnoreCase(taxYear) == 0) {
            taxRateAmount = TaxUtil2017.calculateRateOfTax(earnings);
            taxRebateAmount = TaxUtil2017.calculateTaxRebate(age);
        }

        if ("2018".compareToIgnoreCase(taxYear) == 0) {
            taxRateAmount = TaxUtil2018.calculateRateOfTax(earnings);
            taxRebateAmount = TaxUtil2018.calculateTaxRebate(age);
        }

        double annualTaxWithoutCredit = taxRateAmount - taxRebateAmount;
        double monthlyTax = annualTaxWithoutCredit/12;
        BigDecimal results = BigDecimal.valueOf(monthlyTax)
                            .setScale(2, BigDecimal.ROUND_UP);

        return results;
    }

    private static double annualEarnings(Double earnings, String payFreq) {
        if("monthly".equalsIgnoreCase(payFreq)) {
            return earnings * 12;
        }

        return earnings;
    }
}
