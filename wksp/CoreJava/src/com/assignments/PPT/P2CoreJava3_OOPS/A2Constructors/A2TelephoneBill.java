package com.assignments.PPT.P2CoreJava3_OOPS.A2Constructors;

/**
 * Slide 19
 * Define a class Bill that calculates the telephone bill of a consumer with the following description:
 * Instance variables/data members:
 *      int bno	: bill number
 *      String name : name of consumer
 *      int call	: no. of calls consumed in a month
 *      double amt 	: bill amount to be paid by the person
 * Methods/ Members functions :
 *      Bill(…)		: parameterized constructor to accept billno,name and no. of calls consumed.
 *      calculate()		: to calculate the monthly telephone bill for a consumer as per the following condition
 *
 *      Units Consumed      Rate
 *      First 100 Calls     Rs. 0.60 / call
 *      Next 100 Calls      Rs. 0.80 / call
 *      Next 100 Calls      Rs. 1.20 / call
 *      Above 300 Calls     Rs. 1.50 / call
 *
 *      Fixed Monthly rental applicable to all consumers: ₹ 125
 *
 *      Display() 	: To display the details
 *
 *
 */
public class A2TelephoneBill {

    private int bno; // Bill Number
    private String name; // Consumer Name
    private int call; // # of calls
    private double amt; // Bill amount
    private double rental = 125;

    A2TelephoneBill(int bno, String name, int calls){
        this.bno = bno;
        this.name = name;
        this.call = calls;
    }

    public double Calculate(){
        if (this.call <=100)
            amt = this.call*0.6;
        else if(this.call > 100 & this.call <= 200)
            amt = (100 * 0.6) + ((this.call-100) * 0.8);
        else if(this.call > 200 & this.call <= 300)
            amt = (100 * 0.6) + (100 * 0.8)+ ((this.call-200) * 1.2);
        else
            amt = (100 * 0.6) + (100 * 0.8)+ (100 * 1.2)+((this.call-300) * 1.5);

        this.amt = this.amt + rental;
        return this.amt;
    }

    public void display(){
        System.out.println("Hello " + this.name + ". Amount for Bill # " + this.bno+ " is : "  + this.amt);
    }

}
