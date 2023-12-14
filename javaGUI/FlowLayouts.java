import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayouts {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,640);
        //frame.setLayout(new FlowLayout(FlowLayout.RIGHT, 10,575));
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10));
        
        frame.setTitle("Dipu Singha dedicated this for his love for his lover Rosmi Sinha");

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,70));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        /*
        JButton button1 = new JButton("1"); button1.setFocusable(false);
        frame.add(button1);
        JButton button2 = new JButton("2"); button2.setFocusable(false);
        frame.add(button2);
        JButton button3 = new JButton("3"); button3.setFocusable(false);
        frame.add(button3);
        JButton button4 = new JButton("4"); button4.setFocusable(false);
        frame.add(button4);
        JButton button5 = new JButton("5"); button5.setFocusable(false);
        frame.add(button5);
        JButton button6 = new JButton("6"); button6.setFocusable(false);
        frame.add(button6);
        JButton button7 = new JButton("7"); button7.setFocusable(false);
        frame.add(button7);
        JButton button8 = new JButton("8"); button8.setFocusable(false);
        frame.add(button8);
        JButton button9 = new JButton("9"); button9.setFocusable(false);
        frame.add(button9);
        */
        panel.add(new JButton("0"));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);

        frame.setVisible(true);
    }
    
}
