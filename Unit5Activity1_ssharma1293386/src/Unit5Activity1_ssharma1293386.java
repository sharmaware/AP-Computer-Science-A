/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
import java.util.Random;

public class Unit5Activity1_ssharma1293386 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        
        for (int i = 1; i <=20; i++){
        int randomValue = randomNumbers.nextInt(5) * 4 + 6 ;
        System.out.print(randomValue + " ");
        }

    }
    
}
