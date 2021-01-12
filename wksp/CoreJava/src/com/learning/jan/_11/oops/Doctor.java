package com.learning.jan._11.oops;

public class Doctor {
    private String name;
    private String email;
    private int doctorid;
    private int phone;
    private String speciality;
    private String address;

    void setDetails(String n, String e , int did, int ph, String sp, String add){

        name = n;
        email = e;
        doctorid = did;
        phone = ph;
        speciality = sp;
        address = add;

    }

    void display(){

        System.out.println("Here are the doctor details : \nName : " + name + "\nemail : " + email + "\nDoctor ID: "+ doctorid + "\nPhone Number : " + phone + "\nSpeciality : " + speciality + "\nAddress is : " + address);
    }
}
