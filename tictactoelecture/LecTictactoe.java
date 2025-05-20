package com.mycompany.lectureapp.tictactoelecture;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LecTictactoe {

    public static void main(String[] args) {
        new TicTacToeGame();
    }
}

class TicTacToeGame extends JFrame {

    Font dFont = new Font("Comic Sans MS", Font.BOLD, 40);
    JButton[] button = new JButton[9];
    int clickCount = 0;
    JLabel winText;
    JButton restartButton;

    public TicTacToeGame() {
        setTitle("Tic Tac Toe");
        setSize(330, 470); // Increased height to fit restart button
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                myButton(k, j * 100, i * 100);
                k++;
            }
        }

        winText = new JLabel();
        winText.setBounds(20, 305, 300, 50);
        winText.setFont(dFont);
        add(winText);

        restartButton = new JButton("Restart Game");
        restartButton.setFont(new Font("Arial", Font.BOLD, 16));
        restartButton.setBounds(90, 370, 150, 40);
        restartButton.addActionListener(e -> resetGame());
        add(restartButton);
    }

    public void myButton(int index, int x, int y) {
        JButton b = new JButton();
        b.setFont(dFont);
        b.setBounds(x, y, 100, 100);
        add(b);
        button[index] = b;

        b.addActionListener((e) -> buttonClick(index));
    }

    public void buttonClick(int index) {
        if (!button[index].isEnabled() || !button[index].getText().isEmpty()) {
            return;
        }

        button[index].setText(clickCount % 2 == 0 ? "X" : "O");
        clickCount++;
        checkWin();
    }

    void checkWin() {
        int[][] wins = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
            {0, 4, 8}, {2, 4, 6}
        };

        for (int[] combo : wins) {
            String a = button[combo[0]].getText();
            String b = button[combo[1]].getText();
            String c = button[combo[2]].getText();

            if (!a.isEmpty() && a.equals(b) && b.equals(c)) {
                winText.setText(a + " WINS!");
                disableButtons();
                return;
            }
        }

        if (clickCount == 9) {
            winText.setText("DRAW!");
        }
    }

    void disableButtons() {
        for (JButton btn : button) {
            btn.setEnabled(false);
        }
    }

    void resetGame() {
        for (JButton btn : button) {
            btn.setText("");
            btn.setEnabled(true);
        }
        clickCount = 0;
        winText.setText("");
    }
}
