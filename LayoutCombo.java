package com.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LayoutCombo implements ActionListener
{
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton button1, button2, button3, button4;
    private JTextArea textArea;

    public static void main (String[] args) 
    {
        LayoutCombo guiLayout = new LayoutCombo();
        guiLayout.start();
    }

    public void start() 
    {
        frame = new JFrame("Border and Box Layouts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        
        label = new JLabel("Click a button to see its text appear below:");
        contentPane.add(label, BorderLayout.NORTH);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
                
        button1 = new JButton("Button 1");
        panel.add(button1);
        button1.addActionListener(this);
        
        button2 = new JButton("Button 2");
        panel.add(button2);
        button2.addActionListener(this);
        
        button3 = new JButton("Button 3");
        panel.add(button3);
        button3.addActionListener(this);
        
        button4 = new JButton("Button 4");
        panel.add(button4);
        button4.addActionListener(this);
        
        contentPane.add(panel, BorderLayout.WEST);

        textArea = new JTextArea(20,30);       
        contentPane.add(textArea, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == button1)
        textArea.append("Button 1 was clicked.\n");
        else if (e.getSource() == button2)
        textArea.append("Button 2 was clicked.\n");
        else if (e.getSource() == button3)
        textArea.append("Button 3 was clicked.\n");
        else if (e.getSource() == button4)
        textArea.append("Button 4 was clicked.\n");
        else
        textArea.append("Should not get here!\n");}
}
