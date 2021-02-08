package com.learning.jan._28.threads;

/*
1. extends thread
 */

public class MyThread extends Thread{

    // to perform some tasks. The thread's lifecycle is only within the run method.
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " in run method");
        //System.out.println(Thread.currentThread() + " in run method");
        //super.run();
    }
}
