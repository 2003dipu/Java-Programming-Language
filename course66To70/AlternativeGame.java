import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

public class AlternativeGame {

    JFrame frame;
    JLabel label;

    Action moveAction;

    // Define constants for the key bindings and the movement amount
    public static final String UP = "UP";
    public static final String DOWN = "DOWN";
    public static final String LEFT = "LEFT";
    public static final String RIGHT = "RIGHT";
    public static final int MOVE = 10;

    AlternativeGame() {

        frame = new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(100, 100, 100, 100);
        label.setOpaque(true);

        // Create a single moveAction with the direction and the amount as parameters
        moveAction = new MoveAction();

        // Use the constants for the key bindings
        label.getInputMap().put(KeyStroke.getKeyStroke(UP), UP);
        label.getActionMap().put(UP, moveAction);

        label.getInputMap().put(KeyStroke.getKeyStroke(DOWN), DOWN);
        label.getActionMap().put(DOWN, moveAction);

        label.getInputMap().put(KeyStroke.getKeyStroke(LEFT), LEFT);
        label.getActionMap().put(LEFT, moveAction);

        label.getInputMap().put(KeyStroke.getKeyStroke(RIGHT), RIGHT);
        label.getActionMap().put(RIGHT, moveAction);

        frame.add(label);
        frame.setVisible(true);
    }

    // Define a single MoveAction class that takes the direction and the amount as parameters
    public class MoveAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Get the direction from the action command
            String direction = e.getActionCommand();
            // Move the label according to the direction and the amount
            switch (direction) {
                case UP:
                    label.setLocation(label.getX(), label.getY() - MOVE);
                    break;
                case DOWN:
                    label.setLocation(label.getX(), label.getY() + MOVE);
                    break;
                case LEFT:
                    label.setLocation(label.getX() - MOVE, label.getY());
                    break;
                case RIGHT:
                    label.setLocation(label.getX() + MOVE, label.getY());
                    break;
            }
        }

    }

}
