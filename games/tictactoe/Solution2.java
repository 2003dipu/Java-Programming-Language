
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Solution2 implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel titlePanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel textField = new JLabel("Tic-Tac-Toe", JLabel.CENTER);
    JButton[] buttons = new JButton[9];
    boolean player1Turn;

    Solution2() {

        initializeFrame();
        initializeTitlePanel();
        initializeButtonPanel();
        initializeButtons();
        firstTurn();

    }

    private void initializeFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(850, 600);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
    }

    private void initializeTitlePanel() {
        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(25, 255, 0));
        textField.setFont(new Font("Ink Free", Font.BOLD, 75));
        textField.setOpaque(true);

        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBounds(0, 0, 800, 100);
        titlePanel.add(textField);
        frame.add(titlePanel, BorderLayout.NORTH);
    }

    private void initializeButtonPanel() {
        buttonPanel.setLayout(new GridLayout(3, 3));
        buttonPanel.setBackground(new Color(150, 150, 150));
        frame.add(buttonPanel);
    }

    private void initializeButtons() {
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                handleButtonClick(i);
            }
        }

    }

    private void handleButtonClick(int i) {
        String playerSymbol = player1Turn ? "X" : "O";
        makeMove(i, playerSymbol, player1Turn ? "O turn" : "X turn");
    }

    private void makeMove(int i, String symbol, String turnText) {
        if (buttons[i].getText().equals("")) {
            buttons[i].setForeground(player1Turn ? new Color(255, 0, 0) : new Color(0, 0, 255));
            buttons[i].setText(symbol);
            player1Turn = !player1Turn;
            textField.setText(turnText);
            check();
        }
    }

    private void firstTurn() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        player1Turn = random.nextInt(2) == 0;
        textField.setText(player1Turn ? "X turn" : "O turn");
    }

    private void checkWinCondition(String player) {
        for (int i = 0; i < 3; i++) {
            // Check horizontal
            if ((buttons[i * 3].getText().equals(player)) &&
                    (buttons[i * 3 + 1].getText().equals(player)) &&
                    (buttons[i * 3 + 2].getText().equals(player))) {
                announceWinner(player, i * 3, i * 3 + 1, i * 3 + 2);
            }

            // Check vertical
            if ((buttons[i].getText().equals(player)) &&
                    (buttons[i + 3].getText().equals(player)) &&
                    (buttons[i + 6].getText().equals(player))) {
                announceWinner(player, i, i + 3, i + 6);
            }
        }

        // Check diagonal
        if ((buttons[0].getText().equals(player)) &&
                (buttons[4].getText().equals(player)) &&
                (buttons[8].getText().equals(player))) {
            announceWinner(player, 0, 4, 8);
        }

        if ((buttons[2].getText().equals(player)) &&
                (buttons[4].getText().equals(player)) &&
                (buttons[6].getText().equals(player))) {
            announceWinner(player, 2, 4, 6);
        }
    }

    // Add this method to the TicTacToe class
    private boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (buttons[i].getText().equals("")) {
                return false; // If any button is empty, the board is not full
            }
        }
        return true; // All buttons are filled
    }

    // Modify the check method to include tie condition
    public void check() {
        checkWinCondition("X");
        checkWinCondition("O");

        if (isBoardFull() && !textField.getText().endsWith("Wins")) {
            announceTie();
        }
    }

    // Add this method to announce a tie
    private void announceTie() {
        textField.setText("It's a Tie!");
        resetGame();
    }

    private void resetGame() {
        // Clear button text and backgrounds
        for (int i = 0; i < 9; i++) {
            buttons[i].setText("");
            // buttons[i].setBackground(null);
            buttonPanel.setBackground(new Color(150, 150, 150));
            buttons[i].setEnabled(true);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Reset player turn
        player1Turn = random.nextBoolean();
        buttonPanel.setBackground(new Color(150, 150, 150));
        textField.setText(player1Turn ? "X turn" : "O turn");
    }

    // Modify the announceWinner method to avoid setting text in case of a tie
    private void announceWinner(String player, int a, int b, int c) {

        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }

        if (!player.equals("")) { // Check if it's not a tie
            textField.setText(player + " Wins");

            resetGame();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }

    public static void main(String[] args) {
        new Solution2();
    }
}
