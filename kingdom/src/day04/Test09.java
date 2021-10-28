package day04;

import java.util.Arrays;

public class Test09 {
/*
	아이돌 그룹 3그룹을 배열로 관리하세요.
 */
	public static void main(String[] args) {
		String[][] idol = new String[3][];
		String[] blackpink = {"제니", "로제", "리사", "지수"};
		String[] sachoon = {"안지영", "우지윤"};
		String[] minyu = {"김형은", "심진화", "장경희"};
		
		idol[0] = blackpink;
		idol[1] = sachoon;
		idol[2] = minyu;
		
		// 출력
		for(String[] one : idol) {
			for(String hana : one) {
				System.out.print(hana + " | ");
			}
			System.out.println(); // 줄바꿈
		}
	}

}
