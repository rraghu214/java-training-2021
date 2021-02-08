package com.learning.jan._20.Interfaces;

public class PaymentTest {

    public static void paymentMode(Payment payment)
    { //
        payment.pay();
    }

    public static void p1(Notification n1)
    {
        System.out.println("Here");
        n1.sendMessage("Anonymous inner class");
        System.out.println("There");
    }

    public static void main(String[] args) {

        paymentMode(new CreditCard());// With reference to the parent class, pass the reference object of the child class.
        paymentMode(new PayTm());


        //Anonymous inner class
        p1(new Notification(){

            @Override
            public void sendMessage(String str ) {
                System.out.println(str);
                System.out.println("Hello!");

            }
        });

        System.out.println("###############");
        // Because the credit card and PayTm implements the Payment interface. We are going to do same as we did
        // with inheritance. The reference of the interface can point to object of any class that implements the interface.
        //At runtime based on whose object is being passed. It calls the pay method of that class.

        Payment c1 = new CreditCard();
        c1.pay();

        CreditCard c2 = new CreditCard();
        c2.pay();

    }
}
