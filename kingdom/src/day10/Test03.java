package day10;

import java.io.*;
import java.util.*;
public class Test03 {
/*
	Properties로 Map데이터를 사용하다가 
	그 데이터를 파일에 저장해보자.
 */
	// 이 클래스 내에서는 Properties 변수를 계속 사용할 것이므로 전역변수로 만들어준다.
	Properties prop = new Properties();
	
	public Test03() {
		// 준비된 변수에 데이터를 채워보자.
		prop.put("name", "제니");
		prop.put("tel", "010-1111-1111");
		prop.put("age", "24");
		prop.put("mail", "jenny@cnu.ac.kr");
		/*
			Properties는 위에서 처럼 Map 처럼 다루고 
			데이터 사용도 Map 의 방식으로 사용하면 된다.
			
			사용하다가 이 데이터를 파일로 저장할 시점이 되면...
			
		 */
		FileOutputStream fout = null; // 경로를 못찾을 경우는 예외가 발생한다....
		try {
			fout = new FileOutputStream("src/day10/result.properties");
			// 만약 파일이 없으면 파일을 만들어서 처리한다.
			// 실제저장은 다음 명령으로 저장된다.
			prop.store(fout, "Properties 파일 저장 예제");
			// 이 함수 실행이 완료되면 이미 파일에 기록이 끝난 상태가 된다.
			System.out.println("*** 파일 저장 성공 ***");
		} catch(Exception e) {
			System.out.println("### 저장 실패 ###");
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
