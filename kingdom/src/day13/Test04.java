package day13;

import java.text.*;
public class Test04 {

	public Test04() {
		int no = 12345;
		String p1 = "0";
		String p2 = "#";
		String p3 = "0,000,000,000.00";
		String p4 = "#,###,###,###.##";
		String p5 = "\u00a4 #,###,###,###";
		
		System.out.println("p1 : " + new DecimalFormat(p1).format(no));
		System.out.println("p2 : " + new DecimalFormat(p2).format(no));
		System.out.println("p3 : " + new DecimalFormat(p3).format(no));
		System.out.println("p4 : " + new DecimalFormat(p4).format(no));
		System.out.println("p5 : " + new DecimalFormat(p5).format(no));
	}

	public static void main(String[] args) {
		new Test04();
	}

}
