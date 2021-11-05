package day10;

import java.util.*;
public class Test05 {
/*
	ArrayList 하나에 이름만 입력받을 수 있도록 하고
	다른 하나는 나이만 입력할 수 있도록 해보자.
 */
	public Test05() {
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> ages = new ArrayList<Integer>();
		
		names.add("둘리");
		names.add("제니");
		names.add("로제");
		names.add("리사");
		names.add("jisoo");
//		names.add(125.1); // ==> 제너릭스에 선언된 타입과 다르기 때문에 입력이 안된다.
		
		ages.add(1);
		ages.add(24);
		ages.add(25);
		ages.add(23);
		ages.add(24);
//		ages.add("29"); // ==> 제너릭스에 선언된 타입과 다르기 때문에 입력이 안된다.
		
		// 이름을 꺼내서 ***씨 라고 출력해보자.
		for(int i = 0 ; i < names.size(); i++ ) {
			String name = names.get(i);
			System.out.println(name + " 님");
		}
		
		// 각 멤버들의 내년 나이를 출력하세요.
		for(int i = 0 ; i < ages.size(); i++ ) {
			String name = names.get(i);
			int age = ages.get(i) + 1;
			
			System.out.println(name + " - " + age);
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}
