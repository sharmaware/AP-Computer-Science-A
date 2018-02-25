
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
public class Unit5Activity1_3_ssharma12993386 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        for (int counter = 1; counter <= 20; counter++) {

            int randomValue = (int)(Math.random() * 5 + 1);
            System.out.printf("%s  ", randomValue);

        }
    }

}
