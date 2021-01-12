package com.learning.jan._11.oops;

public class DoctorTest {

    public static void main(String [] args){
        String name = "Raghu";
        String email = "a@a.com";
        int doctorid = 123;
        int phone = 987654321;
        String speciality = "surgeon";
        String address = "123, dream lane";

        Doctor d1 = new Doctor();
        d1.setDetails(name,email,doctorid,phone,speciality,address);
        d1.display();
    }
}
