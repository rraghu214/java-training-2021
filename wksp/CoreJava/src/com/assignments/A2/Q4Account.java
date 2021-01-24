package com.assignments.A2;

public class Q4Account {
    private String id;
    private String name;
    private int balance = 0;

    public Q4Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Q4Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    //Methods

    public int Credit(int amount){
        this.balance = amount + getBalance();
        return this.balance;
    }

    public int Debit(int amount){
        //this.balance = (getBalance()) - amount ;
        if (amount <= (getBalance())){
            this.balance =  (getBalance()) -amount;
        }
        else {
            System.out.println("Amount Exceeded Balance");

        }
        return this.balance;
    }

    public void transferTo(Q4Account another , int amount){
        Debit(amount);
        another.Credit(amount);
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance;
    }
}
