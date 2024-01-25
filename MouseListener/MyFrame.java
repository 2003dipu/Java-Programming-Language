
import java.awt.FlowLayout;
//import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon a;
    ImageIcon b;
    ImageIcon c;
    ImageIcon d;

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        a = new ImageIcon("smiley.png");
        b = new ImageIcon("hopeful.png");
        c = new ImageIcon("pain.png");
        d = new ImageIcon("nervous.png");

        label.setIcon(a);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setIcon(b);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setIcon(c);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(a);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(d);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(a);
    }
}
