import javax.swing.JPanel;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.awt.*;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 1000;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
    static final int DELAY = 100;

    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];

    int bodyParts = 6;
    int applesEaten = 0;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    GamePanel() {

        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener( new MyKeyAdapter()); // The key Events doesn't work
        startGame();
    }

    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {

        if (running) {
            
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                } else {
                    // g.setColor(new Color(45, 180, 0));
                    g.setColor(new Color(random.nextInt(255), random.nextInt(255),
                            random.nextInt(255))); // multi-color snake
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
            }
            g.setColor(Color.red);
            g.setFont(new Font("Ink Free", Font.BOLD, 45));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score: " + applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score: " + applesEaten)) / 2,
                    g.getFont().getSize());

        } else {
            gameOver(g);
        }

    }

    public void newApple() {
        appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
        appleY = random.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
    }

    public void move() {
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        switch (direction) {
            case 'U':
                y[0] = y[0] - UNIT_SIZE;
                break;
            case 'D':
                y[0] = y[0] + UNIT_SIZE;
                break;
            case 'L':
                x[0] = x[0] - UNIT_SIZE;
                break;
            case 'R':
                x[0] = x[0] + UNIT_SIZE;
                break;
        }
    }

    public void checkApple() {
        if ((x[0] == appleX) && y[0] == appleY) {
            bodyParts++;
            applesEaten++;
            newApple();
        }
    }

    public void checkCollisions() {
        // checks if head collides with body
        for (int i = bodyParts; i > 0; i--) {
            if ((x[0] == x[i]) && y[0] == y[i]) {
                running = false;
            }
        }
        // checks if head touches left border
        if (x[0] < 0) {
            running = false;
        }

        // checks if head touches right border
        if (x[0] > SCREEN_WIDTH) {
            running = false;
        }

        // checks if head touches top border
        if (y[0] < 0) {
            running = false;
        }
        // checks if head touches bottom border
        if (y[0] > SCREEN_HEIGHT) {
            running = false;
        }
        if (!running) {
            timer.stop();
        }
    }

    public void gameOver(Graphics g) {
        // Score
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 45));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Score: " + applesEaten, (SCREEN_WIDTH - metrics1.stringWidth("Score: " + applesEaten)) / 2,
                g.getFont().getSize());
        // Game Over text
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 75));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("Game Over", (SCREEN_WIDTH - metrics2.stringWidth("Game Over")) / 2, SCREEN_HEIGHT / 2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkApple();
            checkCollisions();
        }
        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter{

        @Override  // Override causes an error
        public void keyPressed(KeyEvent e) {
            
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:

                    if (direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;
            }
        }
    }
}

/*
 * 
 * This is really goijng to be funny. We can do it if we want. I code everyday
 * and I enjoy doing it everyday.
 * I will continue to do it everyday. As long as I stay healthy, and ambitious,
 * I will code. I love coding.
 * I don't make money coding yet I love writing codes. You know what dude,
 * This is going to be really good, right? Don't you know dude? I think I can do
 * it as long as I stay ambitious.
 * Right now I am doing this for a reason.
 * Whatever I am doing now, I am doing this to show my expertise to a imposing
 * lady and to potentially avoid
 * I think I can do it as long as she is here in my house.
 * I she is going to have a long conversation with my mother. She is really
 * emerged into the conversation.
 * This is really going to be boring for some moment dude. I think I can do it
 * yeah as long as I am not
 * confident enough to avoid to face her. Yeah, it's sometimes fascinating.
 * That's really important dude, what?
 * What are you going to do now? I don't know. But I hear that she is recounting
 * her story of charity.
 * 
 * She has satisfied a lots of street begger, and poor by giving them foods for
 * a week and giving them
 * 
 * This is really good dude. I can't really tell her amazing life stories. She
 * has really stories. She has really
 * helped thousand of peopole in the world. This is really amazing. Her name is
 * Chamelie Sinha. She has recently
 * built a house nearby me. She is curioius to share her story with us. Us means
 * me, my father and mother inside
 * our earth built house.
 * 
 * Her story is worth sharing. I thought I should give her an idea. I told her
 * "I have an idea. Your life story
 * is great. So why don't you write an autobiography? "
 * She said, people will write her biography. She does not like writing a book,
 * rather she would be happy
 * to get someone to write her biography. She I thought why don't I find
 * someone, an author, to write her
 * biography. She had used her talent to do design. She also used to do business
 * of tea.
 * 
 * rupa poisar byapar ou thar. She said while telling her business story of this
 * 
 * tar loge mor na bonil, me khayousu. Opagate me sadaron jela gonay. Apagate me
 * biral gonay, ta idur go.
 * 
 * /*
             * // Grid Lines background
             * for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) {
             * g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
             * g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
             * }
            
 * 
 * 
 * 
 */