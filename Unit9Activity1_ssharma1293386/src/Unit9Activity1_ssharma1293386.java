
import javax.swing.*;

/**
 *
 * @author saarthaksharma
 */
public class Unit9Activity1_ssharma1293386 {

    public static void main(String[] args) {

        int d = Input.getInt("Enter the month");
        int m = Input.getInt("Enter the day");
        int y = Input.getInt("Enter the year");

        Date date = new Date(m, d, y);

        String message = String.format("The date is %02d/%02d/%04d", date.getMonth(), date.getDay(), date.getYear());
        JOptionPane.showMessageDialog(null, message);
    }

}
