package com.assignments.PPTProbs.P3CoreJava4_AdvOOPS.Questions;

public class ChoiceQuestion extends Question{
    //Represents MCQ

    private String [] choices = new String[4];
    private int i;

    public void addChoice(String choice, boolean correctants){
        choices[i]= choice;
        i++;
        if(correctants)
            setAnswer(choice);
    }

    @Override
    public void display() {
        super.display();
        for (int i = 0 ; i<this.choices.length;i++){
            System.out.println((i+1)+". "+choices[i]);
        }
    }
}
