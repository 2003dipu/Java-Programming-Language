import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panels {

    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("saree.png");

        JLabel label = new JLabel();
        label.setText("Chitrangoda Monipuri Saree\nFounder and CEO: Chayon Singha");
        label.setBounds(100,100,9,7);

        // Blue Panel
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(0, 0, 100, 100);

        // Red Panel
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(100, 0, 100, 100);

        // Yellow Panel
        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setBounds(0, 90, 200, 90);


        JFrame frame = new JFrame();
        frame.setTitle("Chitrangoda Monipuri Saree logo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(800, 700);

        frame.add(label); // Add the label to the frame
        frame.add(bluePanel);
        frame.add(redPanel);
        frame.add(yellowPanel);

        frame.setVisible(true);
        bluePanel.add(label);
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(100, 150, 100));

    }
}
