package day05;

public class Test03 {

	public static void main(String[] args) {
		// 반지름이 5 ~ 25 사이의 값을 갖는 원을 만들어서 정보를 출력해보자.
		
		// 객체만들고
		Won c1 = new Won();
		
		// 랜덤한 반지름 만들고
		int ban = (int)(Math.random()* 21 + 5);
		System.out.println("랜덤한 수 : " + ban);
		// 반지름 입력
		c1.setRad(ban);
		// 둘레 계산해서 대입
		c1.setArround();
		// 면적
		c1.setArea();
		// 출력
		c1.toPrint();
	}

}
