/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

/**
 *
 * @author saarthaksharma
 */
public class Unit5Activity2_ssharma1293386 extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        int rColor = (int) (Math.random() * 255 + 1);
        int gColor = (int) (Math.random() * 255 + 1);
        int bColor = (int) (Math.random() * 255 + 1);
        Color RandomColor1 = new Color(rColor, gColor, bColor);

        rColor = (int) (Math.random() * 255 + 1);
        gColor = (int) (Math.random() * 255 + 1);
        bColor = (int) (Math.random() * 255 + 1);
        Color RandomColor2 = new Color(rColor, gColor, bColor);

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                g.setColor(RandomColor1);
                g.fillOval(0 + i * 10, 0 + i * 10, 250 - i * 20, 250 - i * 20);
            } else {
                g.setColor(RandomColor2);
                g.fillOval(0 + i * 10, 0 + i * 10, 250 - i * 20, 250 - i * 20);
            }
        }

    }

   
}
