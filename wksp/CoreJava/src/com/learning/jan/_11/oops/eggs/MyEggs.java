package com.learning.jan._11.oops.eggs;

public class MyEggs {
    public static void main(String[] args){
        int eggs = 49;

        EggCarton e1 = new EggCarton();
        e1.setNoOfEggs(eggs);

        //System.out.println(e1);
        int cart = e1.cartons();

        System.out.println(cart);
    }
}
