import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        // LaunchPage launchPage = new LaunchPage();
        // Project Name:   JOption Pane practice 

        // JOptionPane.showMessageDialog(null, "This is some useless info",
        // "title",JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Here is more useless info",
        // "title",JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info",
        // "title",JOptionPane.QUESTION_MESSAGE);
        // while (true) {
        // JOptionPane.showMessageDialog(null, "Your computer has a virus", "title",
        // JOptionPane.WARNING_MESSAGE);

        // }
        // JOptionPane.showMessageDialog(null, "Your computer has a virus", "title",
        // JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "title",
        // JOptionPane.ERROR_MESSAGE);
        // int answer = JOptionPane.showConfirmDialog(null, "Bro, why do you code?",
        // "This is my title",JOptionPane.YES_NO_CANCEL_OPTION);
        // String name = JOptionPane.showInputDialog("What is your name?");
        // System.out.println("Hello " + name);
        ImageIcon iconDipu = new ImageIcon("Hero Dipu.png");
        Image resizedImage = iconDipu.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        while (true) {

            int answer = JOptionPane.showOptionDialog(null, "You are awesome\nDo you want to continue?",
            "Secret Message",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, resizedIcon,
            null, 0);
            //System.out.println(answer);
            if (answer == 1) {
                System.out.println("You declined");
                break;
            }
            else if (answer == 2) {
                System.out.println("You can't cancel it. Click either Yes or No");
                
            }
        }

    }
}