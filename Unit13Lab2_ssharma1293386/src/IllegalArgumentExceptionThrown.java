/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class IllegalArgumentExceptionThrown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        takeTwo(1);
    }

    public static void takeTwo(int num) {
        if (num != 2) {
            throw new IllegalArgumentException();
        }
    }

}
