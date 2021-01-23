package com.practise.basics;

/**
 * https://youtu.be/Yo5RDg6qnrE?list=PLGwb7xZHg-oOKDMYoi-1ILNBGlorUU460
 */
public class PatternPrint {

    public static void main(String[] args) {
        int num = 1234;
        int original_num = num;

        for (int i = 1; i <=4; i++){
            for (int j = 1; j <=i; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }

        System.out.println("*****");

        for (int i = 1; i <=4; i++){
            for (int j = 4; j >=1; j--){
                if (j <= i){
                    //System.out.print(" ");
                    System.out.print(" " +j);
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println("  ");

        }

        System.out.println("***From Telusko***");

        for (int i = 1; i <=4; i++)
        {
            for (int k = 3;  k >= i; k--)
            {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }

//        System.out.println("      1");
//        System.out.println("    2 1");
//        System.out.println("  3 2 1");
//        System.out.println("4 3 2 1");
//
//        System.out.println("   1");
//        System.out.println("  21");
//        System.out.println(" 321");
//        System.out.println("4321");

    }
}
