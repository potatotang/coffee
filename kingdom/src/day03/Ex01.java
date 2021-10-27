package day03;

import javax.swing.JOptionPane;

public class Ex01 {
	/*
	
		정수를 입력받아서
		가장 가까운 10의 배수와 입력한 수와의 차를 출력하는 프로그램을 작성하세요.
	
	 */
	
	public static void main(String[] args) {
		// 숫자 입력받고
		String sno = JOptionPane.showInputDialog("정수를 입력하세요!");
		// 문자열 숫자 정수로 바꾸고
		int no = Integer.parseInt(sno);
		
		// 가까운 배수 찾고
		//int bsoo = (no % 10 < 5) ? (no / 10) * 10 : (no / 10 + 1) * 10;
		
		int bsoo = (no + 5) / 10 * 10;
		
		// 결과 출력하고
		JOptionPane.showMessageDialog(null, "입력한 숫자 " + no + "와 \n 가까운 10의 배수는 " + bsoo + " 입니다.");
	}
}
