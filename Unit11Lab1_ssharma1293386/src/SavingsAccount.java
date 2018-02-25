/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class SavingsAccount extends Account {

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (this.getBalance() - amount >= 0)) {
            this.addBalance(-1 * amount);
        }
    }

    @Override
    public void deposit(double deposit) {
        if (deposit > 0) {
            this.addBalance(deposit);
        }
    }
}
