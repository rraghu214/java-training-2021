package com.learning.jan._20.Interfaces;

public class PayTm implements Payment, Notification{


    @Override
    public void pay() {
        System.out.println("PayTm Logic..");
    }

    @Override
    public void sendMessage(String str) {

    }
}
