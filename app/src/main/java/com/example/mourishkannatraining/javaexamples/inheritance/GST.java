package com.example.mourishkannatraining.javaexamples.inheritance;

public class GST extends IncomeTax{
    @Override
    int calculateTax(int income) {
        int oldTax = super.calculateTax(income);
        int newTax = 1000;
        return  oldTax + newTax;
    }
}