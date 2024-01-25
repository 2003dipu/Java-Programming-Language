import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AlternativeMF extends JFrame implements MouseListener {

    private JLabel label;
    private ImageIcon smiley = new ImageIcon("smiley.png");
    private ImageIcon hopeful = new ImageIcon("hopeful.png");
    private ImageIcon pain = new ImageIcon("pain.png");
    private ImageIcon nervous = new ImageIcon("nervous.png");

    AlternativeMF() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new FlowLayout());
        setTitle("Dipu Singha is trying hard to encounter his first love");

        label = new JLabel();
        label.addMouseListener(this);

        int width = 200;
        int height = 200;
        label.setIcon(resizeIcon(hopeful, width, height));

        add(label);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void setIcon(ImageIcon icon) {
        label.setIcon(icon);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        setIcon(resizeIcon(nervous));
    }

    @Override
    public void mousePressed(MouseEvent e) {
        setIcon(resizeIcon(pain));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        setIcon(resizeIcon(smiley));
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setIcon(resizeIcon(smiley));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setIcon(resizeIcon(hopeful));
    }

    private ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }

    private ImageIcon resizeIcon(ImageIcon icon) {
        int width = 200;
        int height = 200;
        return resizeIcon(icon, width, height);
    }
}
