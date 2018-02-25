/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class ArrayIndexOutOfBoundsExceptionCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int array[] = {1, 2, 3};
            System.out.println(array[3]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("An ArrayIndexOutOfBoundsException occurs when the program "
                    + "tries to access a value in an array %nthat is outside "
                    + "the bounds of the array%n");
        }
    }

}
