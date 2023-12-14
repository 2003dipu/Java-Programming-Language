// project name : lambda expression in java
import javax.swing.JButton;
import javax.swing.JFrame;


public class DipuFrame extends JFrame {

    JButton button1 = new JButton("button1");
    JButton button2 = new JButton("button2");

    DipuFrame() {

        button1.setBounds(100, 100, 90, 50);
        button1.setFocusable(false);
        button1.addActionListener ( (e) -> {
            System.out.println("You clicked button1");
        });
        button2.setBounds(100, 150, 90, 50);
        button2.setFocusable(false);
        button2.addActionListener ( (e) -> {
            System.out.println("You clicked button2\n");
        });

        this.add(button1);
        this.add(button2);
        this.setTitle("Huna Bopa");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLayout(null);
        this.setVisible(true);

    }

}
