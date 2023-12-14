// project: Java combo box

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboFrame extends JFrame implements ActionListener {

    // wrapper class to store primitive data types within an array
    Integer[] fruits = {1,2,3,4};

    String[] animals = { "dog", "cat", "bird","fish" };
    JComboBox comboBox = new JComboBox(animals);

    ComboFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(comboBox);
        comboBox.addActionListener(this);
        // comboBox.setEditable(true);
        // System.out.println(comboBox.getItemCount());
        // comboBox.addItem("Horse");
        comboBox.insertItemAt("cow", 0);
        //comboBox.setSelectedIndex(0);
        //comboBox.removeItem("cat");
        //comboBox.removeItemAt(0);
        //comboBox.removeAllItems();

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ex) {
        if (ex.getSource() == comboBox) {

            System.out.println(comboBox.getSelectedItem());
            // System.out.println(comboBox.getSelectedIndex());

        }

    }

}
