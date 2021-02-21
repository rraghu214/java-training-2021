package com.assignments.PPTProbs.P2CoreJava3_OOPS.A4MiniProject;

public class Customer {
    private String billAdd;
    InvoiceGenerator inv;
    private double total =0;

    Customer(String add){
        this.billAdd = add;
    }

    @Override
    public String toString() {
        return ("\t\t\t\t\t\tInvoice\n" +
                 billAdd );
    }

    public void PrintInvoice(InvoiceGenerator ...igen) {
        System.out.println("Description\t\t\tPrice\t\tQuantity\tTotal");
        for (int i = 0; i < igen.length; i++) {
            inv = igen[i];
            total = total+ (inv.getPrice() * inv.getQuantity());
            System.out.println(inv.getDesc() + "\t\t\t" + inv.getPrice() + "\t\t" + inv.getQuantity() + "\t\t\t" + (inv.getPrice() * inv.getQuantity()));
        }
        System.out.println("\n\nAMOUNT DUE : $" + total);
    }
}
