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
public class Unit5Lab3_2_ssharma1293386 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Student one score: ");
        System.out.println("Student two score: ");
        System.out.println("Student three score: ");

        double Student1 = input.nextInt();
        double Student2 = input.nextInt();
        double Student3 = input.nextInt();

        System.out.println("Student 1 has a grade of " + grade(Math.floor(Student1)));
        System.out.println("Student 2 has a grade of " + grade(Math.floor(Student2)));
        System.out.println("Student 3 has a grade of " + grade(Math.floor(Student3)));

        double average = (Math.floor(average(Student1, Student2, Student3) * 10)) / 10;
        System.out.println("The average score was " + average);
        System.out.println("The average grade was " + grade(average));
    }

    public static String grade(double score) {
        String grade = "o";
        if (score <= 100 && score >= 90) {
            grade = "A";
        }
        if (score <= 89 && score >= 80) {
            grade = "B";
        }
        if (score <= 79 && score >= 70) {
            grade = "C";
        }
        if (score <= 69 && score >= 65) {
            grade = "D";
        }
        if (score <= 64) {
            grade = "F";
        }
        return grade;
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

    public static double average(double x, double y, double z) {
        double average = (x + y + z) / 3;
        average = Math.floor(average * 10) / 10;
        return average;
    }

}
