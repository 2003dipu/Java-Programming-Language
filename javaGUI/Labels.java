// JLabel = a GUI display area for a string of text, an image, or both

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Labels {

    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("helloWorld.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        Image scaledImage = image.getImage().getScaledInstance(120, 170, Image.SCALE_SMOOTH);

        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        JLabel label = new JLabel();
        label.setText("My first Label in Java dedicated for Rosmi Sinha for love");
        label.setIcon(scaledIcon);
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(10, 225, 200));
        label.setFont(new Font("MV Boli", Font.BOLD, 20));
        label.setIconTextGap(20);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.LEFT);
        //label.setBounds(0, 0, 740, 180);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(900, 600);
        frame.getContentPane().setBackground(new Color(150, 130, 100));
        frame.setIconImage(image.getImage());
        //frame.setLayout(null);

        frame.setVisible(true);
        frame.add(label);
        frame.pack();// responsive: adjust 
    }

}
