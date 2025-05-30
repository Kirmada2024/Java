package com.mycompany.lectureapp.lec2605;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class menucard {
    public static void main(String[] args) {
        
        
        new rform();
    }
}


class rform extends JFrame {

    private Font bFont;

    public rform() {
        setTitle("Menu Card");
        setSize(330, 470);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        JTextField tf = new JTextField();
        tf.setBounds(250,10,60,30); // x, y, width, height
        add(tf);
        
        JButton bporder  = new JButton("Place Order.");
//                 (left, top, width, height)
        bporder.setBounds(165, 400, 60, 55);
        bporder.setFont(bFont);
        f.add(bporder);
    }

}

