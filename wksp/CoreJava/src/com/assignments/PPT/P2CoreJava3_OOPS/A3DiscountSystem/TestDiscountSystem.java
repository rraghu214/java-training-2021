package com.assignments.PPT.P2CoreJava3_OOPS.A3DiscountSystem;

public class TestDiscountSystem {

    public static void main(String[] args) {
        Customer c1 = new Customer("C1");
        c1.setMember(true);
        c1.setMemberType("GOLD");
        System.out.println(c1);

        // My First Visit details.

        Visit v1 = new Visit("C1", c1);
        v1.setProductExpense(100);
        v1.setServiceExpense(100);
        v1.getTotalExpense(c1);

        System.out.println(v1);
        System.out.println();


        // 2nd Customer and his first visit

        Customer c2 = new Customer("C2");
        c2.setMember(true);
        c2.setMemberType("SILVER");
        System.out.println(c2);

        // My First Visit details.

        Visit v2 = new Visit("C2", c2);
        v2.setProductExpense(100);
        v2.setServiceExpense(100);
        v2.getTotalExpense(c2);

        System.out.println(v2);
        System.out.println();


        // 3rd Customer and his first visit

        Customer c3 = new Customer("C3");
        c3.setMember(true);
        c3.setMemberType("PREMIUM");
        System.out.println(c3);

        // My First Visit details.

        Visit v3 = new Visit("C3", c3);
        v3.setProductExpense(100);
        v3.setServiceExpense(100);
        v3.getTotalExpense(c3);

        System.out.println(v3);
        System.out.println();

        // 4th Customer and his first visit

        Customer c4 = new Customer("C4");
        c3.setMember(false);
        //c3.setMemberType("PREMIUM");
        System.out.println(c4);

        // My First Visit details.

        Visit v4 = new Visit("C4", c4);
        v4.setProductExpense(100);
        v4.setServiceExpense(100);
        v4.getTotalExpense(c4);

        System.out.println(v4);
        System.out.println();


    }
}
