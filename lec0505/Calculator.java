package com.mycompany.lectureapp.lec0505;

//import java.awt.Color;
//import static com.mycompany.lectureapp.lec0505.Equation.ADD;
//import static com.mycompany.lectureapp.lec0505.Equation.DIV;
//import static com.mycompany.lectureapp.lec0505.Equation.MULTI;
//import static com.mycompany.lectureapp.lec0505.Equation.SUB;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JLabel;

enum Calculation {
    ADD, SUB, MULTI, DIV, PER
}

public class Calculator {
    
    public static JLabel display;
    public static String firstValue = "";
    public static Calculation cl = null;
    
    public static void main(String[] args) {

        Font bFont = new Font("Comic Sans MS", Font.BOLD, 30);
        Font dFont = new Font("Comic Sans MS", Font.BOLD, 40);
        
        JFrame f = new JFrame("calculator");
        f.setSize(330, 540);
        f.setVisible(true);
        f.setLayout(null);
        
        display = new JLabel("");
        display.setFont(dFont);
        display.setBounds(5, 120, 300, 80);
        f.add(display);
        
        JButton b0  = new JButton("0");
//                 (left, top, width, height)
        b0.setBounds(15, 435, 60, 55);
        b0.setFont(bFont);
        b0.addActionListener((e) -> {
            if (!"0".equals(display.getText())) {
                display.setText(display.getText() + "0");
            }
        });
        f.add(b0);
        
        JButton bDot  = new JButton(".");
//                 (left, top, width, height)
        bDot.setBounds(95, 435, 60, 55);
        bDot.setFont(bFont);
        bDot.addActionListener((e) -> {
            if (!display.getText().contains(".")) {
                display.setText(display.getText() + ".");
            }
        });
        f.add(bDot);
        
        JButton bAnswer = new JButton("=");
//                 (left, top, width, height)
        bAnswer.setBounds(173, 435, 130, 55);
        bAnswer.setFont(bFont);
        f.add(bAnswer);
        bAnswer.addActionListener((e) -> {
            applyCalculation();
            display.setText(firstValue);
        });
          f.add(bAnswer);
        
        JButton b1  = new JButton("1");
//                 (left, top, width, height)
        b1.setBounds(15, 375, 60, 55);
        b1.setFont(bFont);
        b1.addActionListener((e) -> {
            display.setText(display.getText() + "1");
        });
        f.add(b1);
        
        JButton b2  = new JButton("2");
//                 (left, top, width, height)
        b2.setBounds(95, 375, 60, 55);
        b2.setFont(bFont);
        b2.addActionListener((e) -> {
            display.setText(display.getText() + "2");
        });
        f.add(b2);    
        
        JButton b3  = new JButton("3");
//                 (left, top, width, height)
        b3.setBounds(173, 375, 60, 55);
        b3.setFont(bFont);
        b3.addActionListener((e) -> {
            display.setText(display.getText() + "3");
        });
        f.add(b3);
        
        JButton bPlus  = new JButton("+");
//                 (left, top, width, height)
        bPlus.setBounds(243, 375, 60, 55);
        bPlus.setFont(bFont);
        bPlus.addActionListener( (e) -> {
            applyCalculation();
            display.setText("");
            cl = Calculation.ADD;
        });
        f.add(bPlus);
        
        JButton b4 = new JButton("4");
//                 (left, top, width, height)
        b4.setBounds(15, 315, 60, 55);
        b4.setFont(bFont);
        b4.addActionListener((e) -> {
            display.setText(display.getText() + "4");
        });
        f.add(b4);
        
        JButton b5 = new JButton("5");
//                 (left, top, width, height)
        b5.setBounds(95, 315, 60, 55);
        b5.setFont(bFont);
        b5.addActionListener((e) -> {
            display.setText(display.getText() + "5");
        });
        f.add(b5);
        
        JButton b6 = new JButton("6");
//                 (left, top, width, height)
        b6.setBounds(173, 315, 60, 55);
        b6.setFont(bFont);
        b6.addActionListener((e) -> {
            display.setText(display.getText() + "6");
        });
        f.add(b6);
        
        JButton bMinus = new JButton("-");
//                 (left, top, width, height)
        bMinus.setBounds(243, 315, 60, 55);
        bMinus.setFont(bFont);
        bMinus.addActionListener((e) -> {
            
            applyCalculation();
            display.setText("");
            cl = Calculation.SUB;
        });
        f.add(bMinus);
        
        JButton b7 = new JButton("7");
//                 (left, top, width, height)
        b7.setBounds(15, 255, 60, 55);
        b7.setFont(bFont);
        b7.addActionListener((e) -> {
            display.setText(display.getText() + "7");
        });
        f.add(b7);
        
        JButton b8 = new JButton("8");
//                 (left, top, width, height)
        b8.setBounds(95, 255, 60, 55);
        b8.setFont(bFont);
        b8.addActionListener((e) -> {
            display.setText(display.getText() + "8");
        });
        f.add(b8);
        
        JButton b9 = new JButton("9");
//                 (left, top, width, height)
        b9.setBounds(173, 255, 60, 55);
        b9.setFont(bFont);
        b9.addActionListener((e) -> {
            display.setText(display.getText() + "9");
        });
        f.add(b9);
        
        JButton bMultiply = new JButton("*");
//                 (left, top, width, height)
        bMultiply.setBounds(243, 255, 60, 55);
        bMultiply.setFont(bFont);
        bMultiply.addActionListener((e) -> {
            
            applyCalculation();
            display.setText("");
            cl = Calculation.MULTI;
        });
        f.add(bMultiply);
        
        JButton bAllClear = new JButton("AC");
//                 (left, top, width, height)
        bAllClear.setBounds(03, 195, 75, 55);
        bAllClear.setFont(bFont);
        bAllClear.addActionListener((e)->{
            display.setText("");
            cl=null;
            firstValue="";
        });
        
        f.add(bAllClear);
        
        JButton bBackSpace = new JButton("BS");
//                 (left, top, width, height)
        bBackSpace.setBounds(88, 195, 75, 55);
        bBackSpace.setFont(bFont);
        bBackSpace.addActionListener((e) -> {
            if (display.getText().length() > 0) {
                String vv = display.getText().substring(0,display.getText().length()-1 );
                display.setText(vv);
            }       
        });
        f.add(bBackSpace );
        
        JButton bPercentage = new JButton("%");
//                 (left, top, width, height)
        bPercentage.setBounds(173, 195, 60, 55);
        bPercentage.setFont(bFont);
        bPercentage.addActionListener((e) -> {
            applyCalculation();
            display.setText("");
            cl = Calculation.PER;
        });
        f.add(bPercentage);
        
        JButton bDivision = new JButton("/");
//                 (left, top, width, height)
        bDivision.setBounds(243, 195, 60, 55);
        bDivision.setFont(bFont);
        bDivision.addActionListener((e) -> {            
            applyCalculation();
            display.setText("");
            cl = Calculation.DIV;
        });
        f.add(bDivision);
        
}
public static void applyCalculation() {
        if (firstValue.equals("")) {
            firstValue = display.getText();
            return;
        }
        int a = Integer.parseInt(firstValue);
        int b = Integer.parseInt(display.getText());
        int total = 0;
        switch (cl) {
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
            case PER -> {
                total = a % b;
            }
        }
        firstValue = "" + total;
    }
}