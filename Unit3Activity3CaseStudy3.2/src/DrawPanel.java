/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author saarthaksharma
 */
public class DrawPanel extends JPanel {
        
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int width = getWidth();
        int height = getHeight();
        int counter = 0;
        
        while (counter <=15)
        {
            //Bottom Left Corner
            g.drawLine(0, counter * height/15, counter * width/15, height);
            //Top Left Corner
            g.drawLine(0, (15-counter) * width/15, counter * width/15, 0);
            //Top Right Corner
            g.drawLine(counter * width/15, 0, width, counter * height/15);
            //Bottom Right Corner
            g.drawLine(counter * width/15, height, width, (15 - counter) * height/15);
            counter = counter + 1;
      
        }
                
         
    }
}


    
