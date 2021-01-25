package com.assignments.PPT.P3CoreJava4_AdvOOPS.Questions;

public class Question {

    private String text; //Question
    private String answer; // Correct Answer

    public Question() {
    }

    public Question(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void display(){
        System.out.println(this.text);
    }

    public boolean checkAnswer(String ans){
        return (this.answer).equals(ans);
    }
}
