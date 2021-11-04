package day09;

import java.util.*;
public class Test06 {

	public Test06() {
		Hashtable tab = new Hashtable();
		tab.put("제니", "010-1111-1111");
		tab.put("로제", "010-2222-2222");
		tab.put("리사", "010-3333-3333");
		tab.put("지수", "010-4444-4444");
		tab.put("둘리", "010-5555-5555");
		
		Set set = tab.entrySet();
		
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			Map.Entry en = (Map.Entry)itor.next();
			
			String key = (String) en.getKey();
			String value = (String) en.getValue();
			System.out.println(key + " - " + value);
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
