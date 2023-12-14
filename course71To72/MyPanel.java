import javax.swing.JPanel;
import java.awt.*;
import javax.swing.ImageIcon;

public class MyPanel extends JPanel{

    Image image;

    MyPanel(){
        image = new ImageIcon("BroCodeMadeThisSky.png").getImage();
        this.setPreferredSize(new Dimension(600,600));
        
    }

    public void paint(Graphics g){

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(image, 0,0,null);
        g2D.setPaint(Color.blue);
        //g2D.setStroke(new BasicStroke(5));
        //g2D.drawLine(0,0,600,600);

        //g2D.setPaint(Color.pink);
        //g2D.drawRect(0,0,100,200);
        //g2D.fillRect(0,0,100,200);
        //g2D.setPaint(Color.orange);
        //g2D.drawOval(0,0,100,100);
        //g2D.fillOval(0,0,100,100);

        g2D.setPaint(Color.red);
        g2D.drawArc(0,0,100,100,180,180);
        g2D.fillArc(0,0,100,100,0,180);
        g2D.setPaint(Color.ORANGE);
        g2D.fillArc(0,0,100,100,180,180);

        int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};
        g2D.setPaint(Color.yellow);
        //g2D.drawPolygon(xPoints, yPoints, 3);
        g2D.fillPolygon(xPoints, yPoints, 3);

        //g2D.setPaint(Color.magenta);
        //g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
        //g2D.drawString("I love you", 50,50);


        

    }
    
}
