package day12;

/*
	Test02에서 저장한 파일을 읽어보자.
 */
import java.io.*;
public class Test03 {

	public Test03() {
		FileReader fr = null;
		
		try {
			// 스트림을 파일에 연결하고
			fr = new FileReader("src/day12/yeats_fw.txt");
			
			/*
			// 1. 한글자만 읽어보자.
			int ch = fr.read();
			// 출력
			System.out.println("읽어온 문자 : " + (char)ch);
			
			// 2. 여러문자를 읽어보자.
			char[] chArr = new char[32];
			int len = fr.read(chArr);
			// 출력
			System.out.println(new String(chArr, 0, len));
			 */
			
			// 3. 한행만 꺼내보자.
			char[] chArr = new char[32];
			
			loop:
			while(true) {
				int len = fr.read(chArr);
				for(int i = 0 ; i < len ; i++) {
					if(chArr[i] == '\r') {
						len = i;
						System.out.print(new String(chArr, 0, len));
						break loop;
					}
				}
				// 출력
				System.out.print(new String(chArr, 0, len));
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
