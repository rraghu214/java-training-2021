package com.learning.jan._29.threads;

public class ThreadMessenger extends Thread{

    private static Messenger messenger;
    private String message;

    public ThreadMessenger(String name, Messenger messenger, String message) {
        super(name);
        this.message = message;
        this.messenger = messenger;

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" in run starts");
        messenger.message(message);
        System.out.println(Thread.currentThread().getName() +" in run ends");
    }


    public static void main(String[] args) {

        Messenger messenger = new Messenger();
        Messenger messenger1 = new Messenger();

        //Shared resource. 2 threads are accessing the same resource "messenger"
        ThreadMessenger t1 = new ThreadMessenger("T1",messenger,"Hello World");
        ThreadMessenger t3 = new ThreadMessenger("T3",messenger1,"T3-Lets unlearn to learn");
        ThreadMessenger t2 = new ThreadMessenger("T2",messenger,"Lets unlearn to learn");



        t1.start();
        t2.start();
        t3.start();
    }
}
