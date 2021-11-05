package day09;

import java.util.*;
public class Ex03_01 {

	public Ex03_01() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("제니");
		names.add("로제");
		names.add("리사");
		names.add("지수");
		names.add("둘리");
		
		ArrayList<String> subNames = new ArrayList<String>();
		subNames.add("java");
		subNames.add("db");
		subNames.add("web");
		subNames.add("jsp");
		subNames.add("spring");
		
		HashMap map = new HashMap();
		ArrayList subj = null;
		for(int i = 0 ; i < subNames.size(); i++ ) {
			subj = new ArrayList();
			for(int j = 0 ; j < names.size(); j++ ) {
				int score = (int)(Math.random()*41 + 60);
				subj.add(score);
			}
			map.put(subNames.get(i), subj);
		}
		
	}

	public static void main(String[] args) {
		new Ex03_01();
	}

}
