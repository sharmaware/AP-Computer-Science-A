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
public class Unit4Lab2_ssharma1293386 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many asterisks would you like?");
        int n = input.nextInt();
        for (int j = n; j >= 1; j--) {
            for (int i = 1; i <= j; i++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
