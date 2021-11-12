package jenny.event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import jenny.controller.*;
import jenny.view.*;
import jenny.dao.*;
import jenny.VO.*;
public class LoginEvt implements ActionListener {
	Login main;
	MemberDao mDao;
	public LoginEvt(Login main) {
		this.main = main;
		mDao = new MemberDao();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		
		switch(str) {
		case "Login":
			loginProc();
			break;
		case "Join":
			joinProc();
			break;
		}
	}
	
	// 로그인 처리함수
	public void loginProc() {
		String id = main.id.getText();
		String pw = main.pw.getText();
		System.out.println("id : " + id);
		System.out.println("pw : " + pw);
		if(id != null && pw != null) {
			int cnt = mDao.getLogin(id, pw);
			if(cnt == 0) {
				main.id.setText("");
				main.pw.setText("");
				JOptionPane.showMessageDialog(null, "필수 입력사항을 확인하세요!");
			} else {
				main.dispose();
				main.main.board.setVisible(true);
			}
		} else {
			main.id.setText("");
			main.pw.setText("");
			JOptionPane.showMessageDialog(null, "필수 입력사항을 확인하세요!");
		}
	}
	
	public void joinProc() {
		
	}

}
