/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author saarthaksharma
 */
public class GroceryItemTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random rnGenerator = new Random(12);

        ArrayList<GroceryItem> items = new ArrayList(50);

        for (int i = 0; i < 50; i++) {
            GroceryItem e = new GroceryItem();
            items.add(i, e);
        }

        //Setting item code and shelf life
        for (int k = 0; k < items.size(); k++) {
            items.get(k).setItemCode(k);
            items.get(k).setShelfLife((rnGenerator.nextInt(30) + 1));
        }

        ArrayList<GroceryItem> GreaterItems = new ArrayList(0);

        ArrayList<GroceryItem> LesserItems = new ArrayList(0);

        /*GroceryItem test = new GroceryItem();
        LesserItems.add(test); */
        for (GroceryItem item : items) {
            if (item.getShelfLife() <= 7) {
                LesserItems.add(item);
            } else {
                GreaterItems.add(item);
            }
        }

        System.out.printf("Number of items that have shelf life greater than 7 days = %s%n", GreaterItems.size());
        System.out.printf("Number of items that have shelf life lesser than 7 days = %s%n", LesserItems.size());

    }

}
