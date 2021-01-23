package com.learning.jan._14;

import com.learning.jan._13.oops.Patient;

import java.util.Scanner;

public class TakePatientData {

    public static void main(String[] args) {
        Patient patients []= new Patient[2];
        //Patient tempPatient = new Patient(); --> this should be inside the class.

        Scanner sc = new Scanner(System.in);

        for (int i=0; i < patients.length; i++){
            Patient tempPatient = new Patient();
            System.out.println("Enter the Details of Patient #" + (i+1));
            System.out.println("Name: ");
            tempPatient.setName(sc.nextLine());
            System.out.println("Email: ");
            tempPatient.setEmail(sc.nextLine());
            System.out.println("Age: ");
            tempPatient.setAge(sc.nextInt());
            sc.nextLine();
            patients[i] = tempPatient;

            //tempPatient.isPatientExists();

        }
        sc.close();

        String test_email = "a@a.com"; // Or take it as a scanner input
        int count = 0;

        for (int i =0; i < patients.length; i++){

            if(patients[i].getEmail().equals(test_email)){
                System.out.println("You are already registered");
                count++;
                break;
            }
        }
        //System.out.println("Count is : "+ count);
        if(count == 0)
            System.out.println("Please register");
    }

}
