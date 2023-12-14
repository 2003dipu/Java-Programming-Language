
// project name: Java Mouse Listener
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class FrameMouseListener extends JFrame implements MouseListener {

    JLabel label;
    
    FrameMouseListener(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // invoked when a mouse Button has been clicked(pressed and released) on a component  
        System.out.println("Signal 4 -> You clicked the mouse");
        label.setBackground(Color.yellow);

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // invoked when a mouse button has been pressed on a component
        System.out.println("Signal 2 -> You pressed the mouse");
        label.setBackground(Color.blue);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // invoked when a mouse button has been released on a component
        System.out.println("Signal 3 -> You released the mouse");
        label.setBackground(Color.cyan);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // invoked when the mouse enters a component
        System.out.println("Signal 1 -> You entered the component");
        label.setBackground(Color.MAGENTA);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // invoked when the mouse exits a component
        System.out.println("Signal 5 -> You exited the component\n");
        label.setBackground(Color.green);
    }

}
