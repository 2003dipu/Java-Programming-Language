import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class MyPanelAnim extends JPanel implements ActionListener{

    final int   PANEL_WIDTH = 700;
    final int   PANEL_HEIGHT = 500;

    Image enemy;
    Image backgroundImg;
    Timer timer;
    int xVeclocity = 3;
    int yVeclocity = 2;
    int x = 0;
    int y = 0;

    MyPanelAnim(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        enemy = new ImageIcon("arcadeE.png").getImage();
        backgroundImg = new ImageIcon("skyHorizon.png").getImage();
        timer = new Timer(6, this);
        timer.start();

    }

    public void paint(Graphics g){

        super.paint(g); // paint background

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(backgroundImg, 0,0,null);
        g2D.drawImage(enemy, x,y,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (x >= PANEL_WIDTH-enemy.getWidth(null) || x < 0) {
            xVeclocity = xVeclocity * -1;
        }
        x = x + xVeclocity;
        
        if (y >= PANEL_HEIGHT-enemy.getHeight(null) || y < 0) {
            yVeclocity = yVeclocity * -1;
        }
        y = y + yVeclocity;
        repaint();
    }
    
}
