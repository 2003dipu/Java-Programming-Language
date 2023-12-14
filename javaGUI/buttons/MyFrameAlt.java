import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrameAlt extends JFrame {

    JButton button;
    int n = 0;

    MyFrameAlt() {

        button = new JButton();
        button.setBounds(650, 500, 90, 50);
        // lambda expression
        button.addActionListener(e -> {
            System.out.println("User! You pressd this button " + n + " times");
            n++;
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800, 600);
        this.setVisible(true);
        this.add(button);
        n++;
    }

}
