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
public class Unit6Lab1_ssharma1293386 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("This program will find the frequency of each number between 1 and 50 that is entered.");
        System.out.println("How many integers would you like to enter?");
        int SizeofArray = input.nextInt();
        System.out.println("Enter your numbers");
        int UserNumbers[] = new int[SizeofArray];
        int CountedNumbers[][] = new int[50][2];

//Putting user input into array
        for (int i = 0; i < UserNumbers.length; i++) {
            UserNumbers[i] = input.nextInt();
        }

        for (int i = 0; i < CountedNumbers.length; i++) {
            CountedNumbers[i][0] = i;

        }

//Counting frequency of each number
        for (int i = 0; i < UserNumbers.length; i++) {
            int j = UserNumbers[i];
            CountedNumbers[j][1] += 1;
        }

        for (int i = 1; i < 50; i++) {
            if (CountedNumbers[i][1] != 0) {
                System.out.printf("%s occurs %s times.", CountedNumbers[i][0], CountedNumbers[i][1]);
                System.out.println();
            }

        }

    }
}
