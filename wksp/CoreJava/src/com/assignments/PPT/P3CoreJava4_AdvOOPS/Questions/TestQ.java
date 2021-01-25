package com.assignments.PPT.P3CoreJava4_AdvOOPS.Questions;

import java.util.Scanner;

public class TestQ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = "What is the capital of India?";
        String answer = "New Delhi";

        Question q1 = new Question();
        q1.setText(text);
        q1.setAnswer(answer);

        q1.display();
        System.out.println();
        System.out.println("Type the correct answer:");

        String ans = sc.nextLine();

        //String ans = "New Delhi";

        System.out.println(q1.checkAnswer(ans));
        System.out.println();


        ChoiceQuestion q2 = new ChoiceQuestion();
        q2.setText("Who is the current PM of India?");
        q2.addChoice("Modi", true);
        q2.addChoice("Nehru", false);
        q2.addChoice("Manmohan Singh", false);
        q2.addChoice("Nobody", false);

        q2.display();
        System.out.println();

        System.out.println(q2.checkAnswer("Modi"));
        System.out.println();
        System.out.println(q2.checkAnswer("Nehru"));
        System.out.println();

    }
}
