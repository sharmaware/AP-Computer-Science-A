/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class DivideByZeroException extends Exception {

    private int denom;

    public DivideByZeroException() {

    }

    public DivideByZeroException(String s) {
        super(s);
    }

    public DivideByZeroException(int d) {
        super("div by zero");

    }

    public int getDenominator() {
        return denom;
    }
}
