package com.moshcoder;

public class TaxReport {
    public TaxCalculator2019 calculator;

    public TaxReport(TaxCalculator2019 calculator) {
        this.calculator = calculator;
    }

    public void show(){
       double tax = calculator.calculateTax();
        System.out.println(tax);
    }

}
