
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    int n = 0;

    MyFrame() {
        ImageIcon icon = new ImageIcon("dipuSingha.jpg");
        ImageIcon icon2 = new ImageIcon("dipuSingha.jpg");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(650, 500, 90, 50);
        button.addActionListener(this);
        button.setText("click");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD,15));
        button.setIconTextGap(-15);
        button.setForeground(Color.blue);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800, 600);
        this.setVisible(true);
        this.add(button);
        this.add(label);
        n++;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("You clicked this button " + n + " times");
            //button.setEnabled(false);
            n++;
            label.setVisible(true);
        }

    }

}
