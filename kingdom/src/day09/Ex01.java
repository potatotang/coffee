package day09;

/*
	학생들의 과목 점수를 정리할 예정이다.
	다음을 완성하세요.
 */
import java.util.*;
public class Ex01 {
	public ArrayList stud;
	public Ex01() {
		Vector name = new Vector(5);
		name.add("제니");
		name.add("로제");
		name.add("리사");
		name.add("지수");
		name.add("둘리");
		
		TreeSet subj = new TreeSet();
		subj.add("1. java");
		subj.add("2. db");
		subj.add("3. web");
		subj.add("4. jsp");
		subj.add("5. spring");
		
		ArrayList java = new ArrayList(); // 각 학생들의 java 점수
		ArrayList db = new ArrayList(); //각 학생들의 db 점수
		// 각 학생들의 web 점수
		ArrayList web = new ArrayList();
		// jsp 점수
		ArrayList jsp = new ArrayList();
		// spring 점수
		ArrayList spring = new ArrayList();
		
		ArrayList subScore = new ArrayList();
		subScore.add(java);
		subScore.add(db);
		subScore.add(web);
		subScore.add(jsp);
		subScore.add(spring);
		
		// 점수입력
		for(int i = 0 ; i < 5 ; i++ ) {
			// 다섯과목 반복
			for(int j = 0 ; j < 5 ; j++ ) {
				// 다섯학생 반복
				int jumsoo = (int)(Math.random()*41 + 60);
				((ArrayList)subScore.get(i)).add(jumsoo);
			}
		}
		
		for(Object o : subScore) {
			System.out.println(o);
		}
		// 총점 
		ArrayList total = new ArrayList();
		for(int i = 0 ; i < subScore.size() ; i++ ) {
			int hap = 0;
			for(int j = 0 ; j < name.size() ; j++ ) {
				
				hap += (int)((ArrayList)subScore.get(j)).get(i);
			}
			total.add(hap);
		}
		// 평균
		ArrayList avg = new ArrayList();
		for(int i = 0 ; i < total.size(); i++ ) {
			double a = (int)total.get(i) / 5.0;
			avg.add(a);
		}
		// 제니학생의 이름, 점수 정보
		ArrayList jenny = new ArrayList();
		jenny.add(name.get(0));
		for(int i = 0 ; i < subScore.size(); i++ ) {
			jenny.add(((ArrayList)subScore.get(i)).get(0));
		}
		jenny.add(total.get(0));
		jenny.add(avg.get(0));
		// 로제 학생의 이름, 점수 정보
		ArrayList rose = new ArrayList();
		rose.add(name.get(1));
		for(int i = 0 ; i < subScore.size(); i++ ) {
			rose.add(((ArrayList)subScore.get(i)).get(1));
		}
		rose.add(total.get(1));
		rose.add(avg.get(1));
		
		// 리사
		ArrayList lisa = new ArrayList();
		lisa.add(name.get(2));
		for(int i = 0 ; i < subScore.size(); i++ ) {
			lisa.add(((ArrayList)subScore.get(i)).get(2));
		}
		lisa.add(total.get(2));
		lisa.add(avg.get(2));
		// 지수
		ArrayList jisu = new ArrayList();
		jisu.add(name.get(3));
		for(int i = 0 ; i < subScore.size(); i++ ) {
			jisu.add(((ArrayList)subScore.get(i)).get(3));
		}
		jisu.add(total.get(3));
		jisu.add(avg.get(3));
		// 둘리
		ArrayList dooly = new ArrayList();
		dooly.add(name.get(4));
		for(int i = 0 ; i < subScore.size(); i++ ) {
			dooly.add(((ArrayList)subScore.get(i)).get(4));
		}
		dooly.add(total.get(4));
		dooly.add(avg.get(4));
		
		// 모든 학생들의 점수 정보
		stud = new ArrayList();
		stud.add(jenny);
		stud.add(rose);
		stud.add(lisa);
		stud.add(jisu);
		stud.add(dooly);
		
		// 출력
		for(Object o : stud) {
			ArrayList<String> list = (ArrayList<String>) o;
			System.out.println(list);
		}
		
	}
	public static void main(String[] args) {
		new Ex01();
	}

}
