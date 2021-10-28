package day04;

import java.util.Scanner;

public class Test03 {
	
/*
	Heap 영역
		특징
			1. 반드시 주소를 알아야 사용할 수 있는 영역
			2. 8가지 영역중에서 크기가 가장 큰 영역이며 확장가능하다.
				( 부족하면 스스로 다른 영역을 빼앗아서 heap 영역으로 사용할 수 있다.)
				==>
					따라서 자바는 많은 양의 데이터가 필요하면
					이것은 heap에 기억하도록 되어있다.
			3. 원칙적으로 한번 만들어지면 그 프로그램이 종료될때까지 없어지지 않는 영역이다.
			*
			4. Heap 영역에 만들어지는 변수는 자동 초기화 된다. 
 */
	
	
	public static void main(String[] args) {
		/*
			문제 ]
				 1 - 다섯개만큼의 
				 2 - 숫자를 입력받아서
				 해당 숫자만큼의 문자데이터를 기억할 수 있는 배열을 만들고
				 배열에 랜덤하게 해당 갯수만큼 문자를 만들어서 기억시키고 출력하세요. 
		 */
		
		// 1.
		char[] chArray = new char[5];
		for(int i = 0 ; i < 5 ; i++ ) {
			chArray[i] = (char)(Math.random()*256);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열갯수 : ");
		int cnt = sc.nextInt();
		sc.close();
		
		char[] chArr = new char[cnt];
		for(int i = 0 ; i < cnt ; i++ ) {
			chArr[i] = (char)(Math.random()*256);
		}
		
		System.out.println("5개짜리");
		System.out.print("| ");
		for(char ch : chArray) {
			System.out.printf("%2c |", ch);
		}
		System.out.println();
		
		System.out.println("*** " + cnt + "개짜리");
		System.out.print("| ");
		for(int i = 0 ; i < cnt ; i++ ) {
			System.out.printf("%2c |", chArr[i]);
		}
		System.out.println();
	}

}
