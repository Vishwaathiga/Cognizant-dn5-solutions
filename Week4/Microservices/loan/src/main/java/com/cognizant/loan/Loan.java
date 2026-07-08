package com.cognizant.loan;

public class Loan {

    private String number;
    private String type;
    private double loan;
    private double emi;
    private int tenure;

    // Constructor
    public Loan(String number, String type,
                double loan, double emi, int tenure) {
        this.number = number;
        this.type = type;
        this.loan = loan;
        this.emi = emi;
        this.tenure = tenure;
    }

    // Getters
    public String getNumber() { return number; }
    public String getType() { return type; }
    public double getLoan() { return loan; }
    public double getEmi() { return emi; }
    public int getTenure() { return tenure; }

    // Setters
    public void setNumber(String number) { this.number = number; }
    public void setType(String type) { this.type = type; }
    public void setLoan(double loan) { this.loan = loan; }
    public void setEmi(double emi) { this.emi = emi; }
    public void setTenure(int tenure) { this.tenure = tenure; }
}