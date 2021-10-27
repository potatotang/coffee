package day03;

public class Ex16 {
	/*
		반복문을 사용해서 다음 형태로 숫자를 출력하세요.
		
		1. 
			1
			1  2
			1  2  3
			1  2  3  4
			1  2  3  4  5
			
			
		2. 
			 1  2  3  4  5
			 6  7  8  9 10
			11 12 13 14 15
			16 17 18 19 20
			21 22 23 34 25
			
		3. 
			 1
			 2  3
			 4  5  6
			 7  8  9 10
			11 12 13 14 15
			
		4.
			 1  2  3  4  5
			10  9  8  7  6
			11 12 13 14 15
			20 19 18 17 16
			21 22 23 24 25
			 
		
	 */
	
	public static void main(String[] args) {
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j <= i  ; j++ ) {
				System.out.print(j + 1 + " ");
			}
			System.out.println();
		}
		for(int i = 0 ; i < 35 ; i++ ) System.out.print("+");
		System.out.println();
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j < 5 ; j++ ) {
				System.out.print(i+ 1  + " ");
			}
			System.out.println();
		}
	}
}
