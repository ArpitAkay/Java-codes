package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyWindow {
    public static void main(String[] args){

        //window : object JFrame
        JFrame jFrame = new JFrame("My Window");
        jFrame.setSize(400, 400);
        jFrame.setLayout(new FlowLayout());

        ActionListener actionListener = (event) -> {

        };

        //create button and add iframe
        JButton jButton = new JButton("Click Me");
//        jButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button Clicked");
//                JOptionPane.showMessageDialog(null, "Hey Button Clicked");
//            }
//        });

        jButton.addActionListener((ActionEvent event) -> {
            System.out.println("Button Clicked");
            JOptionPane.showMessageDialog(null, "Hey Button Clicked");
        });
        jButton.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Mouse Dragged");
                JOptionPane.showMessageDialog(null, "Hey Mouse Dragged");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("Mouse Moved");
                JOptionPane.showMessageDialog(null, "Hey Mouse Moved");
            }
        });
        jFrame.add(jButton);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}
