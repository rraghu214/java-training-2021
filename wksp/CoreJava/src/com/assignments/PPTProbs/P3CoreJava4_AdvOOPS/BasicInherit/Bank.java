package com.assignments.PPTProbs.P3CoreJava4_AdvOOPS.BasicInherit;

/**
 * Slide - 13
 * Consider a scenario, Bank is a class that provides functionality to get rate of interest.
 * But, rate of interest varies according to banks.
 * For example, SBI, ICICI and AXIS banks could provide 8%, 7% and 9% rate of interest.
 *
 * Create a bank class and its child classes SBI,ICICI and AXIS and override getInterestRate method from parent class.
 */

//Parent Class / Super Class / Base Class
public class Bank {
    private double roi;

    public Bank() {
    }

//    public Bank(double roi) {
//        this.roi = roi;
//    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public double getInterestRate(){
        return this.roi;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "roi=" + roi +
                '}';
    }
}
