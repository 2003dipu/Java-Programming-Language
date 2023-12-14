import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {


    

    JLabel label = new JLabel("Hello dear");
    JFrame frame = new JFrame();
    


    NewWindow(){

        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font(null, Font.PLAIN,25));

        frame.setTitle("Dipu Singha loves Rosmi Sinha");
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLayout(null);
        frame.setVisible(true);   

    }
}
