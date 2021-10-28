package day04;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		/*
			배열 ]
				한가지 타입의 데이터 여러개를 하나로 관리하도록 만들어진 것.
				
				주의 ]
					배열을 만들때는 반드시 관리할 데이터타입과 데이터의 갯수가 결정이 되어야 한다.
					
				형식 ]
					
					1. 데이터타입[]		변수; // 변수선언
						변수 = new 데이터타입[데이터갯수];	// 기억할 데이터들의 공간만 확보한 상태...
						
					2. 
						관리할 배열의 데이터가 이미 준비된 경우
							
						데이터타입[]	변수 = {데이터1, 데이터2, ...., 데이터n};
						
						
				배열에 데이터 입력방법
					==> 배열은 여러개의 데이터를 관리하는 것이므로
						위치값(index)을 사용해서 해당위치의 데이터를 관리한다.
						
						방법 ]
							
							데이터기억
							 	배열변수[위치값] = 데이터;
							
							데이터를 꺼내서 사용하는 경우
								
								꺼낸데이터의 타입 변수이름 = 배열변수[위치값];
							
		 */
		
		// 1 ~ 6 까지 관리할 배열 noArray 를 만드세요.
		int[] noArray; // 선언
		noArray = new int[6];
		
		// 출력
		for(int no : noArray) {
			System.out.print(no + " | ");
		}
		System.out.println();
		// 1 ~ 6까지 입력
		for(int i = 0 ; i < 6 ; i++ ) {
			noArray[i] = i + 1;
		}
		
		System.out.println(Arrays.toString(noArray));
		
		// 하나씩 꺼내서 출력
		for(int no : noArray) {
			System.out.print(no + " | ");
		}
	}

}
