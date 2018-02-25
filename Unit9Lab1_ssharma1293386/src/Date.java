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

    public Date() {
        this.month = 0;
        this.day = 0;
        this.year = 0;
    }

    public Date(int m, int d, int y) {
        this.month = m;
        this.day = d;
        this.year = y;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public int getYear() {
        return this.year;
    }

    public String getDateString(){
        return month + "/" +  day + "/" + year; 
    }
}
