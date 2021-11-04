package day09;

import java.util.*;

import javax.swing.JOptionPane;
public class Test05 {
	public Test05() {
		// 다섯 학생의 전화번호를 기억하는 Hashtable을 만들고 데이터를 입력하고 출력하세요.
		
		Hashtable tab = new Hashtable();
		tab.put("제니", "010-1111-1111");
		tab.put("로제", "010-2222-2222");
		tab.put("리사", "010-3333-3333");
		tab.put("지수", "010-4444-4444");
		tab.put("둘리", "010-5555-5555");
		
		// 이름을 입력하면 해당학생의 전화번호를 출력하게 하세요.
		
		boolean bool = true;
		String name = "";
		while(bool) {
			name = JOptionPane.showInputDialog("학생이름 : ");
			if(name.equals("q")) {
				bool = false;
			} else {
				JOptionPane.showMessageDialog(null, "이름 : " + name + "\n전화번호 : " + (String)tab.get(name));
			}
		}
		
		Enumeration keys = tab.keys();
		while(keys.hasMoreElements()) {
			String k = (String) keys.nextElement();
			
			System.out.println(k);
			System.out.println(k + " - " + tab.get(k));
		}
	}
	public static void main(String[] args) {
		new Test05();
	}

}
