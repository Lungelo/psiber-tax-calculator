package com.psiberworks.tax.calculator.rest;

import java.math.BigDecimal;
import com.psiberworks.tax.calculator.dto.TaxDto;
import com.psiberworks.tax.calculator.service.TaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class TaxCalculatorAPI {

    @Autowired
    private TaxService taxService;

    @PostMapping(path = "/calculate-tax", consumes = "application/json",
            produces = "application/json")
    public BigDecimal calculateTax(@RequestBody TaxDto taxDto) {
        BigDecimal results = taxService.calculateTax(taxDto);

        return results;
    }
}
