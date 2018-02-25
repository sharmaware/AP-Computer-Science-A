/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class Unit6Lab3Tester_ssharma1293386 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("");
        char a1[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        char a2[] = {'j', 'f', 'r', 'g', 'h', 'q'};

        int b1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int b2[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        double c1[] = {1.23, 2.34, 3.45, 4.56, 5.67, 6.78};
        double c2[] = {1.23, 2.34, 5.43, 6.78, 4.34, 6.54};

        System.out.println(Unit6Lab3_ssharma1293386.equals(a1, a2));
        System.out.println(Unit6Lab3_ssharma1293386.equals(b1, b2));
        System.out.println(Unit6Lab3_ssharma1293386.equals(c1, c2));
        System.out.println(Unit6Lab3_ssharma1293386.find(a1, 'c'));
        System.out.println(Unit6Lab3_ssharma1293386.find(b1, 5));
        System.out.println(Unit6Lab3_ssharma1293386.find(c1, 5.32));
        Unit6Lab3_ssharma1293386.sort(a2);
        System.out.println(a2);
        Unit6Lab3_ssharma1293386.sort(b2);
        for (int i = 0; i < b2.length; i++) {
            System.out.print(b2[i] + " ");
        }
        System.out.println();
        Unit6Lab3_ssharma1293386.sort(c2);
        for (int i = 0; i < c2.length; i++) {
            System.out.print(c2[i] + " ");
        }
        System.out.println();

    }
}
