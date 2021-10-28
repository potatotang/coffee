package day04;

import java.util.Arrays;

public class Ex05 {
/*
	int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
	를 준비하고
	
	79456원을 준비된 화폐로 계산할 때 각각의 환폐단위가 몇개가 필요한지를 
	기억하는 배열을 만들어 기억시키고
	출력하는 프로그램을 작성하세요.
 */
	public static void main(String[] args) {
		// 필요한 변수 만들고
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] cnt = new int[coin.length];
		
		int total = 79456;
		int tmp = total;
		
		// 반복해서 화폐꺼내고 계산하고 기록하고...
		for(int i = 0 ; i < coin.length - 1 ; i++ ) {
			// 화폐단위 갯수만큼 반복해서 화폐단위를 꺼낸다.
			cnt[i] = tmp / coin[i];	// 필요한 갯수 기억
			// 지불한 금액은 빼서 다시 기억시킨다.
			tmp = tmp % coin[i] ;
		}
		cnt[coin.length - 1] = tmp;

		for(int i = 0 ; i < coin.length ; i++ ) {
			System.out.printf("%-6d : %d장\n", coin[i], cnt[i]);
		}
	}

}
