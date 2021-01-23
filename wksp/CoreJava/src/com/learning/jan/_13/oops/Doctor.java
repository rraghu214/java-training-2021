package com.learning.jan._13.oops;

public class Doctor {

    private String doctorid;
    private String name;
    private String email;
    private int phone;
    private String speciality;
    private boolean isSurgeon;
    private Patient patient;

    //Default Constructor
    public Doctor(){

    }

    //Parameterized Constructor.
    public Doctor(String doctorid, String name, String email, int phone, String speciality, boolean isSurgeon){
        this.doctorid = doctorid;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.speciality = speciality;
        this.isSurgeon = isSurgeon;

    }

    // Generating the getters and setters.
    public String getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public boolean isSurgeon() {
        return isSurgeon;
    }

    public void setSurgeon(boolean surgeon) {
        isSurgeon = surgeon;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorid='" + doctorid + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", speciality='" + speciality + '\'' +
                ", isSurgeon=" + isSurgeon +
                ", patient=" + patient +
                '}';
    }
}
