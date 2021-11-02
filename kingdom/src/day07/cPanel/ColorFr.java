package day07.cPanel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorFr {
	JFrame fr;
	JPanel pan, btnPan;
	JButton btn1, btn2;
	
	public ColorFr() {
		fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pan = new JPanel();
		btnPan = new JPanel(new GridLayout(1, 2));
		btnPan.setPreferredSize(new Dimension(400, 30));
		
		pan.setPreferredSize(new Dimension(400, 670));
		pan.setBackground(Color.ORANGE);
		
		// 버튼 만들기
		btn1 = new JButton("색변경");
		btn2 = new JButton("닫  기");
		
		
		BtnEvt evt1 = new BtnEvt(this);
		btn1.addActionListener(evt1);
		
		CloseBtn evt2 = new CloseBtn(this);
		btn2.addActionListener(evt2);
		
		btnPan.add(btn1);
		btnPan.add(btn2);
		
		fr.add(pan, BorderLayout.CENTER);
		fr.add(btnPan, BorderLayout.SOUTH);
		
		fr.setSize(400, 700);
		fr.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ColorFr();
		new ColorFr();
		new ColorFr();
		new ColorFr();
		new ColorFr();
	}

}
