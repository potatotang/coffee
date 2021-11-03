package day08;

public class Chamgo {
	public Chamgo() {
		System.out.println("10 까지 합 : " + sum(10));
		System.out.println("10 까지 곱 : " + factorial(10));
	}
	
	// n까지 합 구해주는 함수 : 재귀 호출 함수
	public int sum(int no) {
		if(no == 0) {
			return 0;
		}
		return no + sum(no - 1);
	}
	
	// n! 계산함수
	public int factorial(int no) {
		if(no == 1) {
			return 1;
		}
		return no * factorial(no - 1);
	}
	
	public static void main(String[] args) {
		new Chamgo();
	}

}
