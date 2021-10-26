package day02;

import javax.swing.JOptionPane;

public class Test06 {
	/*
		영문자를 입력하고
		입력한 문자가 대문자인지 소문자인지를 판별하세요.
		
		참고 ]
			
			문자열에서 문자를 추출하는 방법
			
				문자열.charAt(인덱스)
			
			문자열에서 특정문자의 위치값을 추출해내는 함수
				
				문자열.indexOf(문자)
	 */
	
	public static void main(String[] args) {
		/*
		String str = "abcdefg";
		for(int i = 0 ; i < str.length(); i++ ) {
			System.out.println(str.charAt(i));
		}
		*/
		// 작업순서 ]
		// 1. 문자를 문자열로 입력받고
		String str = JOptionPane.showInputDialog("영문자를 입력하세요!");
		// 2. 문자열에서 문자를 추출하고
		char ch = str.charAt(0);
		// 3. 대소문자 판별하고
		String result = "";
		if(ch <= 'Z') {
			result = "대문자";
		} else {
			result = "소문자";
		}
		// 4. 결과 출력하고
		JOptionPane.showMessageDialog(null, "입력받은 문자 " + ch + " 는 " + result);
	}
}
