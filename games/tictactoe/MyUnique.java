
// project name: Tic Tac Toe game in Java. I shortened Bro Code's code after two days of thinking. 239 -> 174 lines

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyUnique implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player_turn;
    String player;

    private void frameComponent() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Tic Tac Toe against weak Computer");
        frame.setSize(850, 600);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        textfield.setBackground(new Color(25, 25, 25));
        textfield.setForeground(new Color(25, 255, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);
        button_panel.setLayout(new GridLayout(3, 3));
        button_panel.setBackground(new Color(150, 150, 150));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        player = (player_turn == true) ? "X" : "O";
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (player_turn) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(255, 0, 0));
                        buttons[i].setText(player);
                        player_turn = false;
                        player = player_turn ? "X" : "O";
                        textfield.setText(player + " turn");
                        check(player);
                    }

                } else {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(0, 0, 255));
                        buttons[i].setText(player);
                        player_turn = true;
                        player = player_turn ? "X" : "O";
                        textfield.setText(player + " turn");
                        check(player);
                    }
                }
            }
        }
    }

    private void firstTurn() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        player_turn = random.nextBoolean();
        textfield.setText(player_turn ? "X turn" : "O turn");
    }

    private void check(String pickPlayer) {

        // check win condition
        // check horizontal
        if ((buttons[0].getText() == player) &&
                (buttons[1].getText() == player) &&
                (buttons[2].getText() == player)) {
            winCondition(pickPlayer, 0, 1, 2);
        }

        if ((buttons[3].getText() == player) &&
                (buttons[4].getText() == player) &&
                (buttons[5].getText() == player)) {
            winCondition(pickPlayer, 3, 4, 5);
        }

        if ((buttons[6].getText() == player) &&
                (buttons[7].getText() == player) &&
                (buttons[8].getText() == player)) {
            winCondition(pickPlayer, 6, 7, 8);
        }

        // check vertical
        if ((buttons[0].getText() == player) &&
                (buttons[3].getText() == player) &&
                (buttons[6].getText() == player)) {
            winCondition(pickPlayer, 0, 3, 6);
        }

        if ((buttons[1].getText() == player) &&
                (buttons[4].getText() == player) &&
                (buttons[7].getText() == player)) {
            winCondition(pickPlayer, 1, 4, 7);
        }

        if ((buttons[2].getText() == player) &&
                (buttons[5].getText() == player) &&
                (buttons[8].getText() == player)) {
            winCondition(pickPlayer, 2, 5, 8);
        }

        // check diagonal
        if ((buttons[0].getText() == player) &&
                (buttons[4].getText() == player) &&
                (buttons[8].getText() == player)) {
            winCondition(pickPlayer, 0, 4, 8);
        }

        if ((buttons[2].getText() == player) &&
                (buttons[4].getText() == player) &&
                (buttons[6].getText() == player)) {
            winCondition(pickPlayer, 2, 4, 6);
        }
    }

    private void winCondition(String player, int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        textfield.setText(player + " Wins");

        for (int i = 0; i < 9; i++) {

            buttons[i].setEnabled(false);
        }
    }

    MyUnique() {

        frameComponent();
        firstTurn();
    }

    public static void main(String[] args) {
        new MyUnique();
    }
}
