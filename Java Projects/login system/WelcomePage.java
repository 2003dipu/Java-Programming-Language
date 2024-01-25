import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello");

    WelcomePage(String userID){

        welcomeLabel.setBounds(0,0,800,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        welcomeLabel.setText("Hello " + userID + ". Your login has been successful. What's your next plan?");
        welcomeLabel.setBackground(Color.DARK_GRAY);
        welcomeLabel.setForeground(Color.blue);

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Welcome Page. hunabopa.com");
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    
}
