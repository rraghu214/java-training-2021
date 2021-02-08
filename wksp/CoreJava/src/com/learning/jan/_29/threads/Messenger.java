package com.learning.jan._29.threads;

public class Messenger {

    //public void message(String str)
    //synchronized
    public synchronized void message(String str)
    {
        System.out.println(Thread.currentThread().getName() +" in message starts");
        System.out.print("[");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(str+"]");
        System.out.println(Thread.currentThread().getName() +" in maesage ends");
    }
    public void show()
    {
        System.out.println(Thread.currentThread().getName() +" in show starts");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() +" in show ends");
    }
}
