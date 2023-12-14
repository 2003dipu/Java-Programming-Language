// project name: Anonymous inner class

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.*; // import everyting if you need to

public class MyFrame extends JFrame {

    JButton button1 = new JButton("button # 1");
    JButton button2 = new JButton("button # 2");
    JButton button3 = new JButton("button # 3");

    MyFrame() {

        button1.setBounds(100, 100, 100, 100);
        button2.setBounds(200, 100, 100, 100);
        button3.setBounds(300, 100, 100, 100);

        button1.addActionListener(new ActionListener() { 

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed " + button1.getText());
            }
        });
        button2.addActionListener(new ActionListener() { 

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed " + button2.getText());
            }
        });

        button3.addActionListener(new ActionListener() { 

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed " + button3.getText());
            }
        });

        this.add(button1);
        this.add(button2);
        this.add(button3);

        this.setTitle("Dipu Singha has loved Rosmi Sinha");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLayout(null);
        this.setVisible(true);

    }

}
