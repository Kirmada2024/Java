package com.mycompany.lectureapp.lec2005;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LecNumberPuzzLe {

    public static void main(String[] args) {
        new LecNumberPuzzleGame();
    }
}

class LecNumberPuzzleGame extends JFrame {

    Font dFont = new Font("Comic Sans MS", Font.BOLD, 40);
    JButton[] button = new JButton[9];

    public LecNumberPuzzleGame() {
        setTitle("Lec Number Puzzle");
        setSize(330, 470);
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
    }

    public void myButton(int index, int x, int y) {
        JButton b = new JButton();
        b.setFont(dFont);
        b.setBounds(x, y, 100, 100);
        if (index + 1 != 9) {
            b.setText("" + (index + 1));
        }
        add(b);
        button[index] = b;

        b.addActionListener((e) -> buttonClick(index));
    }

    public void buttonClick(int index) {
        switch (index) {
            case 0:
                break;
            case 7:
                if (button[8].getText().isEmpty()) {
                    button[8].setText(button[7].getText());
                    button[7].setText("");
                }
                break;
            case 8:
                if (button[7].getText().isEmpty()) {
                    button[7].setText(button[8].getText());
                    button[8].setText("");
                }
                break;
            case 4:
                if (button[1].getText().isEmpty()) {
                    button[1].setText(button[4].getText());
                    button[4].setText("");
                } else if (button[3].getText().isEmpty()) {
                    button[3].setText(button[4].getText());
                    button[4].setText("");
                } 
                else if (button[5].getText().isEmpty()) {
                    button[5].setText(button[4].getText());
                    button[4].setText("");
                } else if (button[7].getText().isEmpty()) {
                    button[7].setText(button[4].getText());
                    button[4].setText("");
                }                
        }
    }

}
