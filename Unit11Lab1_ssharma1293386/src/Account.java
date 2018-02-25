/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public abstract class Account {

    private int number;
    private double balance;
    private double InterestRate;
    private Date date;

    public abstract void deposit(double deposit);

    public abstract void withdraw(double amount);

    public double getBalance() {
        return this.balance;

    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    protected void addBalance(double change) {
        this.balance += change;
    }

    public int getNumber() {
        return number;
    }

    public double getInterestRate() {
        return InterestRate;
    }

    public Date getDate() {
        return this.date;
    }
}
