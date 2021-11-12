package hoseek;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginPanel extends JPanel {
	JLabel top, idLbl, pwLbl;
	JButton lbtn, jbtn, cbtn;
	JPanel tPan, cPan, bPan, tmpPan, tmpPan1, idPan, pwPan;
	JTextField id;
	JPasswordField pw;

	public LoginPanel() {
		this.setPreferredSize(new Dimension(1600, 1000));
		this.setLayout(new BorderLayout());
		
		// panel
		tPan = new JPanel();
		tPan.setPreferredSize(new Dimension(1600, 150));
//		tPan.setBackground(Color.ORANGE);
		JPanel t1 = new JPanel();
		t1.setPreferredSize(new Dimension(1600, 30));
		tPan.add(t1);
		
		tmpPan = new JPanel();
		tmpPan.setPreferredSize(new Dimension(300, 800));
		tmpPan1 = new JPanel();
		tmpPan1.setPreferredSize(new Dimension(300, 800));
		
		// 가운데 패널
		cPan =  new JPanel();
		cPan.setPreferredSize(new Dimension(1000, 700));
		JPanel t2 = new JPanel();
		t2.setPreferredSize(new Dimension(1000, 100));
		cPan.add(t2);
//		cPan.setBackground(Color.ORANGE);
		
		
		// 가운데 패널에 패널 추가
		
		// 라벨 만들기
		idLbl = new JLabel("ID : ");
		pwLbl = new JLabel("PW : ");
		
		idLbl.setPreferredSize(new Dimension(50, 30));
		pwLbl.setPreferredSize(new Dimension(50, 30));
		
		// 정렬
		idLbl.setHorizontalAlignment(JLabel.RIGHT);
		pwLbl.setHorizontalAlignment(JLabel.RIGHT);
		
		// 입력도구 만들기
		id = new JTextField();
		pw = new JPasswordField();
		
		// 사이즈
		id.setPreferredSize(new Dimension(500, 30));
		pw.setPreferredSize(new Dimension(500, 30));
		
		// 아이디, 비번 감쌀 패털
		idPan = new JPanel();
		pwPan = new JPanel();
		
		idPan.add(idLbl);
		idPan.add(id);
		
		pwPan.add(pwLbl);
		pwPan.add(pw);
		
		// cPan 에 아이디, 비번 추가
		cPan.add(idPan);
		cPan.add(pwPan);
		
		
		
		top = new JLabel("로그인");
		top.setFont(new Font("D2coding", Font.BOLD, 48));
		top.setVerticalAlignment(JLabel.BOTTOM);
		
		// 버튼
		
		lbtn = new JButton("Login");
		jbtn = new JButton("Join");
		cbtn = new JButton("Cancel");
		
		// 버튼 패널
		bPan = new JPanel();
		bPan.setPreferredSize(new Dimension(1600, 50));
		
		bPan.add(lbtn);
		bPan.add(jbtn);
		bPan.add(cbtn);
		
		tPan.add(top);
		this.add(tmpPan, BorderLayout.WEST);
		this.add(tmpPan1, BorderLayout.EAST);
		
		this.add(tPan, BorderLayout.NORTH);
		this.add(cPan, BorderLayout.CENTER);
		this.add(bPan, BorderLayout.SOUTH);
	}

}
