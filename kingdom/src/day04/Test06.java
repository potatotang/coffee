package day04;

import java.util.Arrays;

public class Test06 {
/*
	배열의 복사
		1. 얕은 복사
			==> 주소만 복사하는 방법
				특징 ]
					데이터를 공유한다.
					따라서 한쪽에서 데이터를 수정하면 
					다른쪽에서 수정된 데이터를 사용해야 한다.
				
				방법 ]
					
					int[] no1 = new int[5];
					.. 데이터기억
					
					int[] no2 = no1;
					
			참고 ]
				얕은 복사는
					지역변수는 그 변수가 만들어진 영역(지역, 블럭) 내에서만 활동하므로
					다른 지역에서 heap 영역의 데이터를 사용할 목적으로 많이 사용되는 기법 
				
		2. 깊은 복사
			==> 데이터까지 모두 복사해주는 방법
				
				데이터가 복사되었다는 것은
				Heap에 다른 곳에 데이터가 한번더 존재한다는 의미가 된다.
				따라서 데이터의 주소가 달라지게 되고
				
				특징 ]
					복사된데이터는 독립적으로 사용된다.
					
				명령 ]
					System.arraycopy(1, 2, 3, 4, 5);
					
						1 : 원본데이터의 주소
						2 : 원본데이터에서 복사를 시작할 위치
						3 : 복사받을 배열의 주소
						4 : 복사받을 주소의 시작위치
						5 : 복사받을 데이터 갯수
						
-----------------------------------------------------------------------------------------------------------------------

	배열의 단점 ]
		1. 한번 배열의 크기를 정하면 그 크기를 수정하지 못한다.
		
		2. 같은 타입의 데이터만 관리할 수 있다.
			==> 주소는 Heap Type에 의해서 결정되고
				Heap Type이 다르면 사용할 수 없다.(호환되지 않는다.)
 */
	public static void main(String[] args) {
		int no = 10;
		double no1 = no;
		
		int[] num1 = {1, 2, 3, 4, 5};
//		double[] num2 = num1; // heap Type 이 달라서 에러...
		
		int[] num2 = num1; // 얕은 복사
		
		// num1, num2 출력
		
		System.out.println("# num1 : " + Arrays.toString(num1));
		System.out.println("# num2 : " + Arrays.toString(num2));
		
		//num1[2] 데이터 수정
		num1[2] = 30;
		
		// 배열 출력
		System.out.println("# num1 : " + Arrays.toString(num1));
		System.out.println("# num2 : " + Arrays.toString(num2));
		
		// 깊은 복사
		int[] numcopy = new int[10];
		System.arraycopy(num1, 0, numcopy, 3, num1.length);
		
		// numcopy의 6번째 데이터 300으로 수정
		numcopy[5] = 300;
		
		// 비교출력
		System.out.println("# num1 : " + Arrays.toString(num1));
		System.out.println("# numcopy : " + Arrays.toString(numcopy));
		
	}

}
