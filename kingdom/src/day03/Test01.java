package day03;

public class Test01 {

	public static void main(String[] args) {
		/*
			제어문의 경우 블럭내의 명령이 한개인 경우는
			블럭기호를 생략할 수 있다.
			
			
		 */
		
		if(true) {
			System.out.println("언제나 참!");
		}
		
		if( true ) System.out.println("언제나 참!");
		
		for(int i = 0 ; i < 50; i++ ) System.out.print("=");
		System.out.println();
	}

}
