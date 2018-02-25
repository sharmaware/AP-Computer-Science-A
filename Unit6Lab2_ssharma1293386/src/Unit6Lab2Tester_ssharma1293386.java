/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class Unit6Lab2Tester_ssharma1293386 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char arrayChar[] = {'a', 'b', 'c', 'd', 'e', 'f'}; 
        int arrayInt[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double arrayDouble [] = { 1.23, 4.56, 3.56, 3.65, 76.3445, 5.00};
             
        System.out.println(Unit6Lab2_ssharma1293386.minimum(arrayChar));
        System.out.println(Unit6Lab2_ssharma1293386.minimum(arrayInt));
        System.out.println(Unit6Lab2_ssharma1293386.minimum(arrayDouble));
        
        System.out.println(Unit6Lab2_ssharma1293386.maximum(arrayChar));
        System.out.println(Unit6Lab2_ssharma1293386.maximum(arrayInt));
        System.out.println(Unit6Lab2_ssharma1293386.maximum(arrayDouble));
        
        System.out.println(Unit6Lab2_ssharma1293386.minimumAt(arrayChar));
        System.out.println(Unit6Lab2_ssharma1293386.minimumAt(arrayInt));
        System.out.println(Unit6Lab2_ssharma1293386.minimumAt(arrayDouble));
        
        System.out.println(Unit6Lab2_ssharma1293386.maximumAt(arrayChar));
        System.out.println(Unit6Lab2_ssharma1293386.maximumAt(arrayInt));
        System.out.println(Unit6Lab2_ssharma1293386.maximumAt(arrayDouble));
    
        System.out.println(Unit6Lab2_ssharma1293386.average(arrayInt));
        System.out.println(Unit6Lab2_ssharma1293386.average(arrayDouble));
    

    }
    
}
