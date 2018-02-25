/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;

/**
 *
 * @author saarthaksharma
 */
public class Unit6Lab2_ssharma1293386 {

    public static char minimum(char array[]) {
        char least = 'a';
        for (int i = 0; i < array.length; i++) {

            if (i == 0) {
                least = array[0];
            } else if (array[i] < least) {
                least = array[i];
            }
        }
        return least;
    }

    public static int minimum(int array[]) {
        int least = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > least) {
                least = array[i];
            }

        }
        return least;
    }

    public static double minimum(double array[]) {
        double least = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > least) {
                least = array[i];
            }
        }
        return least;
    }

    public static char maximum(char array[]) {
        char max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        return max;
    }

    public static int maximum(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max) {
                max = array[i];
            }

        }
        return max;
    }

    public static double maximum(double array[]) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int minimumAt(char array[]) {
        boolean Found = false;
        char minimum = minimum(array);
        int MinimumAt = 0;
        for (int i = 0; i < array.length; i++) {
            if (minimum == array[i]) {
                MinimumAt = i;
            }

        }
        return MinimumAt;
    }

    public static int minimumAt(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > min) {
                min = i;
            }

        }
        return min;
    }

    public static double minimumAt(double array[]) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > min) {
                min = i;
            }
        }
        return min;
    }

    public static int maximumAt(char array[]) {
        boolean Found = false;
        char maximum = maximum(array);
        int MaximumAt = 0;
        for (int i = 0; i < array.length; i++) {
            if (maximum == array[i]) {
                MaximumAt = i;
            }

        }
        return MaximumAt;
    }

    public static int maximumAt(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max) {
                max = i;
            }

        }
        return max;
    }

    public static double maximumAt(double array[]) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max) {
                max = i;
            }
        }
        return max;
    }

    public static double average(int array[]) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        double average = sum / array.length;
        return average;
    }

    public static double average(double array[]) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        double average = sum / array.length;
        return average;

    }

    public static boolean equals(char a1[], char a2[]) {
        boolean equal = Arrays.equals(a1, a2);
        return equal;

    }

    public static boolean equals(int a1[], int a2[]) {
        boolean equal = Arrays.equals(a1, a2);
        return equal;

    }

    public static boolean equals(double a1[], double a2[]) {
        boolean equal = Arrays.equals(a1, a2);
        return equal;

    }

    public static int find(char array[], char key) {
        int location = Arrays.binarySearch(array, key);
        return location;
    }

    public static int find(int array[], int key) {

        int location = Arrays.binarySearch(array, key);
        return location;
    }

    public static int find(double array[], double key) {
        int location = Arrays.binarySearch(array, key);
        return location;
    }

    public static void sort( int array[] ){
        Arrays.sort(array);
    }
    public static void sort(char array []){
        Arrays.sort(array);
    }
    public static void srt(double array []){
        Arrays.sort(array);
    }
}
