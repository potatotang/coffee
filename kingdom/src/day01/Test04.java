package day01;

/**
 * 이클래스는 주석의 형태를 연습하는 클래스
 * @author	전은석
 * @since	2021/10/25
 * @version v.1.0
 * @see		
 * 			작업이력
 * 				2021.10.25 - 클래스 작성 - 담당자 : 전은석
 *
 */
public class Test04 {
	int num1 = 10;
	public static void main(String[] args) {
		/*
			다중행 주석
			가나다라
			
			abcd
		 */
		// 여기는 단일행 주석
		
		/**
			이 주석은 배포문서에 포함되는 주석
			작성자, 작성일, .... 필수 설명들을 주로 이 내부에서 작성한다.
		 */
		
		/*
			변수 사용하기
				변수 : 
		 */
		
//		int no1 = 10;
		int no1;	// 변수 선언
		no1 = 10;	// 변수 초기화
		System.out.println("1. no1 : " + (no1 + 2) + "\n");
		System.out.println("2. no1 : " + no1 + 2);
//		System.out.println("num1 : " + num1);
	}
}








