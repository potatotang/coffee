package day04;

import java.util.Arrays;

public class Test05 {
/*
	배열의 초기화
		==> 배열 메모리는 Heap에 생기므로 자동으로 초기화 된다.
			
			기본데이터타입 : 0, 0.0, false, (char) 0
			
		경우에 따라서는 배열 메모리에 강제로 특정 값을 입력해서 배열을 만들 필요도 생긴다.
		이때 이것을 
			"배열의 초기화"
		라고 표현한다.
		
			형식 1 ]
				데이터타입[] 변수이름 = {데이터1, 데이터2, ..., 데이터n};
			형식 2 ]
				데이터타입[] 변수이름 = new 데이터타입[]{데이터1, 데이터2, ... , 데이터n};
					==> 이때 만드는 배열의 길이는 데이터의 갯수로 자동 결정이되므로
						길이는 따로 지정하지 않는다.
						
	참고 ]
		Arrays 클래스
			: 이 클래스는 배열은 아니고 배열을 다루는데 필요한 기능들을 모아놓은 클래스
			
			Arrays.toString()
			==>
				배열을 출력하기 위해서는 원칙적으로 하나씩 위치값을 입력해서
				한개씩 데이터를 뽑아서 출력해야 한다.
				그런데 단순히 데이터 확인만 할려고 할 경우에도 이렇게 사용하면 불편할 것이다.
				
				따라서 
				배열에 있는 데이터를 출력하기 위한 명령으로
				배열이 가진 모든 데이터를 문자열로 변환해서 반환해주는 함수
				
				참고로
				이 함수는 Object 클래스가 가지고 있는 함수를 물려받아서 
				기능을 고쳐서 만든 함수이다.
				
			형식 ]
				Arrays.toString(배열);
 */
	public static void main(String[] args) {
		String[] blackpink = {"제니", "로제", "리사", "지수"}; // 배열 초기화 방법 1
		
		blackpink = new String[] {"제니", "로제", "리사", "지수"}; // 배열 초기화 방법 2
		
		String arrData = Arrays.toString(blackpink);
		
		System.out.println(Arrays.toString(blackpink));
		System.out.println(arrData);
		
	}

}
