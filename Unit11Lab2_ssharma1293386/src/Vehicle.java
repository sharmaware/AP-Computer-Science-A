/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class Vehicle extends SuperClass {

    private String name;
    private double age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    @Override
    public void drawObject() {
        System.out.println("Drawing a Vehicle");
    }

    @Override
    public void rotateObject() {
        System.out.println("Rotating a Vehicle");
    }

    @Override
    public void resizeObject() {
        System.out.println("Resizing a Vehicle");
    }

    @Override
    public void playSound() {
        System.out.println("Vehicle Sound");
    }
}
