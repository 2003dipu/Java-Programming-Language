
// project name: Java Key Listener
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Image;

public class FrameKeyListener extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;

    FrameKeyListener() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Dipu Singha wanted to proppose his love today.");
        this.setSize(800, 600);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("ufo.png");
        Image y = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(y);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setIcon(resizedIcon);
        //label.setBackground(Color.red);
        //label.setOpaque(true);
        this.add(label);

        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // System.out.println();
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;

            default:
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // System.out.println("You pressed the key " + e.getKeyChar());
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 39:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 10);
                break;

            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You released key character " + e.getKeyChar());
        System.out.println("You released key code " + e.getKeyCode());
    }

}
