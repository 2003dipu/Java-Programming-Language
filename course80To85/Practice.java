// practice what is on your mind

import java.awt.FlowLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Practice {

    public static void main(String[] args) {

        JFrame frame = new JFrame("This is my frame for practice");
        ArrayList<JLabel> picListArray = new ArrayList<JLabel>();

        for (int i = 1; i < 55; i++) {

            ImageIcon pic = new ImageIcon("source\\pic" + i + ".png");
            Image image = pic.getImage();
            Image resizedImage = image.getScaledInstance(110, 110, Image.SCALE_SMOOTH);
            pic = new ImageIcon(resizedImage);

            picListArray.add(new JLabel(pic));
            frame.add(picListArray.get(i - 1));

        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }

}
