package day01;

public class Test10 {
	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 10;
//		int no3 = ++no1 + ++no2;	// no1 : 11, no2 : 11, no3 : 22
//		int no3 = ++no1 + no2++;	// no1 : 11, no2 : 10, no3 : 21
		int no3 = no1++ + no2++;	// no1 : 10, no2 : 10, no3 : 20
		System.out.println("no1 : " + no1 + ", no2 : " + no2 + ", no3 : " + no3);
		
		int no4 = no1 + no2;
		int no5 = ++no1 - no2;
		int no6 = no1 * no2;
		int no7 = ++no1 / no2;
		int no8 = no1 % no2;
		
		int num = 10;
		
//		num = num * 10;
		num *= 10;
	}
}
