package day02;

import javax.swing.JOptionPane;

public class Test07 {
	/*
		나이를 입력받아서
	 	해당 나이가
	 		유년기인지
	 		십대인지
	 		이십대인지 삼십대인지
	 		장년층인지 (40 ~ )
	 		를 판별하는 프로그램을 작성하세요
	 */
	public static void main(String[] args) {
		String sno = JOptionPane.showInputDialog("나이를 입력하세요!");
		int age = Integer.parseInt(sno);
		
		// 판별하고
		// 결과값 변수
		String result = "";
		
		/*
		if(age < 10) {
			result = "유년기";
		} else if(age < 20) {
			result = "무서운 십대";
		} else if(age < 30) {
			result = "이십대";
		} else if(age < 40) {
			result = "삼십대";
		} else {
			result = "장년층";
		}
		*/
		
		int tmp = age / 10;
		
		switch(tmp) {
		case 0:
			result = "유년기";
			break;
		case 1:
			result = "무서운 십대";
			break;
		case 2:
			result = "이십대";
			break;
		case 3:
			result = "삼십대";
			break;
		default:
			result = "장년층";
		}
		
		// 결과 출력하고
		JOptionPane.showMessageDialog(null, "입력한 나이 " + age + " 는 " + result + " 입니다!");
	}
}
