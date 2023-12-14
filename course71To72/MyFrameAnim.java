import java.awt.*;
import javax.swing.*;

public class MyFrameAnim extends JFrame {

    MyPanelAnim panel;

    MyFrameAnim(){

        panel = new MyPanelAnim();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Dipu Singha dedicated this animation for his love. Whoever you are");
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
