
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author saarthaksharma
 */

 /* bubbleSort has 0(n^2) time complexity because it has two for loops. 
    Each of which directly depend on the size of n.
    The inner loop runs first n-1 times and then n-2 times until it reaches n-n.
    The sum of (n-1) + (n-2) + (n-3)... is modeled by a quadratic equation. 
*/

public class BubbleSort {

    public static void main(String[] args) {
     
        //testing bubbleSort
        int[] array2 = {1000, 7, 8, 3, 6, 3, 9, 5, 2, 34, 76, 98, 36, 82, 51, 1, 6, 34, 865};
        bubbleSort(array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("%s ", array2[i]);
        }
    }

    public static void bubbleSort(int[] array) {
        for (int n = array.length - 1; n > 0; n--) {
            for (int i = 1; i <= n; i++) {
                if (array[i - 1] > array[i]) {
                    int temporary = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temporary;
                }
            }
        }
    }
}
