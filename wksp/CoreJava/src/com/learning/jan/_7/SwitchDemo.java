package com.learning.jan._7;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Toss the coin");
        int toss = sc.nextInt();

        switch(toss){
            case 1: System.out.println("Player 1 won the toss");
                break;
            case 2: System.out.println("Player 2 won the toss");
                break;
            default: System.out.println("Toss Again");
        }

    }
}

