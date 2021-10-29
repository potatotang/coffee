package day05;

public class Won {
	// 변수선언(전역변수)
	int rad;	// 객체가 되는 순간 0으로 자동 초기화가 된다.
	double arround, area; // 0.0으로 자동 초기화
	final double PI = 3.14;
	
	// 반지름을 기억시켜주는 기능의 함수
	void setRad(int r) {
		// 반지름 변수에 입력받은 데이터 대입
		rad = r;
//		return;
	}
	
	// 둘레 계산해서 대입해주는 함수
	void setArround() {
		// 둘레 계산해서 대입
		arround = 2 * rad * PI;
	}
	
	// 면적 계산해서 대입해주는 함수
	void setArea() {
		area = rad * rad * PI;
	}
	
	// 원의 정보를 출력하는 기능의 함수
	void toPrint() {
		System.out.printf("반지름이 %3d 이고 둘레가 %7.2f, 넓이가 %7.2f 인 원", rad, arround, area);
		System.out.println();
	}
	
}
