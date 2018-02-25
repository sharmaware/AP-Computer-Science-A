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
public class Unit5Lab3_ssharma1293386 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Getting user input for numbers to find maximum and minimum of
        System.out.print("First set: Please enter 3 numbers separated by spaces: ");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();
        System.out.print("Second set: Please enter 3  numbers separated by spaces: ");
        double d = input.nextInt();
        double e = input.nextInt();
        double f = input.nextInt();
        System.out.print("Third set: Please enter 3  additional numbers separated by spaces: ");
        double g = input.nextInt();
        double h = input.nextInt();
        double i = input.nextInt();

        double Set1min = minimum(a, b, c);
        double Set1max = maximum(a, b, c);

        double Set2min = minimum(d, e, f);
        double Set2max = maximum(d, e, f);

        double Set3min = minimum(g, h, i);
        double Set3max = maximum(g, h, i);

        //Printing maximum and mins of each set
        System.out.println();
        System.out.println("For the first set of data:");
        System.out.println("maximum = " + Set1max);
        System.out.println("minimum = " + Set1min);
        System.out.println();
        System.out.println("For the second set of data:");
        System.out.println("maximum = " + Set2max);
        System.out.println("minimum = " + Set2min);
        System.out.println();
        System.out.println("For the third set of data:");
        System.out.println("maximum = " + Set3max);
        System.out.println("minimum = " + Set3min);
        System.out.println();

    }

    public static double minimum(double x, double y, double z) {
        double minimum = Math.min(x, y);
        minimum = Math.min(minimum, z);
        return minimum;
    }

    public static double maximum(double x, double y, double z) {
        double maximum = Math.max(x, y);
        maximum = Math.max(maximum, z);
        return maximum;
    }

}
