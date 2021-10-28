package day04;

public class Ex03 {
/*
	'A' ~ 'J' 까지의 문자를 랜덤하게 100개 발생한 후
	각각의 문자가 몇개씩 만들어졌는지를 그래프 형태로 출력하세요.
	
	■
 */
	public static void main(String[] args) {
		// 할일
		// 1. 카운트 기억할 배열만들고
		int[] cnt = new int[10];
		
		for(int i = 0 ; i < 100 ; i++ ) {
			// 2. 랜덤하게 문자말들고
			char ch = (char)(Math.random()* ('J' - 'A' + 1) + 'A');
			// 3. 만들어진 문자의 카운트 올리고
			cnt[ch - 'A'] = cnt[ch - 'A'] + 1;
		}
		
		// 4. 결과 출력하고
		for(int i = 0 ; i < cnt.length ; i++ ) {
			// 제목출력
			System.out.print((char)('A' + i) + " : ");
			for(int j = 0 ; j < cnt[i] ; j++ ) {
				System.out.print("■");
			}
			// 줄바꿈
			System.out.println();
		}
		
		int[] ch = new int[10];
		
		for(int i = 0 ; i < 10 ; i++ ) {
			ch[i] = 'A' + i;
		}
		
		System.out.println("-------------------------------");
		
		int[][] count = {ch, cnt};
		
		for(int i = 0 ; i < count[0].length ; i++ ) {
			// 제목출력
			System.out.printf("%s [ %3d ] ", (char)(count[0][i]), count[1][i]);
			for(int j = 0 ; j < count[1][i] ; j++ ) {
				System.out.print("■");
			}
			// 줄바꿈
			System.out.println();
		}
	}

}
