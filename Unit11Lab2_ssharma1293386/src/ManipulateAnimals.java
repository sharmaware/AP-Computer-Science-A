/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class ManipulateAnimals {

    public static void main(String[] args) {
        Animal Animal1 = new Animal();
        Animal Animal2 = new Animal();
        Vehicle Vehicle1 = new Vehicle();
        Vehicle Vehicle2 = new Vehicle();

        //Animal and Vehicle instances can be treated as objects of their superclass, SuperClass
        SuperClass[] array = {Animal1, Animal2, Vehicle1, Vehicle2};

        for (SuperClass i : array) {
            i.drawObject();
            i.rotateObject();
            i.resizeObject();
            i.playSound();

        }
    }
}
