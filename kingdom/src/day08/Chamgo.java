package day08;

public class Chamgo {
	public Chamgo() {
		System.out.println("10 까지 합 : " + sum(10));
		System.out.println("1 ~ 100 까지 합 : " + hap(1));
		System.out.println("10 까지 곱 : " + factorial(10));
	}
	
	// n까지 합 구해주는 함수 : 재귀 호출 함수
	public int sum(int no) {
		if(no == 0) {
			return 0;
		}
		return no + sum(no - 1);
		
	}
	
	// n 부터 100까지 합을 구하는 함수
	public int hap(int no) {
		if(no == 100) {
			return 100;
		}
		
		return no + hap(no + 1);
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
