package day12;

/*
	yeats_copy.txt 파일을
	byte 기반 스트림을 기본 스트림으로 사용하고
	문자 기반 스트림을 보조 스트림으로 사용해서
	읽어보자.
	
	InputStreamReader 를 사용해서 처리하면 된다.
 */
import java.io.*;
public class Test06 {

	public Test06() {
		// 스트림 준비
		FileInputStream fin = null;	// byte기반 기본(타겟) 스트림
		InputStreamReader isr = null;	// 문자기반과 byte기반 스트림을 연결해주는 보조스트림
		BufferedReader br = null;	// char기반 보조(필터) 스트림
		
		try {
			// 스트림을 만들고
			fin = new FileInputStream("src/day12/yeats_copy.txt");
			// 연결스트림을 만든다.
			isr = new InputStreamReader(fin);
			// 보조스트림을 만든다.
			br = new BufferedReader(isr);
			
			// 행단위로 몇번 작업이 되어야 할 지 모르므로 반복해서 처리
			while(true) {
				String str = br.readLine();
				// 종료조건 추가
				if(str == null) {
					break;
				}
				System.out.println(str);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
				fin.close();
			} catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new Test06();
	}

}
