/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author saarthaksharma
 */
public class Unit5Lab2_ssharma1293386 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month and year seperated by a space:");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println();
        //System.out.println(getStartDay(a,1,b));
        printMonthCalendar(a, b);
        System.out.println();

    }

    public static void printMonthCalendar(int m, int y) {
        printMonthHeader(m, y);
        printMonthBody(m, y);
    }

    public static void printMonthHeader(int m, int y) {
        System.out.println("       " + getMonthName(m) + "  " + y);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat ");

    }

    public static void printMonthBody(int m, int y) {
        int MonthSpaces = getNumDaysInMonth(m, y);
        int BlankSpaces = getStartDay(m, 1, y);

        System.out.print("  ");
        for (int k = 1; k <= BlankSpaces; k++) {
            System.out.print("    ");

        }
        for (int i = 1; i <= MonthSpaces; i++) {
            int MonthDay = i;
            System.out.print(" ");
            if ((i + BlankSpaces) % 7 == 0) {
                if (MonthDay <= 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(MonthDay);
                }

                if (MonthDay < 9) {
                    System.out.println("  ");
                } else {
                    System.out.println(" ");

                }
            } else {
                if (MonthDay <= 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(MonthDay);
                }
            }

            if (MonthDay < 9) {
                System.out.print("  ");
            } else {
                System.out.print(" ");

            }

            /*if (MonthDay <= 0) {
                System.out.print("  ");
            } else {
                System.out.print(MonthDay);
            }

            if (MonthDay < 10) {
                System.out.print("  ");
            } else {
                System.out.print(" ");

            }*/
        }

    }

    public static String getMonthName(int m) {
        String month;
        switch (m) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Invalid";
                break;
        }

        return month;
    }

    public static int getStartDay(int m, int d, int y) {
        /*
  The method getStartDay() implements Zeller's Algorithm for determining the day of the
  week the first day of a month is. The method adjusts Zeller's numbering scheme
  for day of week ( 0=Saturday, ..., 6=Friday ) to conform to a day of week number
  that corresponds to ISO conventions (i.e., 1=Monday, ..., 7=Sunday)
  
  Pre-Conditions: The month value, m,  is 1-12
                        The day value, d, is 1-31, or 1-28, 1-29 for February
                        The year value, y, is the full year (e.g., 2012)
                  
 Post-Conditions: A value of 1-7 is returned, representing the first day of the month
                        1 = Monday, ..., 7 = Sunday
         */

        // Adjust month number & year to fit Zeller's numbering system
        if (m < 3) {
            m = m + 12;
            y = y - 1;
        }

        int k = y % 100;      // Calculate year within century
        int j = y / 100;      // Calculate century term
        int h = 0;            // Day number of first day in month 'm'

        h = (d + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        // Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
        int dayNum = ((h + 5) % 7) + 1;

        return dayNum;
    }

    public static int getNumDaysInMonth(int m, int y) {
        int NumDaysInMonth = 0;
        if ((m == 1) || (m == 3) || (m == 5) || (m == 7) || (m == 9) || (m == 11)) {
            NumDaysInMonth = 31;
        }
        if (m % 2 == 0 && m != 2) {
            NumDaysInMonth = 30;
        }
        if (m == 2) {
            NumDaysInMonth = 28;
        }
        if ((isLeapYear(y)) && (m == 2)) {
            NumDaysInMonth = 29;
        }
        return NumDaysInMonth;

    }

    public static boolean isLeapYear(int y) {
        boolean isLeapYear = false;

        if (y % 4 == 0) {
            isLeapYear = true;
        }

        return isLeapYear;

    }

}
