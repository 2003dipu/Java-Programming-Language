// project name: Java anonymous objects
// I didn't have the necessary images of deck of cards, so used random images that were available on my PC

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        ArrayList<JLabel> deck = new ArrayList<JLabel>();

        ImageIcon pic1 = new ImageIcon("source\\pic1.png");
        Image image1 = pic1.getImage();
        Image resizImage1 = image1.getScaledInstance(120,120,Image.SCALE_SMOOTH);
        pic1 = new ImageIcon(resizImage1);

        ImageIcon pic2 = new ImageIcon("source\\pic2.png");
        Image image2 = pic2.getImage();
        Image resizedImage2 = image2.getScaledInstance(120,120,Image.SCALE_SMOOTH);
        pic2 = new ImageIcon(resizedImage2);

        ImageIcon pic3 = new ImageIcon("source\\pic3.png");
        Image image3 = pic3.getImage();
        Image resizedImage3 = image3.getScaledInstance(120,120,Image.SCALE_SMOOTH);
        pic3 = new ImageIcon(resizedImage3);

        ImageIcon pic4 = new ImageIcon("source\\pic4.png");
        Image image4 = pic4.getImage();
        Image resizedImage4 = image4.getScaledInstance(120,120,Image.SCALE_SMOOTH);
        pic4 = new ImageIcon(resizedImage4);

        ImageIcon pic5 = new ImageIcon("source\\pic5.png");
        Image image5 = pic5.getImage();
        Image resizedImage5 = image5.getScaledInstance(120,120,Image.SCALE_SMOOTH);
        pic5 = new ImageIcon(resizedImage5);

        ImageIcon pic6 = new ImageIcon("source\\pic6.png");
        Image image6 = pic6.getImage();
        Image resizedImage6 = image6.getScaledInstance(120,120,Image.SCALE_SMOOTH);
        pic6 = new ImageIcon(resizedImage6);

        ImageIcon pic7 = new ImageIcon("source\\pic7.png");
        Image image7 = pic7.getImage();
        Image resizedImage7 = image7.getScaledInstance(120,120,Image.SCALE_SMOOTH);
        pic7 = new ImageIcon(resizedImage7);

        ImageIcon pic8 = new ImageIcon("source\\pic8.png");
        Image image8 = pic8.getImage();
        Image resizImage8 = image8.getScaledInstance(120,120,Image.SCALE_SMOOTH);
        pic8 = new ImageIcon(resizImage8);

        ImageIcon pic9 = new ImageIcon("source\\pic9.png");
        Image image9 = pic9.getImage();
        Image resizedImage9 = image9.getScaledInstance(120,120,Image.SCALE_SMOOTH);
        pic9 = new ImageIcon(resizedImage9);

        ImageIcon pic10 = new ImageIcon("source\\pic10.png");
        Image image10 = pic10.getImage();
        Image resizedImage10 = image10.getScaledInstance(120,120,Image.SCALE_SMOOTH);
        pic10 = new ImageIcon(resizedImage10);

        ImageIcon pic11 = new ImageIcon("source\\pic11.png");
        Image image11 = pic11.getImage();
        Image resizedImage11 = image11.getScaledInstance(120,120,Image.SCALE_SMOOTH);
        pic11 = new ImageIcon(resizedImage11);

        ImageIcon pic12 = new ImageIcon("source\\pic12.jpg");
        Image image12 = pic12.getImage();
        Image resizedImage12 = image12.getScaledInstance(120,120,Image.SCALE_SMOOTH);
        pic12 = new ImageIcon(resizedImage12);

        ImageIcon pic13 = new ImageIcon("source\\pic13.png");
        Image image13 = pic13.getImage();
        Image resizedImage13 = image13.getScaledInstance(120,120,Image.SCALE_SMOOTH);
        pic13 = new ImageIcon(resizedImage13);

        ImageIcon pic14 = new ImageIcon("source\\pic14.png");
        Image image14 = pic14.getImage();
        Image resizedImage14 = image14.getScaledInstance(120,120,Image.SCALE_SMOOTH);
        pic14 = new ImageIcon(resizedImage14);

        ImageIcon pic15 = new ImageIcon("source\\pic15.png");
        Image image15 = pic15.getImage();
        Image resizedImage15 = image15.getScaledInstance(120,120,Image.SCALE_SMOOTH);
        pic15 = new ImageIcon(resizedImage15);

        JLabel pic1Label = new JLabel(pic1);
        JLabel pic2Label = new JLabel(pic2);
        JLabel pic3Label = new JLabel(pic3);
        JLabel pic4Label = new JLabel(pic4);
        JLabel pic5Label = new JLabel(pic5);
        JLabel pic6Label = new JLabel(pic6);
        JLabel pic7Label = new JLabel(pic7);
        JLabel pic8Label = new JLabel(pic8);
        JLabel pic9Label = new JLabel(pic9);
        JLabel pic10Label = new JLabel(pic10);
        JLabel pic11Label = new JLabel(pic11);
        JLabel pic12Label = new JLabel(pic12);
        JLabel pic13Label = new JLabel(pic13);
        JLabel pic14Label = new JLabel(pic14);
        JLabel pic15Label = new JLabel(pic15);

        deck.add(pic1Label);
        deck.add(pic2Label);
        deck.add(pic3Label);
        deck.add(pic4Label);
        deck.add(pic5Label);
        deck.add(pic6Label);
        deck.add(pic7Label);
        deck.add(pic8Label);
        deck.add(pic9Label);
        deck.add(pic10Label);
        deck.add(pic11Label);
        deck.add(pic12Label);
        deck.add(pic13Label);
        deck.add(pic14Label);
        deck.add(pic15Label);

        frame.add(deck.get(0));
        frame.add(deck.get(1));
        frame.add(deck.get(2));
        frame.add(deck.get(3));
        frame.add(deck.get(4));
        frame.add(deck.get(5));
        frame.add(deck.get(6));
        frame.add(deck.get(7));
        frame.add(deck.get(8));
        frame.add(deck.get(9));
        frame.add(deck.get(10));
        frame.add(deck.get(11));
        frame.add(deck.get(12));
        frame.add(deck.get(13));
        frame.add(deck.get(14));
        

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }
}