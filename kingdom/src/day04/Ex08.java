package day04;

import java.util.Arrays;

public class Ex08 {
/*
	1. 5명의 학생들의 국어, 영어, 수학 의 점수를 관리할 배열을 만들고
	2. 점수를 랜덤하게 입력하고
	3. 각 학생들의 총점을 입력하고
	4. 총점이 높은 사람순으로 정렬해서 수정하고
	5. 출력하세요.
	
	extra ]
		각 과목별 총점을 입력하세요.
	
		국어 | 영어 | 수학 | 총점
학생1
학생2
학생3
학생4
학생5
총 점	


 */
	public static void main(String[] args) {
		// 다섯명의 과목의 점수를 관리할 배열
		int[][] studScore = new int[6][4];
		// 세과목의 점수를 관리할 배열
		int[][] subScore = new int[4][6];
		
		// 학생 배열에 채점을 한다.
		for(int i = 0 ; i < studScore.length - 1 ; i++ ) {
			// 학생을 순차적으로 뽑고
			
			// 과목점수를 순차적으로 만들어서 입력한다.
			for(int j = 0 ; j < studScore[i].length - 1  ; j++) {
				// 점수 만들고
				int score = (int)(Math.random()*41 + 60);
				studScore[i][j] = score;
			}
		}
		
		// 학생별 총점을 구한다.
		for(int i = 0 ; i < studScore.length - 1 ; i++ ) {
			// 해당 학생의 각과목을 순차적으로 꺼내서 마지막 방에 누적시킨다.
			int sum = 0;
			
			for(int j = 0 ; j < studScore[i].length - 1 ; j++ ) {
				// 꺼낸 과목을 누적시킨다.
				sum = sum + studScore[i][j];
			}
			
			studScore[i][studScore[i].length - 1] = sum;
		}
		
		// 과목별 총점을 계산해서 입력한다.
		
		// 먼저 과목을 뽑고
		for(int j = 0 ; j < studScore[0].length ; j++ ) {
			// 학생을 나중에 뽑는다.
			for(int i = 0 ; i < studScore.length - 1 ; i++ ) {
				studScore[studScore.length - 1][j] = studScore[studScore.length - 1][j] + 
															studScore[i][j];
			}
		}
		
		
		for(int[] s1 : studScore) {
			System.out.println(Arrays.toString(s1));
		}
	}

}
