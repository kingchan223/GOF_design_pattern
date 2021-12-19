package com.example.designPattern.composite.in_java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample {
    public static void main(String[] args) {
        /*Composite - Component*/
        JFrame frame = new JFrame();/*JFrame은 Component를 extends한다.*/

        /*Leaf - Component*/
        JTextField textField = new JTextField();/*JTextField은 Component를 extends한다.*/
        textField.setBounds(200, 200, 200, 40);
        frame.add(textField);//frame에 textField추가

        /*Leaf - Component*/
        JButton button = new JButton("click");/*JButton은 Component를 extends한다.*/
        button.setBounds(200, 100, 60, 40);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Hello Swing");
            }
        });
        frame.add(button);//frame에 button추가
        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setVisible(true);/*공통된 operation*/
    }
}
