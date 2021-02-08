package com.learning.jan._28.threads;

public class MyRunnable  implements Runnable{

    @Override
    public void run() {
        for (int i=1;i<=5;i++) {
            System.out.println(Thread.currentThread().getName() +
                    " i " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+
                " in run method ends");

    }
}
