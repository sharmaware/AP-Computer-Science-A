
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author saarthaksharma
 */
public class DrawPanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int counter = 0;

        for (int i = 1; i <= 12; i++) {
            g.drawOval(250 - (i * 10), 250 - (i * 10), 20 * i, 20 * i);

        }

    }
}
