package day13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test05 {
	JFrame fr;
	JPanel pan, bPan;
	JLabel lbl;
	JButton btn1, btn2;
	
	ColorTrd colorTrd;
	TimeTrd tThread;
	
	public Test05() {
		fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 스레드를 NewBorn 상태로 만들어둔다.
		tThread = new TimeTrd(this);
		
		// 패널 만들기
		pan = new JPanel();
		pan.setBackground(Color.ORANGE);
		
		bPan = new JPanel(new GridLayout(1, 2));
		
		lbl = new JLabel("2021년 11월 10일 13:10:25");
		lbl.setFont(new Font("D2coding", Font.BOLD, 20));
		// pan에 lbl 추가
		pan.add(lbl);
		
		// 버튼 만들기
		btn1 = new JButton("배경색 변경 일시 중지");
//		btn2 = new JButton("시간 일시 중지");
		btn2 = new JButton("시간 일시 종료");
		
		// bPan에 버튼 추가
		bPan.add(btn1);
		bPan.add(btn2);
		
		// fr에 패널들 추가
		fr.add(pan, BorderLayout.CENTER);
		fr.add(bPan, BorderLayout.SOUTH);
		
		fr.setSize(450, 200);
		fr.setVisible(true);
		fr.setResizable(false);
		
		// 스레드 프로그램 실행
		doThread();
		
		// 버튼 이벤트 추가
		btn1.addActionListener(new ColorEvt(this));
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 할일
				// 일시중지 버튼이 클릭이 되면 bool 변수의 값을 변경해줘야 한다.
				tThread.setBool(!tThread.isBool());
//				tThread.setStart(!tThread.isStart());
			}
		});
	}

	public static void main(String[] args) {
		new Test05();
	}
	
	public void doThread() {
		colorTrd = new ColorTrd(this); // NewBorn 상태
		// Runnable 상태로 전위
		colorTrd.start();
		tThread.start();
	}
}
