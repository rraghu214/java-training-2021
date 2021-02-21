package com.assignments.PPTProbs.P1CoreJava2_Basics.A1Operators;

/**
 * Slide 16
 * Provide value for Ramesh basic salary. His dearness allowance is 40% of basic salary
 * and house rent allowance is 70% of basic salary. Write a program to calculate his gross salary.
 * EX: basic = 10,000, da = 4000, hra = 7000 gs = 21,100
 */

public class Q2GrossSalary {

    public static void main(String[] args) {

        double da = 40;
        double hra = 70;
        double basic = 10000;
        double gs;

        gs = basic + (basic * da/100) + (basic * 70/100);

        System.out.println("Gross Salary : " + gs);

    }
}
