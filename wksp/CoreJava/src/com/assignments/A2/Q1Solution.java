package com.assignments.A2;

import java.util.Scanner;
public class Q1Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String text = sc.nextLine();
        int n = text.length();
        int count[] = new int[n];
        for(int i=0; i<n; i++)
        {
            int k = text.indexOf(text.charAt(i));
            if (k != i){
                count[k] += 1;
            }
            else{
                count[i] = 1;
            }
        }
        for(int i=0; i<count.length; i++){
            int k = text.indexOf(text.charAt(i));
            if((k==i)&& (count[i]>1)){
                System.out.println(text.charAt(i) + ":" + count[i]);}
        }
    }
}