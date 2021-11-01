package day06;
/*
	학생의 java, db, js, jsp, spring 과목을 관리할 클래스(Stud)를 제작하세요.
	총점과 평균도 원하면 볼 수 있어야 합니다.
	
	5명의 학생들의 점수를 관리할 배열을 만들고
	정보를 출력해주세요.
	
	학생번호와 석차도 입력하게 해서
	학생번호를 입력하면 배열에서 해당학생의 정보를 꺼내서 보여주는 프로그램을 작성하세요.
	
	단, 만든 클래스가 객체가 될때 필요한 데이터를 기억할 수 있도록 생성자도 정의하세요.
	
*/
public class Ex01 {

	public static void main(String[] args) {
		/*
		Student s1 = new Student();
		s1.name = "제니";
		*/
		
		String[] names = {"제니", "로제", "리사", "지수", "둘리"};
		int[][] score = new int[5][5];
		
		for(int i = 0 ; i < score.length ; i++) {
			for(int j = 0 ; j < score[i].length ; j++ ) {
				score[i][j] = (int)(Math.random()*61 + 40);
			}
		}
		
		
		Stud[] s1 = new Stud[5];
		
		for(int i = 0 ; i < s1.length ; i++ ) {
			s1[i] = new Stud(names[i], i+ 1, score[i][0], score[i][1], score[i][2], score[i][3], score[i][4]);
		}
		
		// 출력
		for(Stud s : s1) {
			s.toPrint();
		}
		
//		s1[0].name;	// name 변수의 접근지정자가 private 이기 때문에 이 클래스에서는 접근할 수 없다.
	}
	
	// 학생들의 석차구해주는 함수
	public void setSukcha(Stud[] stArr) {
		
	}
}
