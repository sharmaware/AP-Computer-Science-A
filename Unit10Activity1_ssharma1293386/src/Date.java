/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class Date {

    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Date() {
        month = 0;
        day = 0;
        year = 0;
    }

    public String dateToString() {
        return String.format("%s/%s/%s", month, day, year);
    }

}
