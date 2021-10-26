package day02;

public class Test04 {
	/*
		랜덤하게 1 ~ 25 사이의 정수를 발생시켜서
		그 정수가 짝수인지 홀수인지를 출력하세요.
	 */
	public static void main(String[] args) {
		// 작업순서 ]
		// 1. 랜덤하게 정수를 만들고
		int no = (int)(Math.random() * 24) + 1 ;
		// 2. 판별하고
		String result = (no % 2 == 1) ? "홀수" : "짝수";
		// 3. 결과 출력하고
		System.out.println("랜덤하게 발생한 정수 [ " + no + " ] 는 < " + result + " > 입니다.");
	}
}
