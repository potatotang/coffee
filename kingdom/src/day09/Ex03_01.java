package day09;

import java.util.*;
import javax.swing.*;
public class Ex03_01 {
	HashMap studMap = new HashMap();

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
		exec();
		
	}
	
	
	// 전체 결과 출력용 함수
	public void toPrint() {
		Set nameSet = studMap.keySet();
		Iterator<String> itor = nameSet.iterator();
		while(itor.hasNext()) {
			String student = itor.next();
			HashMap resultMap = (HashMap)studMap.get(student);
			Set subjKey = resultMap.keySet();
			Iterator<String> subjIt = subjKey.iterator();
			String subjName = subjIt.next();
			StringBuffer buff = new StringBuffer();
			while(subjIt.hasNext()) {
				subjName = subjIt.next();
				buff.append(subjName + " : " + resultMap.get(subjName) + "\n");
//				System.out.println(subjName + " : " + resultMap.get(subjName));
			}
			int result = JOptionPane.showConfirmDialog(null, subjName + " : " + resultMap.get(subjName));
			System.out.println(result);
//			System.out.println();
		}
		
	}
	
	// 한사람 데이터 출력용 함수
	public void toPrint(String name) {
		HashMap resultMap = (HashMap) studMap.get(name);
		Set subjKey = resultMap.keySet();
		Iterator<String> subjIt = subjKey.iterator();
		while(subjIt.hasNext()) {
			String subjName = subjIt.next();
			System.out.println(subjName + " : " + resultMap.get(subjName));
		}
		System.out.println();
	}
	
	// 한 사람의 한과목 점수 조회
	public void toPrint(String name, String subj) {
		HashMap resultMap = (HashMap)studMap.get(name);
		System.out.println("name : " + name);
		System.out.println(subj + " : " + resultMap.get(subj));
		System.out.println();
	}
	
	public void exec() {
		// 학생 이름들 모두 출력
		Set<String> set = studMap.keySet();
		Iterator<String> itor = set.iterator();
		
		while(true) {
			System.out.println("다음 학생중 조회학 학생을 입력하세요!\n종료는 q를 입력하세요!");
			System.out.print("| ");
			while(itor.hasNext()) {
				System.out.print(itor.next());
				System.out.print(" |");
			}
			System.out.println();
			
			System.out.print("학생 이름 : ");
			Scanner sc = new Scanner(System.in);
			// 메세지 출력
			String name = sc.nextLine();
			if(name.equals("q")) break;
			
			boolean bool = true;
			while(bool) {
				System.out.println("\t모든 정보는 a\n\t과목점수는 s\n\t총점은 t\n\t평균은 v\n\t이전단계는 p\n\t종료는 q\n를 입력하세요!");
				String str = sc.nextLine();

				switch(str) {
				case "p":
					bool = false;
					break;
				case "q":
					System.out.println("*** 프로그램을 종료합니다! ***");
					return;
				case "a":
					toPrint(name);
					break;
				case "t":
					toPrint(name, "total");
					break;
				case "v":
					toPrint(name, "avg");
					break;
				case "s":
					System.out.print("조회 과목 입력 : ");
					String sub = sc.nextLine();
					toPrint(name,sub);
					break;
				} 
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex03_01();
	}

}
