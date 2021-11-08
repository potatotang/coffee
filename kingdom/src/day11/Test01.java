package day11;

import java.util.*;
public class Test01 {

	public Test01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력!");
		String str = sc.nextLine();
		
		boolean bool = true;
		
		for(int i = 0 ; i < 10 ; i++ ) {
			
			if(str.equals("q")) {
				bool = false;
				break;
			}
			
//			System.out.println();
		}
		
		if(bool) {
			System.out.println("반복문 모두 실행");
			// 이 경우는 논리값 변수를 수정하지 않는 상태이므로 
			// 반복문이 모두 실행된 상태
		} else {
			System.out.println("중간에 종료");
			// 논리값 변수가 수정되었다는 것은 반복문이 중간에 종료되었다는 의미....
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
