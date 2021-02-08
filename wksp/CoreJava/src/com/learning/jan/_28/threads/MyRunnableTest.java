package com.learning.jan._28.threads;

public class MyRunnableTest {

    public static void main(String[] args) {
//        MyRunnable t1 = new MyRunnable();
//        r1.setName("R1");

        Thread t1 = new Thread(new MyRunnable());
        t1.setName("R1");

        Thread t2 = new Thread(new MyRunnable());
        t2.setName("R2");

        t1.start();
        t2.start();
    }
}
