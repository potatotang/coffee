package day04;

public class Ex01 {

	public static void main(String[] args) {
		/*
			6개의 1 ~ 45 까지의 정수를 기억할 수 있는 배열을 만들고
			서로다른 정수 6개를 기억시켜서 
			출력하세요.
		 */
		
		// 작업순서
		// 1. 배열만들고
		int[] lotto = new int[6];
		
		loop:
		for(int i = 0 ; i < 6 ; i++ ){
			// 2 - 1. 숫자만들고
			int no = (int)(Math.random()*45 + 1);
			
			for(int j = 0 ; j < i ; j++){
				// 2 - 2. 만들어진 숫자가 이전 숫자들과 같은지 비교하고
				if( no == lotto[j] ){
				 // 2- 3. 같으면 이번회차 다시진행
				 	// 회차카운트 1 감소시키고
				 	i--;
					continue loop;
				}
			}
			// 2 - 4. 다르면 이번회차 데이터 기억시키고
			// 이 행을 실행하는 경우는 중복되는 숫자가 없는 경우이므로 채워주면 된다.
			lotto[i] = no;
		}
		
		
		// 3. 출력하고
		System.out.print("| ");
		for(int no : lotto){
			System.out.print(no + " | ");
		}
		
		System.out.println();
		
		for(int i = 0 ; i < lotto.length - 1 ; i++ ){
			
			for(int j = i + 1; j < lotto.length; j++ ){
				if(lotto[i] > lotto[j]){
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		System.out.print("| ");
		for(int no : lotto){
			System.out.print(no + " | ");
		}
		
		System.out.println();
	}

}
