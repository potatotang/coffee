package day02;

/**
 * 이 클래스는 입력된 문자 'M', 'F' 를 
 * "남자", "여자"로 한글로 변환 출력해주는 기능의 클래스
 * @author	전은석
 * @since	2021/10/26
 * @version	v.1.0
 * @see
 * 			java.util.Scanner
 * 
 * 			작업이력 ]
 * 				2021.10.26	- 클래스 제작 - 담당자 : 전은석
 *
 */

import java.util.Scanner;
//import java.util.*;
public class Test02 {
	public static void main(String[] args) {
		// 작업순서가 생각이 안날 경우는 
		// 먼저 한줄주석으로 순서를 나열하고 진행하는것이 도움이 된다.
		
		// 작업순서
		// 1. 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		// 2. 메세지 출력하고
		System.out.println("성별을 'M' 또는 'F'로 입력하세요! : ");
		// 3. 데이터 꺼내고
		String str = sc.nextLine(); // "M" 또는 "F"
		sc.close();
		// 4. 데이터 비교해서 분기처리하고
		/*
			3항 비교연산자
				형식 ]
					
					변수 = (조건식) ? (조건식이 true일 경우 반환값) : 
										(조건식이 false일 경우 반환값);
		 */
		String msg = (str.equals("M")) ? "입력한 성별은 남자입니다." : "입력한 성별은 여자입니다.";
		String gen = (str.equals("M")) ? "남자" : "여자";
		// 5. 결과 출력하고
		
		System.out.println("입력한 문자는 " + str + " 이고\n" + msg);
		System.out.println("입력한 문자는 " + str + " 이고\n " + "한글 성별은 " + gen + " 입니다.");
	}
}
