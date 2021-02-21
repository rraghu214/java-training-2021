package com.assignments.PPTProbs.P2CoreJava3_OOPS.A4MiniProject;

public class InvoiceGenerator {

//    private String billAdd;
    private String desc;
    private double price;
    private int quantity;
    private double total;
    private Customer c1;

    public InvoiceGenerator(String desc, double price, int quantity, Customer c1) {
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;
        this.c1 = c1;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

}
