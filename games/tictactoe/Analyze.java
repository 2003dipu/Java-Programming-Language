
// Bing suggests to shorten my codes in check method
public void check() {
    // check X win condition
    // check horizontal
    for (int i = 0; i < 3; i++) {
        if ((buttons[i][0].getText() == "X") && 
            (buttons[i][1].getText() == "X") &&
            (buttons[i][2].getText() == "X")) {
            xWins(i, 0, i, 1, i, 2);
        }
    }

    // check vertical
    for (int j = 0; j < 3; j++) {
        if ((buttons[0][j].getText() == "X") && 
            (buttons[1][j].getText() == "X") &&
            (buttons[2][j].getText() == "X")) {
            xWins(0, j, 1, j, 2, j);
        }
    }

    // check diagonal
    if ((buttons[0][0].getText() == "X") && 
        (buttons[1][1].getText() == "X") &&
        (buttons[2][2].getText() == "X")) {
        xWins(0, 0, 1, 1, 2, 2);
    }

    if ((buttons[0][2].getText() == "X") && 
        (buttons[1][1].getText() == "X") &&
        (buttons[2][0].getText() == "X")) {
        xWins(0, 2, 1, 1, 2, 0);
    }

    // check O win condition
    // check horizontal
    for (int i = 0; i < 3; i++) {
        if ((buttons[i][0].getText() == "O") && 
            (buttons[i][1].getText() == "O") &&
            (buttons[i][2].getText() == "O")) {
            oWins(i, 0, i, 1, i, 2);
        }
    }

    // check vertical
    for (int j = 0; j < 3; j++) {
        if ((buttons[0][j].getText() == "O") && 
            (buttons[1][j].getText() == "O") &&
            (buttons[2][j].getText() == "O")) {
            oWins(0, j, 1, j, 2, j);
        }
    }

    // check diagonal
    if ((buttons[0][0].getText() == "O") && 
        (buttons[1][1].getText() == "O") &&
        (buttons[2][2].getText() == "O")) {
        oWins(0, 0, 1, 1, 2, 2);
    }

    if ((buttons[0][2].getText() == "O") && 
        (buttons[1][1].getText() == "O") &&
        (buttons[2][0].getText() == "O")) {
        oWins(0, 2, 1, 1, 2, 0);
    }
}

public void xWins(int a, int b, int c, int d, int e, int f) {
    buttons[a][b].setBackground(Color.GREEN);
    buttons[c][d].setBackground(Color.GREEN);
    buttons[e][f].setBackground(Color.GREEN);

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            buttons[i][j].setEnabled(false);
        }
    }
    textfield.setText("X Wins");
}

public void oWins(int a, int b, int c, int d, int e, int f) {
    buttons[a][b].setBackground(Color.GREEN);
    buttons[c][d].setBackground(Color.GREEN);
    buttons[e][f].setBackground(Color.GREEN);

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            buttons[i][j].setEnabled(false);
        }
    }
    textfield.setText("O Wins");
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Bard suggests to shorten my codes in check method


public void check() {
  String playerSymbol = getCurrentPlayerSymbol(); // X or O
  int[][] winningConditions = {
    {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // rows
    {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // columns
    {0, 4, 8}, {2, 4, 6} // diagonals
  };

  for (int[] condition : winningConditions) {
    if (buttons[condition[0]].getText().equals(playerSymbol) &&
        buttons[condition[1]].getText().equals(playerSymbol) &&
        buttons[condition[2]].getText().equals(playerSymbol)) {
      win(playerSymbol, condition[0], condition[1], condition[2]);
      break;
    }
  }
}

private void win(String playerSymbol, int a, int b, int c) {
  buttons[a].setBackground(Color.GREEN);
  buttons[b].setBackground(Color.GREEN);
  buttons[c].setBackground(Color.GREEN);

  for (int i = 0; i < 9; i++) {
    buttons[i].setEnabled(false);
  }

  textfield.setText(playerSymbol + " Wins");
}

private String getCurrentPlayerSymbol() {
  // Implement logic to determine current player
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ChatGPT suggests to shorten my codes in check method


public void check() {
    checkWinCondition("X");
    checkWinCondition("O");
}

private void checkWinCondition(String player) {
    // Check horizontal, vertical, and diagonal win conditions
    for (int i = 0; i < 3; i++) {
        // Check horizontal
        if ((buttons[i * 3].getText() == player) &&
            (buttons[i * 3 + 1].getText() == player) &&
            (buttons[i * 3 + 2].getText() == player)) {
            announceWinner(player, i * 3, i * 3 + 1, i * 3 + 2);
        }

        // Check vertical
        if ((buttons[i].getText() == player) &&
            (buttons[i + 3].getText() == player) &&
            (buttons[i + 6].getText() == player)) {
            announceWinner(player, i, i + 3, i + 6);
        }
    }

    // Check diagonal
    if ((buttons[0].getText() == player) &&
        (buttons[4].getText() == player) &&
        (buttons[8].getText() == player)) {
        announceWinner(player, 0, 4, 8);
    }

    if ((buttons[2].getText() == player) &&
        (buttons[4].getText() == player) &&
        (buttons[6].getText() == player)) {
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

    textfield.setText(player + " Wins");
}
