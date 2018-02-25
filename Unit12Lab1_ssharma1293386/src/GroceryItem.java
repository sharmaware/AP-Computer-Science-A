/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class GroceryItem {

    private int ItemCode;
    private int ShelfLife;

    public void setItemCode(int code) {
        this.ItemCode = code;

    }

    public int getItemCode() {
        return ItemCode;
    }

    public void setShelfLife(int days) {
        this.ShelfLife = days;
    }

    public int getShelfLife() {
        return this.ShelfLife;
    }
}
