package day04;

public class Test02 {

	public static void main(String[] args) {
		/*
			블랙핑크 멤버를 관리할 배열
				blackpink를 만들고 
				멤버들의 이름을 기억시키세요.
		 */
		
		// 배열 선언과 초기화를 동시에...
//		String blackpink[] = {"제니", "리사", "로제", "지수"};
		String blackpink[] = new String[]{"제니", "리사", "로제", "지수"};
		
		System.out.println("+++++++++++++++++++++");
		for(String member : blackpink) {
			System.out.println(member);
		}
		System.out.println("+++++++++++++++++++++");
		
		System.out.println();
		
		String memb1 = new String("제니");
		String memb2 = new String("리사");
		String memb3 = new String("로제");
		String memb4 = new String("지수");
		
		blackpink[0] = memb1;
		blackpink[1] = memb2;
		blackpink[2] = memb3;
		blackpink[3] = memb4;
		
		System.out.println("+++++++++++++++++++++");
		for(String member : blackpink) {
			System.out.println(member);
		}
		System.out.println("+++++++++++++++++++++");
		
		System.out.println();
		
	}

}
