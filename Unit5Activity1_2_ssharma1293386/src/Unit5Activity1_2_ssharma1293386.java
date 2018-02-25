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
public class Unit5Activity1_2_ssharma1293386 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your angle in degrees: ");
        double UserDegree = input.nextDouble();

        System.out.println("Angle in degrees: " + UserDegree);
        System.out.println("Angle in radians: " + Math.toRadians(UserDegree));
        System.out.println("Sin(" + UserDegree + ") = " + Math.sin(Math.toRadians(UserDegree)));
        System.out.println("Cos(" + UserDegree + ") = " + Math.cos(Math.toRadians(UserDegree)));
        System.out.println("Tan(" + UserDegree + ") = " + Math.tan(Math.toRadians(UserDegree)));

    }
}
