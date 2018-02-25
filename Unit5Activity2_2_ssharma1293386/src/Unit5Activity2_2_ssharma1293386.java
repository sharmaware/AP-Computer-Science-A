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
public class Unit5Activty2_2_ssharma1293386 extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        for (int i = 1; i <= 10; i++) {

            int rColor = (int) (Math.random() * 255 + 1);
            int gColor = (int) (Math.random() * 255 + 1);
            int bColor = (int) (Math.random() * 255 + 1);
            Color RandomColor = new Color(rColor, gColor, bColor);
            g.setColor(RandomColor);

            int RandomShape = (int) (Math.random() + 0.5);
            if (RandomShape == 0) {
                g.fillOval((int) (Math.random() * 125 + 1), (int) (Math.random() * 125 + 1), (int) (Math.random() * 125 + 1), (int) (Math.random() * 125 + 1));
            }
            if (RandomShape == 1) {
                g.fillRect((int) (Math.random() * 125 + 1), (int) (Math.random() * 125 + 1), (int) (Math.random() * 125 + 1), (int) (Math.random() * 125 + 1));
            }

        }
    }

        public static void main(String[] args) {

        Unit5Activity2_2_ssharma1293386 panel = new Unit5Activity2_2_ssharma1293386();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);

    }
}
