package com.assignments.PPT.P3CoreJava4_AdvOOPS.BasicInherit;

public class TestBank {

    public static void main(String[] args) {
        ICICI b1 = new ICICI();
        System.out.println(b1.getInterestRate());

        SBI b2 = new SBI();
        System.out.println(b2.getInterestRate());

        Axis b3 = new Axis();
        System.out.println(b3.getInterestRate());


    }
}
