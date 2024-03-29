package org.experis.javaBank;

import java.util.Random;

public class Conto {
    private int accountNumber;
    private String name;
    private double balance;

    public Conto(String name) {
        Random rand = new Random();
        this.accountNumber = rand.nextInt(1000) + 1;
        this.name = name;
        this.balance = 0;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public boolean withdraw(double value) {
        if(this.balance - value >= 0){
            this.balance -= value;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
