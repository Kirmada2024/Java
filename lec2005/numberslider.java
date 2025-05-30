package com.mycompany.lectureapp.lec2005;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class numberslider {

    public static void main(String[] args) {
        new numberpuzzlegame();
    }
}

class numberpuzzlegame extends JFrame {

    Font dFont = new Font("Comic Sans MS", Font.BOLD, 40);
    JButton[] button = new JButton[9];

    public numberpuzzlegame() {
        setTitle("Number Puzzle");
        setSize(330, 470);
        setLayout(null);
        setVisible(true);

        createButtons();
        shuffleButtons();
    }

    public void createButtons() {
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton b = new JButton();
                b.setFont(dFont);
                b.setBounds(j * 100, i * 100, 100, 100);
                add(b);
                button[k] = b;

                final int index = k;
                b.addActionListener((ActionEvent e) -> {
                    buttonClick(index);
                });

                k++;
            }
        }
    }

    public void shuffleButtons() {
        ArrayList<String> numbers = new ArrayList<>();

//        while (numbers.size() < 9) {
//            int ran = new Random().nextInt(9);
//            if (!numbers.contains("" + ran)) {
//                numbers.add("" + ran);
//            }
//        }
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("5");
        numbers.add("6");
        numbers.add("7");
        numbers.add("8");
        numbers.add("0");

        for (int i = 0; i < 9; i++) {
            if ("0".equals(numbers.get(i))) {
                button[i].setText("");
            } else {
                button[i].setText(numbers.get(i));
            }
        }
    }

    public void buttonClick(int index) {
        
        
        
        wincheck();
    }

    void wincheck() {
        for (int i = 1; i < 9; i++) {
            if (!button[i - 1].getText().equals("" + i)) {
                return;
            }
        }
        
        System.out.println("game over");
    }

}
