package com.assignments.PPTProbs.P2CoreJava3_OOPS.A1Methods.Q3;

/**
 * Slide -13
 * Define a class Employee having the following description:
 * Data members
 * int pan to store personal account number
 * String name to store name
 * double taxincome to store annual taxable income
 * Member functions :
 * void input ( ) Store the pan number, name, taxable income
 * Double cal Calculate tax of an employee and returns the calculated tax
 * void display Output details of an employee
 * Write a program to compute the tax according to the given conditions and display the output as per given format:
 *
 * Total annual taxable income          Tax Rate
 * Up to Rs. 1,00,000                   No tax
 * From Rs. 1,00,001 to Rs. 1,50,000    10% of the income exceeding Rs. 1,00,000
 * From Rs. 1,50,001 to Rs. 2,50,001    Rs. 5,000 + 20% of the income exceeding Rs. 1,50,000
 * From Rs. 2,50,001                    Rs. 25,000 + 30% of the income exceeding Rs. 2,50,000
 *
 * Output:
 * Pan Number   Name    Tax-Income  Tax
 * …………………. 	………       ………………….  ………………….
 * …………………. 	………       ………………….  ………………….
 *
 */

public class Employee {
    private int pan;
    private String name;
    private double taxincome;
    private double tax;

    public void input(int pan, String name, double taxableincome){
        this.pan = pan;
        this.name = name;
        this.taxincome = taxableincome;
    }

    public double cal(){
        if(this.taxincome < 100000)
            return this.tax = 0.0;
        else if(this.taxincome > 100001 & this.taxincome < 150000)
            return this.tax = (this.taxincome - 100000) * 0.1;
        else if(this.taxincome > 150001 & this.taxincome < 250000)
            return this.tax = ((this.taxincome - 150000) * 0.2) + 5000;
        else
            return this.tax = ((this.taxincome - 250000) * 0.3) + 25000;

    }

    public void display(){
        System.out.println("PAN #\t\tName\t\tTax-Income\t\tTax");
        System.out.println(this.pan + "\t\t"+ this.name+"\t\t" + this.taxincome+"\t\t" + this.tax);
    }
}
