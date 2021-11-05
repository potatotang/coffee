package day09;

import java.util.*;
import javax.swing.*;


public class Ex03_01 {
	HashMap<String, HashMap<String, Object>> studMap = new HashMap<String, HashMap<String, Object>>();

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
		
		HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> subj = null;
		for(int i = 0 ; i < subNames.size(); i++ ) {
			subj = new ArrayList<Integer>();
			for(int j = 0 ; j < names.size(); j++ ) {
				int score = (int)(Math.random()*41 + 60);
				subj.add(score);
			}
			map.put(subNames.get(i), subj);
		}
		
		HashMap<String, Object> sMap = null;
		for(int i = 0 ; i < names.size(); i++ ) {
			sMap = new HashMap<String, Object>();
			sMap.put("name", names.get(i));
			for(int j = 0 ; j < subNames.size(); j++ ) {
				sMap.put(subNames.get(j), map.get(subNames.get(j)).get(i));
			}
			studMap.put(names.get(i), sMap);
		}
		
		// 총점 평균 계산
		for(int i = 0 ; i < names.size(); i++ ) {
			String name = (String)studMap.get(names.get(i)).get("name");
			int t = 0 ;
			for(int j = 0 ; j < subNames.size(); j++ ) {
				int no = (int)studMap.get(name).get(subNames.get(j));
				t += no;
			}
			
			studMap.get(names.get(i)).put("total", t);
			studMap.get(names.get(i)).put("avg", t / 5.0);
		}
		
		// 출력
		exec();
		
	}
	
	
	// 전체 결과 출력용 함수
	public void toPrint() {
		Set<String> nameSet = studMap.keySet();
		Iterator<String> itor = nameSet.iterator();
		while(itor.hasNext()) {
			String student = itor.next();
			HashMap<String, Object> resultMap = studMap.get(student);
			Set<String> subjKey = resultMap.keySet();
			Iterator<String> subjIt = subjKey.iterator();
			String subjName = subjIt.next();
			StringBuffer buff = new StringBuffer();
			while(subjIt.hasNext()) {
				subjName = subjIt.next();
				buff.append(String.format("%-7s : " + (subjName.equals("name")?"%s":(subjName.equals("avg")? "%5.2f": "%3d")) + "\n" , subjName, resultMap.get(subjName)));
//				System.out.println(subjName + " : " + resultMap.get(subjName));
			}
			String msg = buff.toString();
			System.out.println(msg);
			JOptionPane.showMessageDialog(null, msg);
//			int result = JOptionPane.showConfirmDialog(null, buff.toString());
//			System.out.println(result);
//			System.out.println();
		}
		
	}
	
	// 한사람 데이터 출력용 함수
	public void toPrint(String name) {
		HashMap<String, Object> resultMap = studMap.get(name);
		Set<String> subjKey = resultMap.keySet();
		StringBuffer buff = new StringBuffer();
		Iterator<String> subjIt = subjKey.iterator();
		while(subjIt.hasNext()) {
			String subjName = subjIt.next();
			buff.append(String.format("%-7s : " + (subjName.equals("name")? "%5s" :(subjName.equals("avg") ? "%7.2f" : "%7d")) + "\n" , subjName, resultMap.get(subjName)));
			System.out.println("*******");
//			System.out.println(subjName + " : " + resultMap.get(subjName));
		}
//		System.out.println();
//		System.out.println(buff.toString());
		String msg = buff.toString();
//		System.out.println(msg);
		JOptionPane.showMessageDialog(null, msg);
		
//		System.out.println(result);
	}
	
	// 한 사람의 한과목 점수 조회
	public void toPrint(String name, String subj) {
		HashMap<String, Object> resultMap = studMap.get(name);
		StringBuffer buff = new StringBuffer();
		buff.append(String.format("%-7s : %5s", "name", name) + "\n");
		buff.append(String.format("%-7s : " + ((subj.equals("avg")) ? "%7.2f": "%7d"), subj, resultMap.get(subj)));
		
		JOptionPane.showMessageDialog(null, buff.toString());
//		System.out.println("name : " + name);
//		System.out.println(subj + " : " + resultMap.get(subj));
//		System.out.println();
	}
	
	public void exec() {
		// 학생 이름들 모두 출력
		Set<String> set = studMap.keySet();
		Iterator<String> itor = set.iterator();
		StringBuffer buff = new StringBuffer("| ");
		while(itor.hasNext()) {
			buff.append(itor.next() + " | ");
//				System.out.print(itor.next());
//				System.out.print(" |");
		}
		buff.append("\n");
		String subject = buff.toString();
		while(true) {
//			System.out.println("다음 학생중 조회할 학생을 입력하세요!\n종료는 q를 입력하세요!");
//			System.out.print("| ");
//			System.out.println();
//			System.out.print("학생 이름 : ");
//			Scanner sc = new Scanner(System.in);
			// 메세지 출력
			String name = JOptionPane.showInputDialog("조회할 학생 이름을 입력하세요!\n종료는 q를 입력하세요!\n" + subject);
			if(name == null || name.equals("q")) {
				JOptionPane.showMessageDialog(null, "*** 프로그램을 종료합니다! ***");
				break;
			}
			if(!set.contains(name)) {
				continue;
			}
			
			boolean bool = true;
			while(bool) {
//				System.out.println("\t모든 정보는 a\n\t과목점수는 s\n\t총점은 t\n\t평균은 v\n\t이전단계는 p\n\t종료는 q\n를 입력하세요!");
				String str = JOptionPane.showInputDialog("\t모든 정보는 a\n\t과목점수는 s\n\t총점은 t\n\t평균은 v\n\t이전단계는 p\n\t종료는 q\n를 입력하세요!");
				
				if(str == null) break;
				switch(str) {
				case "p":
					bool = false;
					break;
				case "q":
					JOptionPane.showMessageDialog(null, "*** 프로그램을 종료합니다! ***");
//					System.out.println("*** 프로그램을 종료합니다! ***");
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
//					System.out.print("조회 과목 입력 : ");
					String sub = JOptionPane.showInputDialog("조회 과목을 입력하세요!");
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
