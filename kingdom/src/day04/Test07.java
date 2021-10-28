package day04;

import java.util.Arrays;

public class Test07 {
/*
	String 배열
		String은 자바의 클래스이다. 기본 데이터 타입이 아니다.
			String str = "Hong";
		의 경우는 기본형 변수처럼 리터럴의 주소값을 기억하지만
			String str1 = new String("Hong");
		의 경우는 str1 변수가 기억하는 주소는 "Hong" 데이터자체의 주소를 기억하는 것이 아니고
		Heap 에 만들어진 인스턴스의 주소를 기억하고
		그 인스턴스가 데이터의 주소를 기억하게 된다.
		
		참고 ]
			래퍼런스 변수란?
				주소를 기억하는 변수
				
				하지만 프로그램 상에서 실제 사용되는 것은 주소가 필요없다.
				따라서 주소 변수는 데이터가 존재하는 위치를 알려줄 뿐이고
				핵심은 데이터가 들어갈 메모리(실제 데이터)가 더 중요하다.
	
	
	
	
	String 배열 만들기
		
		String[] 변수이름;	// 변수선언
		str = new String[5];
		==> 이작업은 아직 데이터가 완성되지 않았으므로...(데이터가 아직 아무것도 결정이 되지 않은 상태이므로...)
		
		str[0] = "홍길동";
		str[1] = "고길동";
		str[2] = "둘리";
		...
		처럼 데이터 공간까지 만들어야 한다.
		
		String 배열도 초기화가 가능하다.
		형식 ]
			String[] 변수이름 = {데이터1, 데이터2, ..., 데이터n};
			
			
		참고 ]
			String 은 필요에 따라서 char[] 로 변환해서 사용할 수 있다.
			
			형식 ]
				문자열.toCharArray()
				
		참고 ]
			
			String에서 자주 사용하는 명령
				1. charAt(위치값)	- 	문자열중 특정 위치의 문자를 반환
				2. indexOf(문자)	-   문자열중 특정 문자의 위치를 반환
				3. substring(시작위치[ ,종료위치 ]) - 문자열 중 일부를 꺼내준다.
				
				***
				4. equals()	- 문자열 데이터 자체를 비교할때 사용하는 함수
		
 */
	public static void main(String[] args) {
		String[] str = new String[5];
		System.out.println(Arrays.toString(str));
		
		// 문자열을 문자배열로 ...
		String str1 = "abcdefg";
		char[] chArr = str1.toCharArray();
		
		System.out.println(Arrays.toString(chArr));
		
		String sdata = "0123456789";
		String part = sdata.substring(5, 7);
		System.out.println(part);
	}

}
