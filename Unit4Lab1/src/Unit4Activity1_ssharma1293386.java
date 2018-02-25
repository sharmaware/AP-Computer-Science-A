
import java.util.Scanner;

public class Unit4Activity1_ssharma1293386 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many problems would you like to solve?");
        int n = input.nextInt();
        int correct = 0;
        long TimeBegin = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
        // Generate 2 random numbers that will be multiplied int number1 = (int) ( Math.random() * 10 );
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
        // Prompt user to input answer
            System.out.print("What is " + number1 + " * " + number2 + "? ");
            int answer = input.nextInt();
            // Grade the answer
            if ((number1 * number2) == answer) {
                System.out.println("Congratulations...you are correct!");
                correct++;
            } else {
                System.out.println("Sorry, the answer was " + (number1 * number2));
            }
            if (i == n) {
                int PercentCorrect = (int) ((correct / ((double) n)) * 100);
                System.out.println("You got " + PercentCorrect + "% correct.");
                long Time = (System.currentTimeMillis() - TimeBegin) / 1000;
                if (Time == 1) {
                    System.out.println("It took " + Time + " second to complete this quiz.");
                } else {
                    System.out.println("It took " + Time + " seconds to complete this quiz.");
                }
            }
        }
    }
}
