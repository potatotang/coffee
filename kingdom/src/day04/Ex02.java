package day04;

public class Ex02 {

	public static void main(String[] args) {
		/*
			알파벳 5개를 랜덤하게 추출해서 배열에 기억하세요.
			단, 중복문자는 없어야 합니다.
		 */
		
		// 할일
		// 1. 배열 만들고
		char[] word = new char[5];
		
		loop:
		for(int i = 0 ; i < 5 ; i++ ) {
			// 2. 문자만들고
			char ch = (char)(Math.random()*('z' - 'a' + 1) + 'a');
			// 3. 이전에 만들어진 문자와 같은지 비교하고
			for(int j = 0 ; j < i - 1 ; j++ ) {
				if(ch == word[j]) {
					i--;
					continue loop;
				}
			}
			// 4. 문자 기억시키고
			word[i] = ch;
		}
		
		// 5. 출력하고
		for(char ch : word) {
			System.out.print(ch);
		}
		System.out.println();
		
		System.out.println(new String(word));
	}

}
