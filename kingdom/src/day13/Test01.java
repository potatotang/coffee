package day13;

import java.text.MessageFormat;

/*
	MessageFormat 예제
 */
public class Test01 {

	public Test01() {
		String msg = "Name: {3} \nTel: {2} \nAge: {1}\nBirthday: {0}";
		
		Object[] args = {
			"제니", "010-1111-1111", 26, "1996-11-10"	
		};
		
		String result = MessageFormat.format(msg, args);
		
		System.out.println(result);
	}

	public static void main(String[] args) {
		new Test01();
	}

}
