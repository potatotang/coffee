package day12;

/*
	콘솔에 입력한 데이터를 data.txt 파일에 누적되서 저장시키는 프로램을 작성하세요.
	
	option ]
		메모장 프로그램 제작
 */

import java.io.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ex01 {
	JFrame fr;
	JButton sBtn, oBtn;
	JTextArea area;
	JScrollPane pan;
	JPanel bPan;
	public Ex01() {
		// 창만들고
		fr = new JFrame("*** CNU Note ***");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 내용담을 패널 만들고
		bPan = new JPanel(new GridLayout(1, 2));
		
		// 버튼 만들고
		sBtn = new JButton("저장하기");
		oBtn = new JButton("불러오기");
		bPan.add(oBtn);
		bPan.add(sBtn);
		
		// 클릭 이벤트 추가
		BtnEvt evt = new BtnEvt(this);
		oBtn.addActionListener(evt);
		sBtn.addActionListener(evt);
		// 텍스트 공간
		area = new JTextArea();
		area.setPreferredSize(new Dimension(465, 530));
		
		area.setFont(new Font("D2coding", Font.PLAIN, 16));
		
		// 스크롤 패널 만들기
		pan = new JScrollPane(area);
		
		
		fr.add(pan, BorderLayout.CENTER);
		fr.add(bPan, BorderLayout.SOUTH);
		
		fr.setSize(500, 600);
		fr.setVisible(true);
		fr.setResizable(false);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
