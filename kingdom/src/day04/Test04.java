package day04;

public class Test04 {

	public static void main(String[] args) {
		/*
			1 ~ 45 까지의 숫자 6개를 중복되지 않도록 만들어서
			배열에 기억시키고
			오름차순으로 정렬하고
			출력하세요.
		 */
		
		int[] lotto = new int[6];
		
		loop:
		for(int i = 0 ; i < 6 ; i++ ) {
			int no = (int)(Math.random()*(45 - 1 + 1) + 1);
			// 중복검사
			for(int j = 0; j < i - 1 ; j++ ) {
				if(no == lotto[j]) {
					// 중복된경우
					i--;
					continue loop;
				}
			}
			lotto[i] = no;
		}
		
		for(int no : lotto) {
			System.out.print(no + " ");
		}
		System.out.println();
		
		/*
			참고 ]
				배열의 길이 알아내는 방법
					
					배열.length
				를 사용해서 알아낸다.
		 */
		
		
		// 오름차순 정렬
		for(int i = 0 ; i < lotto.length - 1 ; i++ ) {
			
			for(int j = i + 1; j < lotto.length ; j++ ) {
				// 만약 i번째 데이터보다 작은 데이터가 있다면 위치를 바꿔준다.
				if(lotto[i] > lotto[j]) {
					// i번째 방에 있는 데이터를 변수만들어서 기억먼저 시켜놓는다.
					int tmp = lotto[i];
					lotto[i] = lotto[j]; // 이제 i번째와 j번째방의 데이터가 같아졌다.
					lotto[j] = tmp;
				}
			}
		}
		
		for(int no : lotto) {
			System.out.print(no + " ");
		}
		System.out.println();
	}

}
