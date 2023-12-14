



public class Main {
    public static void main(String[] args) {
        /* 
        // System.out.println("\nProject Name: Java GUI introduction\n");

        // System.out.println("interesting, huh? Not only interesting but also easy");
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "You are " + height + " feets tall");
        
        // this is practicing man
        */
 
        Person myObj = new Person();
        myObj.setName("Rosmi Sinha");
        System.out.println("My darling name's: " + myObj.getName());
        System.out.println("Pi = " + myObj.PI);

        
        
    }
}

/*
// JFrame = a GUI window to add components to

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class GUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setResizable(false);
        frame.setSize(800, 600);

        // create a custom panel for the title and the logo
        JPanel titlePanel = new JPanel(new BorderLayout());
        // set the preferred size of the panel
        titlePanel.setPreferredSize(new Dimension(800, 200));

        // create a label for the title
        JLabel titleLabel = new JLabel("JFrame title created by Dipu Singha dedicated for Rosmi Sinha");
        // set the font size of the title to 30
        titleLabel.setFont(new Font(titleLabel.getFont().getName(), Font.PLAIN, 30));
        // add the title label to the center of the panel
        titlePanel.add(titleLabel, BorderLayout.CENTER);

        // create a label for the logo
        JLabel logoLabel = new JLabel();
        // set the logo for the label
        ImageIcon image1 = new ImageIcon("Hero Dipu.jpg");
        // scale the image to 500x200 pixels
        Image image2 = image1.getImage().getScaledInstance(100, 90, Image.SCALE_SMOOTH);
        // create a new ImageIcon from the scaled image
        ImageIcon image3 = new ImageIcon(image2);
        logoLabel.setIcon(image3);
        // add the logo label to the east of the panel
        titlePanel.add(logoLabel, BorderLayout.EAST);

        // add the custom panel to the frame
        frame.add(titlePanel, BorderLayout.NORTH);

        frame.setVisible(true); // make frame visible
    }

}
 
 */