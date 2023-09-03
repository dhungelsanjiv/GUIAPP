package com.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Practice implements ActionListener {
private JFrame frame;
private JButton button;
private Container contentPane;
public static void main(String[] args) {
	GUICountdown guiCount = new GUICountdown();
	guiCount.start();
}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
