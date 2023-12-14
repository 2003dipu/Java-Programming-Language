// project name: Java color chooser
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class ColorChooserJ extends JFrame implements ActionListener{

    JButton button1;
    JButton button2;
    JLabel label1;


    ColorChooserJ() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button1 = new JButton("Foreground Color");
        button2 = new JButton("Background Color");

        label1 = new JLabel();
        label1.setBackground(Color.white);
        label1.setOpaque(true);
        label1.setText("This is some text");
        label1.setFont(new Font("MV Boli", Font.PLAIN, 100));

        

        button1.addActionListener(this);
        button2.addActionListener(this);

        this.add(button1);
        this.add(button2);
        this.add(label1);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println();
        if (e.getSource() == button1) {
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick Foreground Color", Color.black );
            label1.setForeground(color);
                        
        }
        else if (e.getSource() == button2) {
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick Background Color", Color.black );
            label1.setBackground(color);           
        }
    }
    
}
