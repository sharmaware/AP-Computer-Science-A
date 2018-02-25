/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author saarthaksharma
 */
public class Unit5Lab1_ssharma1293386 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Which of the following formulas would you like to use?");
        System.out.println("1. Future Value of a Single Sum");
        System.out.println("2. Present Value of a Single Sum");
        System.out.println("3. Future Value of an Annuity");
        int FormulaUsed = input.nextInt();

        double p;
        double n;
        double i;
        double f;
        double a;
        double answer;

        if (FormulaUsed == 1) {
            System.out.println("Enter principal:");
            System.out.println("Enter number of years:");
            System.out.println("Enter interest rate");
            p = input.nextDouble();
            //the 12 is added because it is compounded monthly
            n = input.nextDouble() * 12;
            i = input.nextDouble() / (100 * 12);
            answer = futureValue(i, p, n);
            System.out.println("The Future Value is " + answer);
        }
        if (FormulaUsed == 2) {
            System.out.println("Enter future value:");
            System.out.println("Enter number of years:");
            System.out.println("Enter interest rate:");
            f = input.nextDouble();
            n = input.nextDouble() * 12;
            i = input.nextDouble() / (100 * 12);
            answer = presentValue(f, n, i);
            System.out.println("The Present Value is " + answer);
        }
        if (FormulaUsed == 3) {
            System.out.println("Enter future value:");
            System.out.println("Enter number of years:");
            System.out.println("Enter interest rate:");
            a = input.nextDouble();
            n = input.nextDouble() * 12;
            i = input.nextDouble() / (100 * 12);
            answer = futureAnnuity(a, i, n);
            System.out.println("The Future Annuity is " + answer);
        }

    }

    public static double futureValue(double i, double p, double n) {
        // i is the percent per year
        //p is the principal
        // n is the number of years

        double futurevalue = p * Math.pow((1 + i), n);
        return futurevalue;
    }

    public static double presentValue(double f, double n, double i) {
        // i is the percent per year
        // n is the number of years
        // f is the future value

        double presentvalue = f / (Math.pow((1 + i), n));
        return presentvalue;
    }

    public static double futureAnnuity(double a, double i, double n) {

        double futureannuity = a * ((Math.pow(1 + i, n) - 1) / i);
        return futureannuity;

    }
}
