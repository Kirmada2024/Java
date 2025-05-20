//package com.mycompany.lectureapp.lec0505;
//
////import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionListener;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JTextField;
////import javax.swing.JLabel;
//
//public class Lecture1 {
//    
//    public static void main(String[] args) {
//
//        Font bFont = new Font("Comic Sans MS", Font.BOLD, 30);
//        Font dFont = new Font("Comic Sans MS", Font.BOLD, 40);
//        
//        JFrame f = new JFrame("calculator");
//        f.setSize(330, 540);
//        f.setVisible(true);
//        f.setLayout(null);
//        
//        JTextField display = new JTextField("0");
//        display.setEditable(false); // Prevent typing
//        display.setHorizontalAlignment(JTextField.RIGHT);
//        panel.add(display);
//
//        display.setFont(dFont);
//        display.setBounds(5, 120, 300, 80);
//        f.add(display);
//        
//        //        JLabel label = new JLabel("CDMI");
////        label.setBounds(50, 100, 300, 100);
////        label.setVisible(false);
////        f.add(label);
////        
////        JLabel title = new JLabel("xyz");
////        title.setBounds(50, 120, 100, 200);
//////        title.setFont(font);
////        title.setForeground(Color.red);
////        title.setVisible(false);
////        f.add(title);
//        
//        JButton b0  = new JButton("0");
////                 (left, top, width, height)
//        b0.setBounds(15, 435, 60, 55);
//        b0.setFont(bFont);
//        b0.addActionListener((e) -> {
//            display.setText(display.getText() + "0");
//        });
////        b0.setBackground(Color.WHITE);
////        b0.setForeground(Color.BLACK);
//        f.add(b0);
//        
//        JButton bDot  = new JButton(".");
////                 (left, top, width, height)
//        bDot.setBounds(95, 435, 60, 55);
//        bDot.setFont(bFont);
//        bDot.addActionListener((e) -> {
//            display.setText(display.getText() + ".");
//        });
////        bDot.setBackground(Color.WHITE);
////        bDot.setForeground(Color.BLACK);
//        f.add(bDot);
//        
//        JButton bAnswer = new JButton("=");
////                 (left, top, width, height)
//        bAnswer.setBounds(173, 435, 130, 55);
//        bAnswer.setFont(bFont);
//        bAnswer.addActionListener((e) -> {
//            display.setText(display.getText() + "=");
//        });
////        bAnswer.setBackground(Color.CYAN);
////        bAnswer.setForeground(Color.BLACK);
//        f.add(bAnswer);
//        
//        JButton b1  = new JButton("1");
////                 (left, top, width, height)
//        b1.addActionListener(new ActionListener() {
//    public void actionPerformed(ActionListeneronEvent e) {
//        if (display.getText().equals("0")) {
//            display.setText("1");
//        } else {
//            display.setText(display.getText() + "1");
//        }
//    }
//});
//
////        
//        JButton b2  = new JButton("2");
////                 (left, top, width, height)
//        b2.setBounds(95, 375, 60, 55);
//        b2.setFont(bFont);
//        b2.addActionListener((e) -> {
//            display.setText(display.getText() + "2");
//        });
////        b2.setBackground(Color.WHITE);
////        b2.setForeground(Color.BLACK);
//        f.add(b2);    
//        
//        JButton b3  = new JButton("3");
////                 (left, top, width, height)
//        b3.setBounds(173, 375, 60, 55);
//        b3.setFont(bFont);
//        b3.addActionListener((e) -> {
//            display.setText(display.getText() + "3");
//        });
////        b3.setBackground(Color.WHITE);
////        b3.setForeground(Color.BLACK);
//        f.add(b3);
//        
//        JButton bPlus  = new JButton("+");
////                 (left, top, width, height)
//        bPlus.setBounds(243, 375, 60, 55);
//        bPlus.setFont(bFont);
//        bPlus.addActionListener((e) -> {
//            display.setText(display.getText() + "+");
//        } );
////        bPlus.setBackground(Color.WHITE);
////        bPlus.setForeground(Color.BLACK);
//        f.add(bPlus);
//        
//        JButton b4 = new JButton("4");
////                 (left, top, width, height)
//        b4.setBounds(15, 315, 60, 55);
//        b4.setFont(bFont);
//        b4.addActionListener((e) -> {
//            display.setText(display.getText() + "4");
//        });
////        b4.setBackground(Color.WHITE);
////        b4.setForeground(Color.BLACK);
//        f.add(b4);
//        
//        JButton b5 = new JButton("5");
////                 (left, top, width, height)
//        b5.setBounds(95, 315, 60, 55);
//        b5.setFont(bFont);
//        b5.addActionListener((e) -> {
//            display.setText(display.getText() + "5");
//        });
////        b5.setBackground(Color.WHITE);
////        b5.setForeground(Color.BLACK);
//        f.add(b5);
//        
//        JButton b6 = new JButton("6");
////                 (left, top, width, height)
//        b6.setBounds(173, 315, 60, 55);
//        b6.setFont(bFont);
//        b6.addActionListener((e) -> {
//            display.setText(display.getText() + "6");
//        });
////        b6.setBackground(Color.WHITE);
////        b6.setForeground(Color.BLACK);
//        f.add(b6);
//        
//        JButton bMinus = new JButton("-");
////                 (left, top, width, height)
//        bMinus.setBounds(243, 315, 60, 55);
//        bMinus.setFont(bFont);
//        bMinus.addActionListener((e) -> {
//            display.setText(display.getText() + "-");
//        });
////        bMinus.setBackground(Color.WHITE);
////        bMinus.setForeground(Color.BLACK);
//        f.add(bMinus);
//        
//        JButton b7 = new JButton("7");
////                 (left, top, width, height)
//        b7.setBounds(15, 255, 60, 55);
//        b7.setFont(bFont);
//        b7.addActionListener((e) -> {
//            display.setText(display.getText() + "7");
//        });
////        b7.setBackground(Color.WHITE);
////        b7.setForeground(Color.BLACK);
//        f.add(b7);
//        
//        JButton b8 = new JButton("8");
////                 (left, top, width, height)
//        b8.setBounds(95, 255, 60, 55);
//        b8.setFont(bFont);
//        b8.addActionListener((e) -> {
//            display.setText(display.getText() + "8");
//        });
////        b8.setBackground(Color.WHITE);
////        b8.setForeground(Color.BLACK);
//        f.add(b8);
//        
//        JButton b9 = new JButton("9");
////                 (left, top, width, height)
//        b9.setBounds(173, 255, 60, 55);
//        b9.setFont(bFont);
//        b9.addActionListener((e) -> {
//            display.setText(display.getText() + "9");
//        });
////        b9.setBackground(Color.WHITE);
////        b9.setForeground(Color.BLACK);
//        f.add(b9);
//        
//        JButton bMultiply = new JButton("X");
////                 (left, top, width, height)
//        bMultiply.setBounds(243, 255, 60, 55);
//        bMultiply.setFont(bFont);
//        bMultiply.addActionListener((e) -> {
//            display.setText(display.getText() + "X");
//        });
////        bMultiply.setBackground(Color.WHITE);
////        bMultiply.setForeground(Color.BLACK);
//        f.add(bMultiply);
//        
//        JButton bAllClear = new JButton("AC");
////                 (left, top, width, height)
//        bAllClear.setBounds(03, 195, 75, 55);
//        bAllClear.setFont(bFont);
//        bAllClear.addActionListener((e)->{
//            display.setText("");
//        });
//        
////        bAllClear.setBackground(Color.WHITE);
////        bAllClear.setForeground(Color.BLACK);
//        f.add(bAllClear);
//        
//        JButton bBackSpace = new JButton("BS");
////                 (left, top, width, height)
//        bBackSpace.setBounds(88, 195, 75, 55);
//        bBackSpace.setFont(bFont);
//        bBackSpace.addActionListener((e) -> {
//            display.setText(display.getText() + "");
//        });
////        bBackSpace.setBackground(Color.WHITE);
////        bBackSpace.setForeground(Color.BLACK);
//        f.add(bBackSpace);
//        
//        JButton bPercentage = new JButton("%");
////                 (left, top, width, height)
//        bPercentage.setBounds(173, 195, 60, 55);
//        bPercentage.setFont(bFont);
//        bPercentage.addActionListener((e) -> {
//            display.setText(display.getText() + "%");
//        });
////        bPercentage.setBackground(Color.WHITE);
////        bPercentage.setForeground(Color.BLACK);
//        f.add(bPercentage);
//        
//        JButton bDivision = new JButton("/");
////                 (left, top, width, height)
//        bDivision.setBounds(243, 195, 60, 55);
//        bDivision.setFont(bFont);
//        bDivision.addActionListener((e) -> {
//            display.setText(display.getText() + "/");
//        });
////        bDivision.setBackground(Color.WHITE);
////        bDivision.setForeground(Color.BLACK);
//        f.add(bDivision);
//    }
//}