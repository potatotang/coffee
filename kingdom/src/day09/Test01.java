package day09;

import java.util.*;
public class Test01 {
	
	public Test01() {
		Vector v = new Vector();
		int size = v.size();
		int capacity = v.capacity();
		System.out.println("capacity : " + capacity);
		System.out.println("size : " + size);
		System.out.println("---------------------");
		for(int i = 0 ; i < 21 ; i++ ) {
			v.add((char)('A' + i));
		}
		size = v.size();
		capacity = v.capacity();
		System.out.println("capacity : " + capacity);
		System.out.println("size : " + size);
		System.out.println("---------------------");
		
		Enumeration en = v.elements();
		
		while(en.hasMoreElements()) {
			char ch = (char) en.nextElement();
			System.out.println(ch);
		}
		
		
		System.out.println("10 번째 데이터 : " + v.get(9));
		System.out.println(v);
		
		String[] arr = {"제니", "로제", "리사", "지수"};
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
