/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class Unit9Lab1_ssharma1293386 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Information about Tony Baggadonuts
        Name tonyName = new Name("Tony", "Baggadonuts");
        Date tonyBirthDay = new Date(10, 21, 2001);
        Person tony = new Person(tonyName, tonyBirthDay);
    
        System.out.printf("Name: %s%nBirthdate: %s%n", tony.getNameString(), tony.getDateString());
    }
    
}
