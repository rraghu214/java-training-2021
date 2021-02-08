package com.learning.jan._28.threads;

public class ThreadDemo {
    public static void main(String[] args) {
        //System.out.println(Thread.currentThread().getName());

        MyThread t1 = new MyThread();
        t1.setName("T1"); // without this it gives : Thread-0 in run method
        t1.setPriority(10);
        t1.start();
        //t1.run(); // without the above 2, it prints only "main"

    }
}
