package day02;

import javax.swing.JOptionPane;

public class Test05 {
	/*
		조건 제어문 : if
						조건에 맞는 경우에만 실행을 하는 제어문
	 */
	public static void main(String[] args) {
		/*
			숫자를 입력받아서
			짝수인지 홀수 인지를 판별하는 프로그램을 작성하세요.
		 */
		
		String sno = JOptionPane.showInputDialog("정수를 입력하세요!");
		int no = Integer.parseInt(sno);
		
//		String result = "홀수 입니다.";
		
		String result = "";
		
		if(no % 2 == 0) {
			result = "짝수입니다.";
		}
		
		if(no % 2 == 1) {
			result = "홀수입니다.";
		}
		
		JOptionPane.showMessageDialog(null, "입력받은 숫자 " + no + " 는 " + result);
	}
}
