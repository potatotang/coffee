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
		
		HashMap studMap = new HashMap();
		HashMap sMap = null;
		for(int i = 0 ; i < names.size(); i++ ) {
			sMap = new HashMap();
			sMap.put("name", names.get(i));
			for(int j = 0 ; j < subNames.size(); j++ ) {
				sMap.put(subNames.get(j), ((ArrayList)map.get(subNames.get(j))).get(i));
			}
			studMap.put(names.get(i), sMap);
		}
		
		// 총점 평균 계산
		for(int i = 0 ; i < names.size(); i++ ) {
			String name = (String)((HashMap)studMap.get(names.get(i))).get("name");
			int t = 0 ;
			for(int j = 0 ; j < subNames.size(); j++ ) {
				int no = (int)((HashMap)studMap.get(name)).get(subNames.get(j));
				t += no;
			}
			
			((HashMap)studMap.get(names.get(i))).put("total", t);
			((HashMap)studMap.get(names.get(i))).put("avg", t / 5.0);
		}
		
		// 출력
		Set nameSet = studMap.keySet();
		Iterator<String> itor = nameSet.iterator();
		while(itor.hasNext()) {
			String student = itor.next();
			HashMap resultMap = (HashMap)studMap.get(student);
			Set subjKey = resultMap.keySet();
			Iterator<String> subjIt = subjKey.iterator();
			while(subjIt.hasNext()) {
				String subjName = subjIt.next();
				System.out.println(subjName + " : " + resultMap.get(subjName));
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		new Ex03_01();
	}

}
