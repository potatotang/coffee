package jenny.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import jenny.controller.*;
import jenny.event.*;
public class Login extends JFrame {
	public MainController main;
	public JPanel tPan, bPan, cPan, idPan, pwPan;
	JLabel title, idLbl, pwLbl;
	public JTextField id;
	public JPasswordField pw;
	JButton lBtn, jBtn, cBtn;
	
	public Login(MainController main) {
		this.main = main;
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		// panel
		Dimension dim1 = new Dimension(450, 120);
		Dimension dim2 = new Dimension(450, 300);
		
		tPan = new JPanel();
		tPan.setPreferredSize(new Dimension(450, 90));
		bPan = new JPanel();
		bPan.setPreferredSize(new Dimension(450, 50));
		cPan = new JPanel();
		cPan.setPreferredSize(dim2);
		
		tPan.setBackground(Color.WHITE);
		bPan.setBackground(Color.WHITE);
		cPan.setBackground(Color.WHITE);
		
		// title
		title = new JLabel("LOGIN");
		title.setFont(new Font("D2coding", Font.BOLD, 48));
		
		tPan.add(title);
		
		// 라벨 
		idLbl = new JLabel("I D : ");
		pwLbl = new JLabel("P W : ");
		Font f1 = new Font("D2coding", Font.BOLD, 24);
		idLbl.setFont(f1);
		pwLbl.setFont(f1);
		idLbl.setPreferredSize(new Dimension(80, 30));
		pwLbl.setPreferredSize(new Dimension(80, 30));
		
		// input
		id = new JTextField();
		pw = new JPasswordField();
		
		id.setPreferredSize(new Dimension(230, 20));
		pw.setPreferredSize(new Dimension(230, 20));
		
		idPan = new JPanel(new BorderLayout());
		pwPan = new JPanel(new BorderLayout());
		idPan.setBackground(Color.WHITE);
		pwPan.setBackground(Color.WHITE);
		
		idPan.add(idLbl, BorderLayout.WEST);
		idPan.add(id, BorderLayout.CENTER);
		pwPan.add(pwLbl, BorderLayout.WEST);
		pwPan.add(pw, BorderLayout.CENTER);
		
		cPan.add(idPan);
		cPan.add(pwPan);
		
		// button
		lBtn = new JButton("Login");
		jBtn = new JButton("Join");
		cBtn = new JButton("Cancel");
		
		// 이벤트 추가
		LoginEvt evt = new LoginEvt(this);
		lBtn.addActionListener(evt);
		
		// 패널에 추가
		bPan.add(cBtn);
		bPan.add(jBtn);
		bPan.add(lBtn);
		
		this.add(tPan, BorderLayout.NORTH);
		this.add(cPan, BorderLayout.CENTER);
		this.add(bPan, BorderLayout.SOUTH);
		
		
		this.setSize(450, 300);
		this.setVisible(true);
		this.setResizable(false);
	}
}
