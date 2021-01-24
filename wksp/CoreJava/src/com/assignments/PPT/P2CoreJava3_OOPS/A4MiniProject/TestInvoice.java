package com.assignments.PPT.P2CoreJava3_OOPS.A4MiniProject;

/**
 * The task of our sample program is to print out an invoice.
 *
 * An invoice describes the charges for a set of products in certain quantities.
 * (We omit complexities such as dates, taxes, and invoice and customer numbers.)
 * The program simply prints the billing address, all line items, and the amount due.
 * Each line item contains the description and unit price of a product, the quantity ordered, and the total price.
 */

public class TestInvoice {

    public static void main(String[] args) {
        Customer c1 = new Customer("Sam's Small Appliances\n" +
                "100 Main Street Anytown,\n" +
                "CA 98765\n");
        InvoiceGenerator i1 = new InvoiceGenerator("Toaster ",29.95,3,c1);
        InvoiceGenerator i2 = new InvoiceGenerator("Hair dryer",24.95,1,c1);
        InvoiceGenerator i3 = new InvoiceGenerator("Car vacuum",19.99,2,c1);

        System.out.println(c1);
        c1.PrintInvoice(i1,i2,i3);
    }

}
