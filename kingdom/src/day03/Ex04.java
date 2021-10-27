package day03;

import javax.swing.JOptionPane;

public class Ex04 {
	/*
		1000 ~ 3000 사이의 년도를 입력하면
		해당 해가 평년인지 윤년인지를 판별해주는 프로그램을 작성하세요.
		
		참고 ]
			윤년은 4로 나누어 떨어지며 100으로 나누어 떨어지는 해는 제외하고
				400으로 나누어 떨어지는 해는 포함시킨다.
	 */
	
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("네자리 년도를 입력하세요!");
		int year = Integer.parseInt(str);
		String syear = (year % 400 == 0) ? "윤년" : (
					(year % 100 == 0)? "평년" : (
								(year % 4 == 0) ? "윤년" : "평년"
							)
				);
		
		JOptionPane.showMessageDialog(null, "입력한 년도 : " + year + "\n은 [ " + syear + " ] 입니다.");
	}
}
