package com.cognizant.account;

public class Account {

    private String number;
    private String type;
    private double balance;

    // Constructor
    public Account(String number, String type, double balance) {
        this.number = number;
        this.type = type;
        this.balance = balance;
    }

    // Getters
    public String getNumber() { return number; }
    public String getType() { return type; }
    public double getBalance() { return balance; }

    // Setters
    public void setNumber(String number) { this.number = number; }
    public void setType(String type) { this.type = type; }
    public void setBalance(double balance) { this.balance = balance; }
}