package day05;

public class Test02 {
	void sagakCalc(int garo, int sero) {
		int myunjuk = garo * sero;
		
		System.out.printf("가로 : %3d\n세로 : %3d\n넓이 : %3d", garo, sero, myunjuk);
	}
/*
	가로 세로를 입력하면 
	사각형의 넓이를 계산해서
		"가로 : XXX,
		 세로 : XXX,
		 넚이 : XXX
		"
	의 형태로 출력해주는 함수를 작성하고 실행하세요.
	단, 실행할때 입력할 데이터는 5 ~ 25 사이의 정수로 랜덤하게 만들어서 실행하세요.
 */
	public Test02() {
		int width = (int)(Math.random()*21 + 5);
		int height = (int)(Math.random()*21 + 5);
		
		// 사각형 함수 호출
		sagakCalc(width, height);
	}
	
	public static void main(String[] args) {
		new Test02();
	}
}
