package day03;

public class Ex02 {
	/*
		정수 3개를 랜덤하게 발생시켜서
		3개의 숫자가 오름차순 정렬되서 출력되게 하세요.
	 */
	
	public static void main(String[] args) {
		// 작업순서
		// 1. 정수 3개 만들고
		int no1 = (int)(Math.random()*98 + 1);
		int no2 = (int)(Math.random()*98 + 1);
		int no3 = (int)(Math.random()*98 + 1);
		// 2. 결과 출력용 변수만들고
		int min, mid, max;
		min = mid = max = 0;
		// 3. 순서 검사해서 변수에 담고
		if( no1 > no2 ) { // no1 이 no2보다 큰경우
			if(no1 > no3) {
				// 이 부분을 실행할 경우는 이미 no1이 no2보다 크다는 것이 확인이 됬고
				// 다시 이블럭에서 no3보다 크다는 것이 확인이 됬으므로 제일 큰수는 no1
				max = no1;
				if(no2 > no3) {
					mid = no2;
					min = no3;
				} else {
					mid = no3;
					min = no2;
				}
			} else { // no1은 no2보다 크고 no3보다 작으므로
				max = no3;
				mid = no1;
				min = no2;
			}
		} else { // no1이 no2보다 작은 경우
			if(no1 > no3) {
				max = no2;
				mid = no1;
				min = no3;
			} else {
				if(no2 > no3) {
					max = no2;
					mid = no3;
					min = no1;
				} else {
					max = no3;
					mid = no2;
					min = no1;
				}
			}
		}
		// 4. 결과 출력하고
		System.out.println("랜덤하게 발생한 세수는 " + min + ", " + mid + ", " + max + " 입니다.");
	}
}
