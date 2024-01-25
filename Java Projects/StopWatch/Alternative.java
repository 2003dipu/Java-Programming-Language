import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

public class Alternative implements ActionListener, WindowListener {

    private JFrame frame = new JFrame(); // Single frame for all instances
    private JButton startButton;
    private JButton resetButton;
    private JLabel timeLabel;

    // Global Variables
    private int elapsedTime = 0;
    private int seconds = 0;
    private int minutes = 0;
    private int hours = 0;
    private boolean started = false;
    private boolean hasOwnWindow = true; // Flag for individual window control
    private String seconds_string = String.format("%02d", seconds);
    private String minutes_string = String.format("%02d", minutes);
    private String hours_string = String.format("%02d", hours);

    private Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            elapsedTime += 1000;
            hours = (elapsedTime / 3600000);
            minutes = (elapsedTime / 60000) % 60;
            seconds = (elapsedTime / 1000) % 60;
            seconds_string = String.format("%02d", seconds);
            minutes_string = String.format("%02d", minutes);
            hours_string = String.format("%02d", hours);
            timeLabel.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
        }
    });

    public Alternative() {
        startButton = new JButton("START");
        resetButton = new JButton("RESET");
        resetButton.setBackground(Color.PINK);
        startButton.setBackground(Color.green);
        timeLabel = new JLabel();

        // Initialize UI elements with corrected placements and properties
        timeLabel.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
        timeLabel.setBounds(100, 200, 200, 50); // Adjusted position
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 35));
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);
        timeLabel.setBackground(Color.cyan);

        startButton.setBounds(50, 300, 150, 50); // Adjusted position and size
        startButton.setFont(new Font("Ink Free", Font.PLAIN, 20));
        startButton.setFocusable(false);
        startButton.addActionListener(this);

        resetButton.setBounds(250, 300, 150, 50); // Adjusted position and size
        resetButton.setFont(new Font("Ink Free", Font.PLAIN, 20));
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(startButton);
        frame.add(resetButton);
        frame.add(timeLabel);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only this window
        frame.setSize(500, 400); // Adjusted size
        frame.setLayout(null); // Consider using a layout manager for cleaner code
        frame.setTitle("Stopwatch han Huna Bopa'r ning'a"); // Removed personalized title
        frame.getContentPane().setBackground(Color.darkGray);

        // Add window listener to handle window closing event
        frame.addWindowListener(this);

        frame.setVisible(true);
    }

    public static void main(String[] args) {

        Alternative window1 = new Alternative();
        Alternative window2 = new Alternative();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (started == false) {
                started = true;
                startButton.setText("STOP");
                startButton.setBackground(Color.green);
                
                start();
            } else {
                started = false;
                startButton.setText("START");
                startButton.setBackground(Color.cyan);
                stop();
            }
        }

        if (e.getSource() == resetButton) {
            started = false;
            startButton.setText("START");
            reset();
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        closeWindow();
    }

    private void closeWindow() {
        if (hasOwnWindow) {
            frame.dispose(); // Close only this specific window
        } else {
            System.exit(0); // Close the entire application
        }
    }

    void start() {
        timer.start();
    }

    void stop() {
        timer.stop();
    }

    void reset() {
        timer.stop();
        elapsedTime = 0;
        seconds = 0;
        minutes = 0;
        hours = 0;
        seconds_string = String.format("%02d", seconds);
        minutes_string = String.format("%02d", minutes);
        hours_string = String.format("%02d", hours);
        timeLabel.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
