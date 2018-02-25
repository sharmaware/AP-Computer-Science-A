/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class Animal extends SuperClass {

    private String name;

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public void playSound() {
        System.out.println("Animal Sound");
    }

    @Override
    public void rotateObject() {
        System.out.println("Rotating an Animal");
    }

    @Override
    public void drawObject() {
        System.out.println("Drawing an Animal");
    }

    @Override
    public void resizeObject() {
        System.out.println("Resizing an Animal");
    }
}
