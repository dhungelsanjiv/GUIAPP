package com.gui;

import java.awt.*;
import javax.swing.*;

public class GUIButton1 
{
    private JFrame frame;

    public static void main (String[] args) 
    {
        GUIButton1 guiButton = new GUIButton1();
        guiButton.start();
    }

    public void start() 
    {
        frame = new JFrame("My First GUI Button App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();

        JButton button = new JButton("Click me");
        contentPane.add(button);
        
        
        button.setForeground(Color.red);
       button.setText("I have been clicked!");

           //frame.setSize(200, 200);
        	frame.pack();
            frame.setVisible(true);
        }
}