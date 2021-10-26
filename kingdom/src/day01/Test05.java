package day01;

public class Test05 {
	
	public static void main(String[] args) {
		/*
			변수 만드는 형식 ]
				
				[접근지정자] [속성] 데이터타입 변수이름; // 변수선언
				변수이름 = 데이터;						// 변수초기화
				==>
				[접근지정자] [속성] 데이터타입 변수이름 = 데이터; // 변수선언과 초기화
		 */
		
		// boolean
		boolean bool1;		// 변수선언
		bool1 = true;		// 변수초기화
		// 문자형변수
		char ch = 'A';		// 변수선언과 초기화
		// 정수
		int no1 = 123;
//		int no1 = 345;		// 이미 만들어진 변수는 다시 선언할 수 없다.
//		char no1 = 'B';
		// 실수
		double num1 = 3.14;	// 실수는 기본적으로 double 타입을 사용한다.
		
		System.out.printf("boolean : %b\n문자 : %c\n정수 : %d\n실수 : %f", bool1, ch, no1, num1);
	}
}
