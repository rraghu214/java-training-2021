package com.assignments.A1;

import java.util.Scanner;

public class Q3DistConvertor {

    public static void main(String args []){
        System.out.println("Welcome to Distance Convertor!");
        char complete = 'N';
        Scanner sc = new Scanner(System.in);

        while(complete  == 'N'){

            System.out.println("Enter the distance between 2 cities in kilometers : ");
            double dist = sc.nextDouble();

            System.out.println("Distance between these 2 cities in kms: " + dist + " . \nDistance in Meters is : " + dist * 1000 + " m. \nDistance in feet is : " + dist * 3280.84 + " feet.");

            System.out.println("Do you want to continue? Y / N");

            char cont = sc.next().charAt(0);

            if (cont == 'N' || cont == 'n')
                complete = 'Y';



        }
    }
}
