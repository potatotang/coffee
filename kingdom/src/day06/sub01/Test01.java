package day06.sub01;

import day06.*;
public class Test01 {
//	int num = 0;
	int num;
	{
		num = 100;
	}
	
	public static void main(String[] args) {
		Data d1 = new Data();
//		int no1 = d1.num1; 접근지정자가 생략된 경우고 이 경우는 동일한 패키지 내에서만 사용할 수 있다.
//		int no2 = d1.num2;	// 상속받지도 같은 패키지도 아니기 때문에 사용할 수 없다.
		int no3 = d1.num3;
		d1.num3 = 10;
		
		System.out.println("d1.num3 : " + d1.num3);
		System.out.println("no3 : " + no3);
		
		Stud s1 = new Stud();
		s1.ex = "중간고사";
		
		Stud s2 = new Stud();
		
		System.out.println(s2.ex);
		
//		this.num = 20; // 이 함수가 static 멤버이기 때문에 this는 사용할 수 없다.
	}

}
