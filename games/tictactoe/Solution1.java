
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Solution1 implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel titlePanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel textField = new JLabel("Tic-Tac-Toe", JLabel.CENTER);
    JButton[] buttons = new JButton[9];
    boolean player1Turn;
    JButton playAgainButton = new JButton("Play Again");

    Solution1() {

        initializeFrame();
        initializeTitlePanel();
        initializeButtonPanel();
        initializeButtons();
        firstTurn();

        playAgainButton.setFocusable(false);
        playAgainButton.setFont(new Font("MV Boli", Font.BOLD, 30));
        playAgainButton.setBounds(0, 0, 50, 50);
        playAgainButton.addActionListener(this);

        // Add the Play Again button to the button panel
        buttonPanel.add(playAgainButton);
    }

    void initializeFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(850, 600);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
    }

    void initializeTitlePanel() {
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
        buttonPanel.setLayout(new GridLayout(4, 3));
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
        // Handle Play Again button click
        if (e.getSource() == playAgainButton) {
            resetGame();
            initializeFrame();
            
            firstTurn();
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

    

    private boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (buttons[i].getText().equals("")) {
                return false; // If any button is empty, the board is not full
            }
        }
        return true; // All buttons are filled
    }

    private void check() {
        checkWinCondition("X");
        checkWinCondition("O");

        if (isBoardFull() && !textField.getText().endsWith("Wins")) {
            announceTie();
            resetGame();
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
            buttonPanel.setBackground(new Color(150, 150, 150));
            buttons[i].setEnabled(true);
        }

        // Reset player turn
        player1Turn = random.nextBoolean();
        textField.setText(player1Turn ? "X turn" : "O turn");

        // Hide Play Again button
        playAgainButton.setVisible(false);
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

    private void announceWinner(String player, int a, int b, int c) {

        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }

        if (!player.equals("")) { // Check if it's not a tie
            textField.setText(player + " Wins");
        }

        // Show Play Again button
        playAgainButton.setVisible(true);
        resetGame();
    }

    public static void main(String[] args) {
        new Solution1();
    }
}
