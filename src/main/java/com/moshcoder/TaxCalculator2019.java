package com.moshcoder;

public class TaxCalculator2019 {
    public double taxableIncome;

    public TaxCalculator2019(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double calculateTax(){
        return taxableIncome * 0.3;
    }


}
