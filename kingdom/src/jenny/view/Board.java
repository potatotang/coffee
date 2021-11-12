package jenny.view;

import javax.swing.JFrame;

import jenny.controller.*;
public class Board extends JFrame {
	public MainController main;
	public Board(MainController main) {
		this.main = main;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(600, 800);
		this.setVisible(false);
		this.setResizable(false);
	}
}
