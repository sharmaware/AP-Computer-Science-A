/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class ClassCastExceptionCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Object x = new Integer(0);
            System.out.println((String) x);

        } catch (ClassCastException e) {
            System.out.printf("A ClassCastExcption is a RuntimeException that occurs "
                    + "when the program attempts to cast an object to a type which "
                    + "is not a subclass of the original. "
                    + "In this example, instance of Integer is trying to be casted to a string. "
                    + "Exception is thrown because String is not subclass of Integer.");
        }
    }

}
