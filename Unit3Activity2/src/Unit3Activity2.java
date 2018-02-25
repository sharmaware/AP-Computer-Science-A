/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */

import javax.swing.JFrame;


  
public class DrawPanelTest {   
    
    public static void main(String[] args) {
    DrawPanel panel = new DrawPanel();

       JFrame application = new JFrame();
       
       application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       application.add(panel);
       application.setSize(555, 555);
       application.setVisible(true);

}
}