package com.practise.basics;

/**
 * https://youtu.be/14uWAbHDrBY?list=PLGwb7xZHg-oOKDMYoi-1ILNBGlorUU460
 */
public class palindrome {

    public static void main(String[] args) {


        int num = 1221;
        int original_num = num;
        int new_num = 0;

        while(num > 0 ) {
        int r = num %10;
        num = num /10;

        new_num = new_num *10 + r;
//        System.out.println("r is  "+ r);
//        System.out.println("new_num "+ new_num);
//        System.out.println("*****");
        }

        if (original_num == new_num){
            System.out.println("Number " + num + " is Palindrome");
        }
        else{
            System.out.println("Number " + num + " is NOT Palindrome");
        }
    }
}
