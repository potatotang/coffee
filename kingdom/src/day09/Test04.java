package day09;

import java.util.*;
public class Test04 {
	
	public Test04() {
		Student s1 = new Student("제니", 80, 100, 95, 85, 80);
		Student s2 = new Student("로제", 75, 90, 80, 80, 95);
		
		// TreeSet을 만든다.
		TreeSet set = new TreeSet();
		// 데이터 채우고
		set.add(s1);
		set.add(s2);
		// 꺼내서 출력하고
		Vector vec = new Vector(set);
		for(Object o : vec) {
			Student s = (Student) o;
			System.out.println(s.getName() + " - " + s.getJava());
		}
		
		
	}
	public static void main(String[] args) {
		new Test04();
	}
}
