package com.assignments.A1; /**
 *
 * WAP to take age and gender as input from the user.
 * Check if the gender is Male and age is between 30 & 50 person can be insured.
 * Check if the gender is female and age is between 25 & 55 person can be insured.
 * Otherwise cannot be insured.
 */

import java.util.Scanner;

public class A1ValidateInsured {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = sc.nextInt();
        System.out.println("Age is : " + age);
        System.out.println("Enter the Gender: ");
        char gen = sc.next().charAt(0);
        System.out.println("Gender is : " + gen);


        String insured = ((age > 30 & age < 50) & gen == 'M') | ((age > 25 & age < 55) & gen == 'F') ? "Insured" : "Not Insured";
        System.out.println(insured);




    }
}
