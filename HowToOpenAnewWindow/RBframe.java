
// project: Java radio button
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RBframe extends JFrame implements ActionListener {

    JRadioButton pizzaButton = new JRadioButton("pizza");
    JRadioButton nutButton = new JRadioButton("nuts");
    JRadioButton coconutButton = new JRadioButton("coconut");

    ImageIcon pizzaIcon = new ImageIcon("pizza.png");
    ImageIcon nutsIcon = new ImageIcon("nuts.png");
    ImageIcon coconutIcon = new ImageIcon("coconut.png");

    Image resizedPizza = pizzaIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
    ImageIcon rpIcon = new ImageIcon(resizedPizza);

    Image resizedNuts = nutsIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
    ImageIcon rnIcon = new ImageIcon(resizedNuts);

    Image resizedCoconut = coconutIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
    ImageIcon rcIcon = new ImageIcon(resizedCoconut);

    RBframe() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setTitle("Order your Foods among Pizza, Nuts and Coconuts");

        JLabel label = new JLabel("Order your foods easily just by clicking on them");
        this.add(label);

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(nutButton);
        group.add(coconutButton);

        pizzaButton.addActionListener(this);
        nutButton.addActionListener(this);
        coconutButton.addActionListener(this);

        pizzaButton.setIcon(rpIcon);
        nutButton.setIcon(rnIcon);
        coconutButton.setIcon(rcIcon);

        this.add(pizzaButton);
        this.add(nutButton);
        this.add(coconutButton);
        this.pack();

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) {
            System.out.println("You ordered pizza\n");
        } else if (e.getSource() == nutButton) {
            System.out.println("You ordered nuts\n");
        } else if (e.getSource() == coconutButton) {
            System.out.println("You ordered coconuts\n");
        }
    }
}
