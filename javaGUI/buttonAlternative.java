import javax.swing.JButton;
import javax.swing.JFrame;

public class buttonAlternative extends JFrame {

    private JButton button = new JButton();
    private int n = 0;

    buttonAlternative() {

        setLayout(null);

        // Button
        button.setBounds(880, 550, 90, 50);
        button.setText("click me");
        button.setFocusable(false);
        button.addActionListener(e -> System.out.println("You pressed this button this many times: " + n));
        add(button);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 650);
        setVisible(true);

        // Increment the counter at the end of the constructor
        n++;
    }
} // 26 lines of code
