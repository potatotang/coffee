package day02;

public class Ex03 {
	/*
		1년은 365.2426 일이다.
		이 시간은 몇일, 몇시간, 몇분, 몇초인지를 
		계산해서 출력하는 프로그램을 작성하세요.
		
		참고 ]
			0.5일은 12시간이다.
	 */
	
	public static void main(String[] args) {
		double data = 365.2426;
		int year = (int)data;
		int tmp = (int)((data - year) * 24 * 3600);
		int hour = tmp / 3600;
		tmp %= 3600;	// ==> tmp = tmp % 3600;
		int min = tmp / 60;
		tmp %= 60;
		int sec = tmp;
		
		
	}
}
