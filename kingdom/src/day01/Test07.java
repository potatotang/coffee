package day01;

public class Test07 {
	public static void main(String[] args) {
		/*
			강제 형변환
		 */
		
		float no1 = (float)3.14;
		
		int no2 = (int)(3.14 * 100);
		
		int no3 = (int)3.14;
		System.out.println("no3 : " + no3);
		
		String str = "abcd" + 10; // ==> abcd10 // 자동형변환
		System.out.println("abcd" + 10);
		
		char ch = (char)37.05;
	}
}
