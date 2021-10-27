package day03;

public class Ex10 {
	/*
		반장님과 제가 학교를 한바퀴 구경합니다.
		반장님은 정문에서 오른쪽으로 1.07m/s
		저는 정문에서 왼쪽으로 구경을 하는데	0.54m/s
		로 구경한다.
		
		반장님과 저는 몇초후 만나게 되는지 출력해주는 프로그램을 작성하세요.
		 
		 학교 한바퀴는 5475m 라고 가정한다.
		 
		 반복문으로 해결하세요.
	 */
	
	public static void main(String[] args) {
		// 이 문제는 한사람은 산을 오르기 시작하고 다른 사람은 정상에서 내려가기 시작하는 문제로 생각하면 쉽다.
		// 할일 ]
		
		// 1. 두 사람의 위치값 기억할 변수 만든다.
		double banjang = 5475;
		double na = 0;
		int time = 1 ;
		
		// 2. 매 초후 각 사람의 위치를 비교해서
		// 		두 사람의 위치가 역전되는 순간 반복문을 멈춘다.
		for(; na < banjang ; time++ ) {
			banjang = 5475 - 1.07 * time;
			na = 0.54 * time;
		}
		System.out.println((time - 1) + " 초후 " + na + " m 지점에서 반장님과 만난 직후 ");
		
		
		
		time =	1;
		na = 0;
		banjang = 5475;
		while(na < banjang) {
			banjang = 5475 - 1.07 * time;
			na = 0.54 * time;
			
			if(na < banjang) time++;
		}
		
		System.out.println(time + " 초후 " + na + " m 지점에서 반장님과 만난 직후 ");
	}
}
