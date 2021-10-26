package day01;

public class Ex01 {
	/*
		문제 ]
			자신의 이름 첫글자를 기억할 변수를 만들고
			그 문자가 가지는 코드값에 5를 더한 정수데이터를 기억할 변수를 만들고
			그 숫자가 문자로 어떤문자로 만들어지는지 변수에 기억시켜서
			출력하세요.
			
	 */
	
	public static void main(String[] args) {
		char ch = 'J';
		int no1 = ch + 5;	// 자동형변환
		char ch1 = (char)no1; // 강제형변환
		
		System.out.println("내이름 첫글자 : " + ch);
		System.out.println("첫글자에 5를 더한 정수값 : " + no1);
		System.out.println("결과 정수를 문자로 변환한 문자 : " + ch1);
	}
}
