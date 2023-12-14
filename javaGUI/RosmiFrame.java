import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

// custom class for controlling the color and and GUI
public class RosmiFrame extends JFrame {

    RosmiFrame() {
        this.setTitle("Dipu Singha dedicated this for Rosmi Sinha for his love");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(900, 500);
        this.getContentPane().setBackground(new Color(150, 130, 100)); // custom color
        // frame.getContentPane().setBackground(new Color(100, 0, 100)); // custom color

        // frame.getContentPane().setBackground(Color.gray); // default color
        this.setVisible(true);
        ImageIcon image = new ImageIcon("helloWorld.png");
        this.setIconImage(image.getImage());
    }

}
