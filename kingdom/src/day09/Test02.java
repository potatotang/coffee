package day09;

import java.util.*;
public class Test02 {
	
	public Test02() {
		HashSet set = new HashSet();
		set.add("제니");
		set.add("제니");
		set.add("제니");
		set.add("제니");
		
		Vector vec = new Vector(set);
		
		for(Object o : vec) {
			String name = (String) o;
			System.out.println(name);
		}
		
		Iterator itor = set.iterator();
		
		while(itor.hasNext()) {
			String name = (String) itor.next();
			System.out.println("###  itor 데이터 : " + name);
		}
	}
	
	public static void main(String[] args) {
		new Test02();
	}

}
