package day08;

import java.util.*;
public class Test04 {
	public Test04() {
		/*
			010-123-5678
			
			
		 */
		
		String str = "010-1234-5678";
		
		StringTokenizer token = new StringTokenizer(str, "-");
		
		System.out.println("잘라낸 갯수 : " + token.countTokens());
		String[] tel = new String[token.countTokens()];
		int i = 0;
		while(token.hasMoreTokens()) {
			tel[i++] = token.nextToken();
		}
		
		// 출력
		for(String s : tel) {
			System.out.println(s);
		}
		
	}
	public static void main(String[] args) {
		new Test04();
	}

}
