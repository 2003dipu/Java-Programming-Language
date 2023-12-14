

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;



public class myFrame extends JFrame implements ActionListener {

    // Declare the button and the counter as private instance variables
    private JButton button = new JButton();
    private int n = 0;

    myFrame() {

        setLayout(null);

        // Button
        button.setBounds(880, 550, 90, 50);
        button.setText("click me");
        button.setFocusable(false);
        button.addActionListener(this);
        add(button);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 650);
        setVisible(true);

        // Increment the counter at the end of the constructor
        n++;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Check if the source of the event is the button
        if (e.getSource() == button) {
            System.out.println("You pressed this button this many times: " + n);
            // Increment the counter
            n++;
        }
    }
}
