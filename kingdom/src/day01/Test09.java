package day01;
/**
 * 이클래스는 상수 연습용 클래스
 * @author	전은석
 * @since	2021/10/25
 * @version	v.1.0
 * @see		
 * 			작업이력 ]
 * 				2021.10.25	- 클래스 제작 - 담당자 : 전은석
 *
 */
public class Test09 {
//	final double PI2; 
	// 이 경우는 이 변수는 자동 초기화가 이루어지기 때문에(0.0으로) 다른데이터로 초기화 못한다.
	
	
	public static void main(String[] args) {
		// 3.14 를 기억할 변수 PI를 만들어서
		// 원의 반지름이 5인 원의 넓이를 계산해서 출력해보자.
		// 		공식 ] 	반지름 * 반지름 * 3.14
//		final double PI = 3.14;
		final double PI;
		PI = 3.14;
		int ban = 5;
		double area = ban * ban * PI;
//		double area = ban * ban * Math.PI;
		System.out.println("반지름이 " + ban + " 인 원의 넓이는 " + area + " 입니다.");
	}
	
	void abc() {
//		double area = ban * ban * PI;
	}
}
