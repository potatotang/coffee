package day02;

public class Homework02 {
	/*
		1 ~ 99 사이의 숫자를 2개 랜덤하게 발생시켜서
		그 숫자의 최대공약수를 구하는 프로그램을 작성하세요.
		
		최소공배수를 구하는 프로그램을 작성하세요.
	 */
	public static void main(String[] args) {
		// 작업순서
		// 1. 숫자 만들고
		int no1 = (int)(Math.random() * 98) + 1;
		int no2 = (int)(Math.random() * 98) + 1;
		
		
		/* 최대공약수
		
		// 2. 두수 비교해서 작은 수를 찾는다.
		int min = no1 < no2 ? no1 : no2;
		int max = min == no1 ? no2 : no1;
		
		int result = min;		
		// 3. 작은 수부터 1씩 감소시켜나가면서 최대공약수를 찾는다.
		for(int i = min; i > 1 ; i-- ) {
			// 나누어지는지 검사한다.
			if(min % i == 0 && max % i == 0) {
				result = i;
				// 처음 발생하는 이 숫자가 최대공약수이므로 다시 찾을 필요가 없다.
				// 따라서 즉시 반복문을 종료시킨다.
				break;
			}
		}
		
		// 4. 결과 출력하고
		System.out.println("랜덤하게 발생한 두 수 " + min + ", " + max + " 의 최대공약수는 " + result + " 입니다.");
		 */
		
		// 최소공배수
		// ==> 두수중 큰수를 알아낸다.
		int max = no1 < no2 ? no2 : no1;
		int min = max == no1 ? no2 : no1;
		
		// 결과값 변수
		int result = max;
		
		// 큰수에서부터 1씩 증가시키면서 공배수인지를 찾는다.
		for(int i = max; i <= min * max ; i++ ) {
			if(i % min == 0 && i % max == 0) {
				result = i;
				break;
			}
		}
		System.out.println("랜덤하게 발생한 두 수 " + min + ", " + max + " 의 최소공배수는 " + result + " 입니다.");
	}
}
