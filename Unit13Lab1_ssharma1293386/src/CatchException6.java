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
public class CatchException6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println();
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter the integer dividend and divisor "
                        + "seperated by a space.");

                System.out.println(divide(input.nextInt(), input.nextInt()));
                //if exception is thrown, the break statement is not executed. 
                break;
            } catch (DivideByZeroException e) {
                System.out.println("Invalid value. Try again.");

            }
        }

    }

    public static int divide(int x, int y) throws DivideByZeroException {

        int result = 0;
        try {
            result = x / y;
        } catch (ArithmeticException e) {
            throw new DivideByZeroException();
        }
        return result;
    }

}
