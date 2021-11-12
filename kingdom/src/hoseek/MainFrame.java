package hoseek;

import java.awt.*;
import java.awt.*;
import javax.swing.*;
public class MainFrame {
	JFrame fr;
	public MainFrame() {
		fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 로그인 패널추가
		LoginPanel lPan = new LoginPanel();
		
		fr.add(lPan);
		
		fr.setSize(1600, 1000);
		fr.setVisible(true);
		fr.setResizable(false);
	}

	public static void main(String[] args) {
		new MainFrame();
	}

}
