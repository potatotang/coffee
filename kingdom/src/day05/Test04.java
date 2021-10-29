package day05;

public class Test04 {
/*	
	Won 클래스를 이용해서 원의 정보를 5개 관리하는 배열을 만들고
	랜덤하게 반지름을 입력해서
	다른 정보들도 출력하세요.
 */
	public static void main(String[] args) {
		// 배열 만들고
		Won[] circle = new Won[5]; // Won 객체 다섯개를 관리할 공간만 확보한 상태
		
		// Won 객체를 채워준다.
		for(int i = 0 ; i < 5 ; i++ ) {
			circle[i] = new Won();
		}
		
		// 반지름 입력하고
		for(int i = 0 ; i < circle.length ; i++ ) {
			int r = (int)(Math.random()*21 + 5);
			circle[i].setRad(r);
//			circle[i].setArround();
//			circle[i].setArea();
		}
		
		// 둘레와 넓이 계산해서 대입
		for(Won w : circle) {
			w.setArround();
			w.setArea();
		}
		
		// 일단 출력해본다.
		for(Won w : circle) {
			// 출력함수 호출
			w.toPrint();
		}
	}

}
