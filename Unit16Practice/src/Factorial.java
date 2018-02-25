/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author saarthaksharma
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        /*System.out.println(Integer.MAX_VALUE);
        Scanner input = new Scanner(System.in);
        System.out.printf("Factorial of: ");
        int n = input.nextInt();
        for(int i = n; i >=1; i--){
            
            System.out.println(i + " " + recursiveFactorial(i));
        } */
        
        /*int[] x = { 9, 2, 4, 7, 3, 7, 10 };
		System.out.println(Arrays.toString(x));
 
		int low = 0;
		int high = x.length - 1;
 
		quickSort(x, low, high);
		System.out.println(Arrays.toString(x));
        
                */
                /*System.out.printf("%nIterative%n");
        for(int i = n; i >=1; i--){
            System.out.println(i + " " + iterativeFactorial(i));
        }
        
    }*/
    
    public static void main(String [] args){
        List<String> e = new ArrayList<>();
        ArrayList<Integer> f = new ArrayList<>();
        //f.add(1);
        //e.add(1);
        ArrayList<Integer> r = (ArrayList<Integer>)f.clone();
        System.out.println("arraylist f");
        for(int i: f){
            System.out.println(i);
        }
        System.out.println("arraylist r");
        for(int i: r){
            System.out.println(i);
        }
        System.out.println(e.equals(f));
        System.out.println(f.equals(r));
    
    }
    public static BigInteger recursiveFactorial (int n){
        if(n == 1){
            return new BigInteger(String.valueOf(1));
        }
        else{
            BigInteger original = new BigInteger(String.valueOf(n));
            return original.multiply(recursiveFactorial(n-1));
        }
    }
    public static BigInteger iterativeFactorial(int n){
        BigInteger factorial = BigInteger.ONE;
        for(int i = n; i >= 1; i--){
            factorial.multiply(new BigInteger(String.valueOf(i)));
        }
        return factorial;
    }
    
	
		
	
 
	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
}
}
