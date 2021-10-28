package day04;

import java.util.Arrays;

public class Test08 {

	/*
		다차원배열
			배열을 다시 배열로 관리하는 것
			
			형식 1 ]
				이차원 배열의 경우
					
					int[][] 변수이름 = new int[바깥쪽 관리할 배열갯수][안쪽배열이 관리할 데이터갯수];
					==> 안쪽 배열의길이가 모두 같은 형태로 만들어진다.
			
			형식 2 ]
				안쪽배열의 길이가 다른 경우
					
					int[][] 변수이름 = new int[관리할 배열갯수][];
	 */
	public static void main(String[] args) {
		// 사각형 5개의 가로, 세로, 넓이를 하나의 배열로 관리하세요. 가로세로는 랜덤하게...
		// 작업 순서 ]
		// 1. 전체 배열을 만든다.
		int[][] sagak = new int[5][3];
		// 2. 배열에 데이터를 채운다.
		for(int i = 0 ; i < sagak.length ; i++ ) {
			int garo = (int)(Math.random()* 21 + 5);
			int sero = (int)(Math.random()* 21 + 5);
			sagak[i][0] = garo; // 가로 입력
			sagak[i][1] = sero; // 세로 기억
			sagak[i][2] = garo * sero;
		}
		// 3. 하나씩 꺼내서 데이터 출력한다.
		for(int[] nemo : sagak) {
			System.out.println(Arrays.toString(nemo));
		}
		
	}

}
