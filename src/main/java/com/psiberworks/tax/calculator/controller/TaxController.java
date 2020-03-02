package com.psiberworks.tax.calculator.controller;

import java.math.BigDecimal;
import com.psiberworks.tax.calculator.dto.TaxDto;
import com.psiberworks.tax.calculator.service.TaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
public class TaxController {

@Autowired
private TaxService taxService;

    @GetMapping("/home")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/calculate-tax", method = RequestMethod.POST)
    public String submit(@ModelAttribute("taxDto") TaxDto taxDto ,
                         BindingResult bindingResult, Model model) {

        BigDecimal results = taxService.calculateTax(taxDto);

        if (bindingResult.hasErrors()) {
            return "error";
        }

        model.addAttribute("age", taxDto.getAge()) ;
        model.addAttribute("taxYear", taxDto.getTaxYear()) ;
        model.addAttribute("earnings", taxDto.getEarnings()) ;
        model.addAttribute("payFreq", taxDto.getPayFreq()) ;
        model.addAttribute("medicalAid", taxDto.getMedicalAid()) ;
        model.addAttribute("results", results);

        return "index";
    }
}
