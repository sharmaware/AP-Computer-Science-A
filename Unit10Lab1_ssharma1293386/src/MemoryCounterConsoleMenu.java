
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author saarthaksharma
 */
public class MemoryCounterConsoleMenu {

    private static JFrame frame;

    public void displayMenu() {

// schedule this for the event dispatch thread (edt)
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                displayJFrame();
            }
        });
    }

    public static void displayJFrame() {
        MemoryCounter counter = new MemoryCounter();
        frame = new JFrame("Counter");

        // create our jbutton
        JButton showDialogIncrementButton = new JButton("Increment");

        // add the listener to the jbutton to handle the "pressed" event
        showDialogIncrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter.increment();
                String message = String.format("Counter value is %s", counter.getValue());
                JOptionPane.showMessageDialog(null, message);
            }
        });

        // create our jbutton
        JButton showDialogDecrementButton = new JButton("Decrement");

        // add the listener to the jbutton to handle the "pressed" event
        showDialogDecrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter.decrement();
                String message = String.format("Counter value is %s", counter.getValue());
                JOptionPane.showMessageDialog(null, message);
            }
        });

        // create our jbutton
        JButton showDialogResetButton = new JButton("Reset");

        // add the listener to the jbutton to handle the "pressed" event
        showDialogResetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // display/center the jdialog when the button is pressed
                counter.reset();
                String message = String.format("Counter value is %s", counter.getValue());
                JOptionPane.showMessageDialog(null, message);

            }
        });

        // create our jbutton
        JButton showDialogValueButton = new JButton("Current Value");

        // add the listener to the jbutton to handle the "pressed" event
        showDialogValueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // display/center the jdialog when the button is pressed
                String message = String.format("Counter value is %s", counter.getValue());
                JOptionPane.showMessageDialog(null, message);

            }
        });

        // create our jbutton
        JButton showDialogAddMemoryButton = new JButton("Add Memory");

        // add the listener to the jbutton to handle the "pressed" event
        showDialogAddMemoryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // display/center the jdialog when the button is pressed
                counter.addMemoryValue();
                String message = String.format("Value in memory is %s", counter.getMemoryValue());
                JOptionPane.showMessageDialog(null, message);

            }
        });

        // create our jbutton
        JButton showDialogResetMemoryButton = new JButton("Reset Memory");

        // add the listener to the jbutton to handle the "pressed" event
        showDialogResetMemoryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // display/center the jdialog when the button is pressed
                counter.resetMemoryValue();
                String message = String.format("Value in memory has been reset to %s", counter.getMemoryValue());
                JOptionPane.showMessageDialog(null, message);

            }
        });

        // create our jbutton
        JButton showDialogGetMemoryValueButton = new JButton("Memory Value");

        // add the listener to the jbutton to handle the "pressed" event
        showDialogGetMemoryValueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // display/center the jdialog when the button is pressed

                String message = String.format("Value in memory is %s", counter.getMemoryValue());
                JOptionPane.showMessageDialog(null, message);

            }
        });

        // put the button on the frame
        frame.getContentPane().setLayout(new FlowLayout());
        frame.add(showDialogIncrementButton);
        //frame.getContentPane().setLayout(new FlowLayout());
        frame.add(showDialogDecrementButton);
        //frame.getContentPane().setLayout(new FlowLayout());
        frame.add(showDialogResetButton);
        //frame.getContentPane().setLayout(new FlowLayout());
        frame.add(showDialogValueButton);
        frame.add(showDialogResetMemoryButton);
        frame.add(showDialogAddMemoryButton);
        frame.add(showDialogGetMemoryValueButton);

        // set up the jframe, then display it
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
