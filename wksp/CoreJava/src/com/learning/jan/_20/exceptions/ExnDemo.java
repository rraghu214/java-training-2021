package com.learning.jan._20.exceptions;

public class ExnDemo {

    public static void sqRoot(int no) throws Exception {

        if(no < 0){
            throw new Exception();
        }
        System.out.println(Math.sqrt(no));

    }

    public static void main(String[] args) {


        try {
            sqRoot(-20);
        } catch (Exception e) {

            System.out.println("############");
            System.out.println("Error Message: " + e.getMessage());
            System.out.println("############");
            System.out.println("Cause: " + e.getCause());
            System.out.println("############");
            System.out.println("Error Message: " + e.getMessage());
            System.out.println("############");
            System.out.println("Stack Trace : " + e.getStackTrace());
            System.out.println("############");
            System.out.println("Print Stack trace : " );
            e.printStackTrace();
            System.out.println("############");
        }
        finally{
            System.out.println("At the finally block of SqRoot method call!!");}


        String s1 = "ASaa";
        String s2 [] = {"a","b","c","d"};

        try{
            System.out.println(s1.toLowerCase());
            System.out.println(s2[2]);

        }
        catch(NullPointerException e)
        {
            System.out.println("It is a null pointer exception : " + e);

        }
        catch(Exception e){
            System.out.println("Error is : "+ e);
        }

    }

}

