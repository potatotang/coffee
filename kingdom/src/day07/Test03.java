package day07;

public class Test03 {
	public static void main(String[] args) {
		/*
			랜덤하게 0 ~ 4까지 숫자를 발생시켜서
				0 - 논리값 true
				1 - 'A'
				2 - 10
				3 - 3.14
				4 - "제니"
			를 데이터 10개를 기억할 배열에 저장하세요.
		 */
		
		Object[] obj = new Object[10];
		
		for(int i = 0 ; i < 10 ; i++ ) {
			int no = (int)(Math.random()*5);
			
			switch(no) {
			case 0:
				obj[i] = true;
				break;
			case 1:
				obj[i] = 'A';
				break;
			case 2:
				obj[i] = 10;
				break;
			case 3:
				obj[i] = 3.14;
				break;
			case 4:
				obj[i] = "제니";
				break;
			}
		}
		
		// 출력
		for(Object o : obj) {
			if(o instanceof Boolean) {
				System.out.println("논리값 " + (Boolean)o + " 입니다.");
			} else if(o instanceof Character) {
				System.out.println("문자 " + (Character)o + " 입니다.");
			} else if(o instanceof Integer) {
				System.out.println("정수 " + (Integer)o + " 입니다.");
			} else if(o instanceof Double) {
				System.out.println("실수 " + (Double)o + " 입니다.");
			} else if(o instanceof String) {
				System.out.println("문자열 " + (String)o + " 입니다.");
			}
		}
		
	}
}
