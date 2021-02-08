package com.learning.jan._28.jdbc;

public class Customer {

    private int cid;
    private String cname;
    private String city;
    private int age;
    public Customer()
    {
    }
    public Customer(int cid, String cname, String city, int age) {
        this.cid = cid;
        this.cname = cname;
        this.city = city;
        this.age = age;
    }
    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}



