package day03;

public class Ex15 {
	/*
		다음 모양으로 * 를 사용해서 출력하세요.
		
		
		1. 
			*****
			*****
			*****
			*****
			*****
		
		2. 
			 *
			 **
			 ***
			 ****
			 *****
		
		3.     *
			  **
			 ***
			****
		   *****
		   
		4. 
			 *****
			 ****
			 ***
			 **
			 *
			 
		5. 
			*****
			 ****
			  ***
			   **
			    *
			    
		extra ]
			1.
			  *
			 ***
			*****
			 ***
			  *
			
			2. 홀수를 입력하면 그 수에 해당하는 마름모를 만들어주도록...
	 */
	

	public static void main(String[] args) {
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j < 5 ; j++) {
				String star = "*";
				if(j < i ) star = " ";
				
				System.out.print(star);
			}
			System.out.println();
		}
		
		System.out.println("\"홍길동\"");
		System.out.println("'홍길동'");
		for(int i = 0 ; i < 30; i++) System.out.print("+");
		System.out.println();
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
