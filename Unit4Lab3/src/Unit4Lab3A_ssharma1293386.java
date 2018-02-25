
import java.util.Scanner;
/**
 *
 * @author saarthaksharma
 */
public class Unit4Lab3A_ssharma1293386 {
    public static void main(String [] args) { 
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter 10 integers. The program will find the maximum and minimum values.");
        int counter = 1;
        // Assign first number to smallest and largest
        System.out.print("Enter your integers seperated by a blank space: ");
        int number = input.nextInt();
        int smallest = number;
        int largest = number;
        // Check to see if other numbers are smaller or larger
        while (counter < 10) {
           // System.out.print("Enter your integer: ");
            
            number = input.nextInt();
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
            counter++;
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        
    }
}
