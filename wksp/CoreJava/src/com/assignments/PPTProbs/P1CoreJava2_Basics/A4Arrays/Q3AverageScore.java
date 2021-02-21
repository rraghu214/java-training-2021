package com.assignments.PPTProbs.P1CoreJava2_Basics.A4Arrays;

import java.util.Scanner;

/**
 * Write a program to take names of 5 students and marks of 3 subjects for each student as input from the user.
 * Display the average marks of all the student with their names.
 * Print the name of the student with highest average. Output as follows :
 * Name		Average
 * Riya			85
 * Suman		98
 * Rohit		97
 */
public class Q3AverageScore {

    public static void main(String[] args) {
        int entities = 5;
        int subjects = 3;
        String [] name = new String[entities];
        double [] score = new double[subjects];
        double[] avg_score = new double[entities];


        Scanner sc = new Scanner(System.in);

        for(int i=0; i < entities; i++){
            System.out.println("Name of Student #" + (i+1));
            name[i]= sc.next();
            double total = 0;
            for(int j=0; j < subjects; j++){
                System.out.println("Subject " + (j+1) + " score :");
                score[j] = sc.nextDouble();
                total = total + score[j];
            }
            avg_score[i] = total/subjects;
        }
        System.out.println("Name    Average");
        for(int k=0; k < entities; k++){
            System.out.println(name[k] + "   " +avg_score[k]);
        }
    }
}
