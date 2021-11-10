package day13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test05 {
	JFrame fr;
	JPanel pan, bPan;
	JLabel lbl;
	JButton btn1, btn2;
	public Test05() {
		fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fr.setSize(450, 200);
		fr.setVisible(true);
		fr.setResizable(false);
	}

	public static void main(String[] args) {
		new Test05();
	}

}
