/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class CheckingsAccount extends Account {

    private double OverdraftLimit;

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (this.getBalance() - amount >= 0)) {
            this.addBalance(-1 * amount);
            if (amount > 0 && (this.getBalance() + OverdraftLimit - amount >= 0)) {
                this.setBalance(0);
                this.OverdraftLimit = amount - this.getBalance();

            }
        }
    }

    @Override
    public void deposit(double deposit) {
        if (deposit > 0) {
            this.addBalance(deposit);
        }
    }

    public void setOverdraftLimit(double limit) {
        this.OverdraftLimit = limit;
    }

    public double getOverDraftLimit() {
        return this.OverdraftLimit;
    }
}
