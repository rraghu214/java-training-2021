package com.learning.jan._20.Interfaces;

public class CreditCard implements Payment,Notification{

    @Override
    public void pay() {
        System.out.println("Credit Card Payment..");
    }

    @Override
    public void sendMessage(String str) {
        System.out.println("Credit card payment successful.");

    }
}
