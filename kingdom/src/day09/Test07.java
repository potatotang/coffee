package day09;

import java.util.*;
public class Test07 {

	public Test07() {
		HashMap tab = new HashMap();
		tab.put("제니", "010-1111-1111");
		tab.put("로제", "010-2222-2222");
		tab.put("리사", "010-3333-3333");
		tab.put("지수", "010-4444-4444");
		tab.put("둘리", "010-5555-5555");
		
		// keySet() 를 사용해서 키값만 추출해서 데이터를 출력해보자.
		Set keys = tab.keySet();
		ArrayList list = new ArrayList(keys);
		
		for(int i = 0 ; i < list.size(); i++ ) {
			// 위치값을 증가시켜가면서 데이터를 추출해서 문자열 타입으로 강제 형변환한다.
			String key = (String) list.get(i);
			// 키값에 해당하는 데이터를 추출한다.
			String value = (String) tab.get(key);
			
			// 출력
			System.out.println(key + " : " + value);
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
