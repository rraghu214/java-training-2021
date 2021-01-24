package com.assignments.PPT.P1CoreJava2_Basics.A2ConditionalConstruct;

/**
 * Slide 21
 Design for insurance system where insurance is provided based on following parameters .
 If person is married he/she is insured
 If person is unmarried and female with age 25 and above is insured.
 If person is unmarried and male with age 30and above is insured.
 WAP to take input gender, age and marital status as input. Find  whether person is insured or not.

 */

import java.util.Scanner;

public class Q2IsInsured {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = sc.nextInt();
        System.out.println("Age is : " + age);
        System.out.println("Enter the Gender: ");
        char gen = sc.next().charAt(0);
        System.out.println("Gender is : " + gen);
        System.out.println("Married or Unmarried? M / U");
        char marital = sc.next().charAt(0);



        //String insured = ((age > 30 & age < 50) & gen == 'M') | ((age > 25 & age < 55) & gen == 'F') ? "Insured" : "Not Insured";
        String insured = ((marital == 'M') || (((gen == 'F')&(age > 25)) | ((gen == 'M')&(age > 30)))) ? "Insured" : "Not Insured";
        System.out.println(insured);




    }
}

