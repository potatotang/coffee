package day07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test01 /* extends JFrame */{
	JFrame fr;
	JPanel pan, btnPan;
	JButton btn1, btn2;
	
	public Test01() {
		fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pan = new JPanel();
		btnPan = new JPanel(new GridLayout(1, 2));
		btnPan.setPreferredSize(new Dimension(400, 30));
		
		pan.setPreferredSize(new Dimension(400, 670));
		pan.setBackground(Color.ORANGE);
		
		// 버튼 만들기
		btn1 = new JButton("색변경");
		btn2 = new JButton("닫  기");
		
		btn1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					int red = (int)(Math.random()*256);
					int green = (int)(Math.random()*256);
					int blue = (int)(Math.random()*256);
					
					Color c = new Color(red, green, blue);
					
					pan.setBackground(c);
				}
			
			}
		);
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnPan.add(btn1);
		btnPan.add(btn2);
		
		fr.add(pan, BorderLayout.CENTER);
		fr.add(btnPan, BorderLayout.SOUTH);
		
		fr.setSize(400, 700);
		fr.setVisible(true);
		/*
		this.add(pan, BorderLayout.CENTER);
		this.add(btnPan, BorderLayout.SOUTH);
		
		this.setSize(400, 700);
		this.setVisible(true);
		*/
	}
	
	public static void main(String[] args) {
		new Test01();
//		new Test01();
	}

}
