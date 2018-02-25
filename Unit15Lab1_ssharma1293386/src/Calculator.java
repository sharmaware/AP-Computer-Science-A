/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class Calculator {
    private double number1;
    private double number2;
    private double sum;
    public Calculator(){
	this.number1 = 0;
	this.number2 = 0;
        this.sum = 0;
    }
    public void  setNumber1(double number1){
	this.number1 = number1;
    }
    public void  setNumber2(double number2){
	this.number2 = number2;
    }
    public double getNumber1(){
	return number1;
    }
    public double getNumber2(){
	return number2;
}
    public void setSum(){
        this.sum = number1 + number2;
    }
    public double getSum(){
        return sum;
    }
}

