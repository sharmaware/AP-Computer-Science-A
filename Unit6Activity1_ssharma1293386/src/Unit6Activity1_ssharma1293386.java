/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author saarthaksharma
 */
public class Unit6Activity1_ssharma1293386 extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        int endpoint[] = {250, 250};
        int newEndPoint[] = {1, 1};
        for (int n = 1; n <= 50; n++) {

            int direction = n % 4;
            // direction 1 = down, direction 2 = left, direction 3 = up, direction 0 = right 
            int length = (int) ((double) (n / 2)) * 10;

            if (direction == 1) {
                newEndPoint[0] = endpoint[0];
                newEndPoint[1] = endpoint[1] + length;
            }

            if (direction == 2) {
                newEndPoint[0] = endpoint[0] - length;
                newEndPoint[1] = endpoint[1];
            }

            if (direction == 3) {
                newEndPoint[0] = endpoint[0];
                newEndPoint[1] = endpoint[1] - length;
            }

            if (direction == 0) {
                newEndPoint[0] = endpoint[0] + length;
                newEndPoint[1] = endpoint[1];
            }

            g.drawLine(endpoint[0], endpoint[1], newEndPoint[0], newEndPoint[1]);

            endpoint[0] = newEndPoint[0];
            endpoint[1] = newEndPoint[1];

        }
    }

}
