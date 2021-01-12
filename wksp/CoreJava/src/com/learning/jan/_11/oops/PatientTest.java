package com.learning.jan._11.oops;

public class PatientTest {
    public static void main(String[] args){
        //declare a variable of type patient
        // local variables have no default value. Since JAVA doesn't encourage garbage value.
        Patient p1;
        //Created an object p1 of type Patient.
        // p1 ==> instance  / reference variable.
        //p1 = null;
        p1 = new Patient();
        System.out.println(p1);


        p1.name = "Raghu";
        p1.email = "a@a.com";
        p1.age = 10;

        Patient p2 = new Patient();
        p2.name = "X";
        p2.age = 20;
        p2.email = "b@b.com";

        Patient p3;
        p3 = new Patient();
        p3.setValues("Name3",23,"c@c.com");
        // A function to display the object data.
        p3.printValues();
        p1.printValues();
        p2.printValues();

        // get the birth year from the age of the patient

        int year = p3.calculateBirthYear();
        System.out.println(year);




    }
}
