package day08;

/*
	부서번호를 입력받아서 
		10 - 영업부
		20 - 관리부
		30 - 오락부
		40 - 총무부
	로 출력하고
	나머지부서번호는 예외로 처리하세요.
 */

import javax.swing.*;
public class Test02 {
	
	public Test02() {
		
		try{
			getDname();
		} catch(DeptException e) {
			System.out.println(e);
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Test02();
	}
	
	// 부서번호 입력받아서 부서이름 출력해주는 함수
	public void getDname() throws DeptException, NumberFormatException {
		String sno = JOptionPane.showInputDialog("부서번호를 입력하세요!");
		int dno = Integer.parseInt(sno);
		if(dno != 10 && dno != 20 && dno != 30 && dno != 40) {
			throw new DeptException();
		}
		String dname = "";
		
		switch(dno) {
		case 10:
			dname = "영업부";
			break;
		case 20:
			dname = "관리부";
			break;
		case 30:
			dname = "오락부";
			break;
		case 40:
			dname = "총무부";
			break;
		}
		
		System.out.println(dno + " - " + dname);
	}

}
