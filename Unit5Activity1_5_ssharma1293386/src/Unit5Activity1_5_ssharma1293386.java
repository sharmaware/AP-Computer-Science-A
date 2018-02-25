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
public class Unit5Activity1_5_ssharma1293386 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers separated by spaces:");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double division = x / y;
        int round0 = (int) (division + 0.5);
        double round1 = Math.floor(division * Math.pow(10, 1) + 0.5) / Math.pow(10, 1);
        double round2 = Math.floor(division * Math.pow(10, 2) + 0.5) / Math.pow(10, 2);
        double round3 = Math.floor(division * Math.pow(10, 3) + 0.5) / Math.pow(10, 3);

        System.out.println("Integer: " + round0);
        System.out.println("Rounded to one decimal place: " + round1);
        System.out.println("Rounded to two decimal places: " + round2);
        System.out.println("Rounded to three decimal places: " + round3);

    }

}
