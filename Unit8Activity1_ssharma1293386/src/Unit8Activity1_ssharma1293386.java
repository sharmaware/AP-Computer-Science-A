/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class Unit8Activity1_ssharma1293386 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cat cat1 = new Cat("Siamese Cat", 3, 15.5, 'm', "Bob");
        Cat cat2 = new Cat("Persian Cat", 4, 20.6, 'f', "Alexa");
        
        System.out.println("Cat 1 Information");
        System.out.println("Breed: " + cat1.getBreed());
        System.out.println("Age: " +  cat1.getAge());
        System.out.println("Weight: " + cat1.getWeight());
        System.out.println("Sex: " + cat1.getSex());
        System.out.println("Name: " + cat1.getName());
        System.out.println();
        System.out.println("Cat 2 Information");
        System.out.println("Breed: " + cat2.getBreed());
        System.out.println("Age: " +  cat2.getAge());
        System.out.println("Weight: " + cat2.getWeight());
        System.out.println("Sex: " + cat2.getSex());
        System.out.println("Name: " + cat2.getName());
        System.out.println();
        
        System.out.println("Changing Cat 1 information...");
        cat1.setName("Bobby");
        cat1.setAge(5);
        
        System.out.println("Cat 1 Information");
        System.out.println("Breed: " + cat1.getBreed());
        System.out.println("Age: " +  cat1.getAge());
        System.out.println("Weight: " + cat1.getWeight());
        System.out.println("Sex: " + cat1.getSex());
        System.out.println("Name: " + cat1.getName());
        System.out.println();
        
        System.out.println("Changing Cat 2 information...");
        cat2.setWeight(11.3);
        cat2.setAge(5);
        
        System.out.println("Cat 2 Information");
        System.out.println("Breed: " + cat2.getBreed());
        System.out.println("Age: " +  cat2.getAge());
        System.out.println("Weight: " + cat2.getWeight());
        System.out.println("Sex: " + cat2.getSex());
        System.out.println("Name: " + cat2.getName());
        System.out.println();
        System.out.println(cat2.meow());
        
    
    }
    
}
