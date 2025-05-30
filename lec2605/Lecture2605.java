package com.mycompany.lectureapp.lec2605;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Lecture2605 {

    public static void main(String[] args) {
        new LecForm();
    }
}

class LecForm extends JFrame {

    public LecForm() {
        setTitle("Lec Number Puzzle");
        setSize(450, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        JTextField tf = new JTextField();
        tf.setBounds(360,10,60,30); //x, y ,width , height
        add(tf);
        
        
        
    }

}
