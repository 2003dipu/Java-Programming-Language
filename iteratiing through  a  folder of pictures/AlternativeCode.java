
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class AlternativeCode {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        ArrayList<JLabel> deck = new ArrayList<JLabel>();

        for (int i = 1; i < 55; i++) {
            ImageIcon pic = new ImageIcon("source\\pic" + i + ".png");
            Image image = pic.getImage();
            Image resizImage = image.getScaledInstance(110, 110, Image.SCALE_SMOOTH);
            pic = new ImageIcon(resizImage);

            deck.add(new JLabel(pic));
            frame.add(deck.get(i - 1));

        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }
}
