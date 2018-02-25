/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class AccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CheckingsAccount ca = new CheckingsAccount();
        SavingsAccount sa = new SavingsAccount();

        ca.deposit(2);
        System.out.printf("Balance of Checkings Account is %s%n", ca.getBalance());
        ca.deposit(5.78);
        System.out.printf("Balance of Checkings Account is %s%n", ca.getBalance());
        ca.withdraw(4.56);
        System.out.printf("Balance of Checkings Account is %s%n", ca.getBalance());
        ca.withdraw(3.45);
        System.out.printf("Balance of Checkings Account is %s%n", ca.getBalance());

        sa.deposit(345.67);
        System.out.printf("Balance of Savings Account is %s%n", ca.getBalance());
        sa.deposit(786.45);
        System.out.printf("Balance of Savings Account is %s%n", ca.getBalance());
        sa.withdraw(345.67);
        System.out.printf("Balance of Savings Account is %s%n", ca.getBalance());
        sa.withdraw(786.45);
        System.out.printf("Balance of Savings Account is %s%n", ca.getBalance());

    }

}
