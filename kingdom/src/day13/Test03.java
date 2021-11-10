package day13;

import java.util.*;
import java.util.Calendar;
import java.text.*;
/*
	SimpleDateFormat
 */
public class Test03 {

	public Test03() {
		Date date = Calendar.getInstance().getTime();
		
		// **년 **월 ** 일 형식의 문자열로 만들어보자.
		SimpleDateFormat form = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		
		String sdate = form.format(date);
		
		System.out.println(sdate);
	}

	public static void main(String[] args) {
		new Test03();
	}

}
