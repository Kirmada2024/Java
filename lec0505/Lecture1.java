package com.mycompany.lectureapp.lec0505;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lecture1 {

    public static void main(String[] args) {

        Font font = new Font("Segoe Print", Font.BOLD, 50);
        Font bFont = new Font("Segoe Print", Font.BOLD, 25);
        
        JFrame f = new JFrame("My First Frame");
        f.setSize(600, 600);
        f.setVisible(true);
        f.setLayout(null);
        
        JLabel label = new JLabel("welcome to Swing");
        label.setBounds(50, 100, 300, 100);
        f.add(label);
        
        JLabel title = new JLabel("Cdmi");
        title.setBounds(50, 200, 200, 100);
        title.setFont(font);
        title.setForeground(Color.red);
//        title.setVisible(false);
        f.add(title);
        
        JButton b = new JButton("555555");
        b.setBounds(100, 300, 150, 100);
        b.setFont(bFont);
        b.setBackground(Color.red);
        b.setForeground(Color.WHITE);
        f.add(b);

    }
}
