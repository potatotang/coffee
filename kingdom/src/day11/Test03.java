package day11;

/*
	Test02.java 파일을 읽어보자.
 */
import java.io.*;
public class Test03 {
	// 파일로 연결된 스트림을 준비한다.
	FileInputStream fin = null;
	public Test03() {
		try {
			fin = new FileInputStream("src/day11/Test02.java");
			
			/*
			// 1. 한글자만 읽어보자.
			int ch = fin.read();
			// 2. 읽은 데이터 문자로 변환하고
			char munja = (char) ch;
			// 3. 출력
			System.out.println("읽은 문자 : " + munja);
			*/
			
			/*
			// 2. 여러글자 읽어보자.
			byte[] buff = new byte[1024];
			// 데이터 읽는다.
			int len = fin.read(buff);
			// 문자열로 변환
			String result = new String(buff, 0, len);
			// 출력한다.
			System.out.println("읽은 데이터 : \n" + result);
			*/
			
			// 3. 파일 전체를 읽어보자.
			byte[] buff = new byte[1024];
			while(true) {
				int len = fin.read(buff);
				// read() 함수의 반환값은 읽어온 데이터가 없는 경우 -1을 반환해준다.
				if(len == -1) {
					// 읽어온 데이터가 없는 경우는 종료시킨다.
					break;
				}
				
				// 문자열로 변환
				String result = new String(buff, 0, len);
				// 출력
				System.out.println("Test02.java File ] \n" + result);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
