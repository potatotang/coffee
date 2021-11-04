package day09;

import java.util.*;
public class Test03 {
	public Test03() {
		TreeSet tSet = new TreeSet();
		
		
		Stud s1 = new Stud("제니", 80, 100, 95, 85, 80);
		Stud s2 = new Stud("로제", 75, 90, 80, 80, 95);
		System.out.println(s1.getTotal());
		System.out.println(s1.getAvg());
		tSet.add(2);
		tSet.add(1);
		System.out.println(tSet);
		
		TreeSet ts1 = new TreeSet(new Comparator() {
			// 무명 내부 클래스
			@Override
			public int compare(Object o1, Object o2) {
				// 이 경우는 Stud 클래스를 어떻게 정렬할지를 정해주는 함수이다.
				// 강제 형변환
				Stud s1 = (Stud) o1;
				Stud s2 = (Stud) o2;
				
				// 리턴 값의 의미는 - 값을 갖는 경우는 위치를 바꾸지 않고
				// + 값인 경우는 위치를 바꾼다.
				
				// 우리는 정렬기준을 총점을 기준으로 정렬하기로 해보자.
				
				// 참고 ] 반환값의 크기는 중요하지 않고 부호가 중요하다.
				return s1.getTotal() - s2.getTotal();
			}
		});
		
		ts1.add(s1);
		ts1.add(s2);
		
		// 출력
		Iterator itor = ts1.iterator();
		while(itor.hasNext()) {
			Stud s = (Stud) itor.next();
			System.out.println(s.getName() + " : " + s.getTotal());
		}
	}
	
	public static void main(String[] args) {
		new Test03();
	}
}
