package com.mycompany.lectureapp.lec0505;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

enum Equation {
    ADD, SUB, MULTI, DIV
}

public class LectureCalculator {

    public static JLabel display;
    public static String firstValue = "";
    public static Equation eq = (null);

    public static void main(String[] args) {

        Font dFont = new Font("Comic Sans MS", Font.BOLD, 30);
        Font bFont = new Font("Comic Sans MS", Font.BOLD, 25);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(310, 400);

        display = new JLabel("");
        display.setFont(dFont);
        display.setBounds(10, 10, 280, 80);
        frame.add(display);

        JButton b1 = new JButton("1");
        b1.setBounds(10, 100, 60, 60);
        b1.setFont(bFont);
        b1.addActionListener((e) -> {
            display.setText(display.getText() + "1");
        });
//        b1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                
//            }
//        });
        frame.add(b1);

        JButton b2 = new JButton("2");
        b2.setBounds(80, 100, 60, 60);
        b2.setFont(bFont);
        b2.addActionListener((e) -> {
            display.setText(display.getText() + "2");
        });
        frame.add(b2);

        JButton b3 = new JButton("3");
        b3.setBounds(150, 100, 60, 60);
        b3.setFont(bFont);
        b3.addActionListener((e) -> {
            display.setText(display.getText() + "3");
        });
        frame.add(b3);

        JButton b4 = new JButton("4");
        b4.setBounds(220, 100, 60, 60);
        b4.setFont(bFont);
        b4.addActionListener((e) -> {
            display.setText(display.getText() + "4");
        });
        frame.add(b4);

        JButton bPlus = new JButton("+");
        bPlus.setBounds(10, 170, 60, 60);
        bPlus.setFont(bFont);
        bPlus.addActionListener((e) -> {
            applyEquation();
            display.setText("");
            eq = Equation.ADD;
        });
        frame.add(bPlus);

        JButton bMinus = new JButton("-");
        bMinus.setBounds(80, 170, 60, 60);
        bMinus.setFont(bFont);
        bMinus.addActionListener((e) -> {
            applyEquation();
            display.setText("");
            eq = Equation.SUB;
        });
        frame.add(bMinus);

        JButton bClear = new JButton("C");
        bClear.setBounds(150, 170, 60, 60);
        bClear.setFont(bFont);
        bClear.addActionListener((e) -> {
            display.setText("");
            eq = null;
            firstValue = "";
        });
        frame.add(bClear);

        JButton bAnswer = new JButton("=");
        bAnswer.setBounds(220, 170, 60, 60);
        bAnswer.setFont(bFont);
        frame.add(bAnswer);
        bAnswer.addActionListener((e) -> {
            applyEquation();
            display.setText(firstValue);
        });

        JButton bDot = new JButton(".");
        bDot.setBounds(10, 240, 60, 60);
        bDot.setFont(bFont);
        bDot.addActionListener((e) -> {
            if (!display.getText().contains(".")) {
                display.setText(display.getText() + ".");
            }
        });
        frame.add(bDot);

        JButton bZero = new JButton("0");
        bZero.setBounds(80, 240, 60, 60);
        bZero.setFont(bFont);
        bZero.addActionListener((e) -> {
            if (!"0".equals(display.getText())) {
                display.setText(display.getText() + "0");
            }
        });
        frame.add(bZero);

        JButton bErase = new JButton("<");
        bErase.setBounds(150, 240, 60, 60);
        bErase.setFont(bFont);
        bErase.addActionListener((e) -> {
            if (display.getText().length() > 0) {
                String vv = display.getText().substring(0,display.getText().length()-1 );
                display.setText(vv);
            }
        });
        frame.add(bErase);
    }

    public static void applyEquation() {
        if (firstValue.equals("")) {
            firstValue = display.getText();
            return;
        }
        int a = Integer.parseInt(firstValue);
        int b = Integer.parseInt(display.getText());
        int total = 0;
        switch (eq) {
            case ADD -> {
                total = a + b;
            }
            case SUB -> {
                total = a - b;
            }
            case MULTI -> {
                total = a * b;
            }
            case DIV -> {
                total = a / b;
            }
        }
        firstValue = "" + total;
    }
}