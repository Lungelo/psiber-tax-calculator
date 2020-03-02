package com.psiberworks.tax.calculator.dto;

import java.util.Objects;

public class TaxDto {

    private Integer age;
    private String taxYear;
    private Double earnings;
    private String payFreq;
    private Integer medicalAid;

    public TaxDto(Integer age, String taxYear, Double earnings,
                  String payFreq, Integer medicalAid) {
        this.age = age;
        this.taxYear = taxYear;
        this.earnings = earnings;
        this.payFreq = payFreq;
        this.medicalAid = medicalAid;
    }

    public TaxDto() {

    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTaxYear() {
        return taxYear;
    }

    public void setTaxYear(String taxYear) {
        this.taxYear = taxYear;
    }

    public Double getEarnings() {
        return earnings;
    }

    public void setEarnings(Double earnings) {
        this.earnings = earnings;
    }

    public String getPayFreq() {
        return payFreq;
    }

    public void setPayFreq(String payFreq) {
        this.payFreq = payFreq;
    }

    public Integer getMedicalAid() {
        return medicalAid;
    }

    public void setMedicalAid(Integer medicalAid) {
        this.medicalAid = medicalAid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxDto taxDto = (TaxDto) o;
        return Objects.equals(age, taxDto.age) &&
                Objects.equals(taxYear, taxDto.taxYear) &&
                Objects.equals(earnings, taxDto.earnings) &&
                Objects.equals(payFreq, taxDto.payFreq) &&
                Objects.equals(medicalAid, taxDto.medicalAid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, taxYear, earnings, payFreq, medicalAid);
    }

    @Override
    public String toString() {
        return "TaxDto{" +
                "age=" + age +
                ", taxYear=" + taxYear +
                ", earnings=" + earnings +
                ", payFreq='" + payFreq + '\'' +
                ", medicalAid=" + medicalAid +
                '}';
    }
}

