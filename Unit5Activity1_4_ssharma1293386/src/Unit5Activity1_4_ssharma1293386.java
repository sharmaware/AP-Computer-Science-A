
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author saarthaksharma
 */
public class Unit5Activity1_4_ssharma1293386 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random randomNumbers = new Random(100);
        for (int counter = 1; counter <= 100; counter++) {

            int randomValue = 4 * randomNumbers.nextInt(5) + 6;
            System.out.printf("%s  ", randomValue);

        }

    }

}
