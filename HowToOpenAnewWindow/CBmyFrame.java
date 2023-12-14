// project name: Java Check Box

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CBmyFrame  extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkBox1;

    ImageIcon xIcon;
    ImageIcon checkIcon;
    

    CBmyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("Hero Dipu.png");
        checkIcon = new ImageIcon("checkboxGenericIcon.png");
        Image x = xIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon resizedX = new ImageIcon(x);
        Image y = checkIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon resizedY = new ImageIcon(y);


        button = new JButton();
        button.setText("submit");
        button.addActionListener(this);
        
        checkBox1 = new JCheckBox();
        checkBox1.setText("I am not a robot");
        checkBox1.setFocusable(false);
        checkBox1.setFont(new Font("Consolas", Font.PLAIN, 35));
        checkBox1.setIcon(resizedX);
        checkBox1.setSelectedIcon(resizedY);

        this.add(button);
        this.add(checkBox1);
        
        this.pack();
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            System.out.println(checkBox1.isSelected());
            
        }

        System.out.println();

    }
    
}

/* How to resize image? Here's how: 

ImageIcon iconDipu = new ImageIcon("Hero Dipu.png");
Image resizedImage = iconDipu.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
ImageIcon resizedIcon = new ImageIcon(resizedImage);
 */