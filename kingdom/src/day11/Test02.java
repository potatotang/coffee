package day11;

/*
	키보드를 이용해서 문자를 입력받아보자.
 */
import java.io.*;
import java.util.*;
public class Test02 {
/*
	키보드 역시 외부장치이다.
	자주 사용하는 외부장치이기 때문에
	이미 스트림을 준비한 변수가 존재한다.
	그 변수가
		System.in
	이다.
 */
	public Test02() {
		System.out.print("문자열를 입력하세요! : ");
		
		int ch = 0;
		try {
			/*
			// 1. 한글자 읽어오기
			ch = System.in.read(); // read() : 한글자만 읽어오는 함수
			// 출력
			char munja = (char) ch;
			System.out.println("반환 데이터 : " + ch);
			System.out.println("입력한 문자 : " + munja);
			
			// 2. 여러글자를 읽어보자.
			// 읽은 데이터를 기억할 변수를 만들어준다.
			byte[] buff = new byte[256];
			// 이때 기억시킬 데이터의 갯수는 숫자에 따라 변할 것이고
			// 이것의 의미는 한번에 처리할 문자의 갯수를 의미한다.
			int len = System.in.read(buff);
			// 읽은 결과를 문자로 변환해서 출력하자.
			String result = new String(buff, 0, len);
			System.out.println("입력 문장 : " + result);
			 */
			
			// 3. 주로 네트워크에서 많이 사용하는 방법
			byte[] buff = new byte[256];
			// 준비된 배열에 'A'를 채운다.
			Arrays.fill(buff, (byte) 'A');
			// 데이터를 읽어와서 배열에 채운다.
			int len = System.in.read(buff, 10, 100);
			// ==> 준비된 배열인 buff에 11번째 방부터 읽은 내용을 기억하세요.
			// 		이때 최대 100개만 읽으세요...
			
			String result = new String(buff, 0, len + 10);
			// 출력
			System.out.println("입력한 문장 : " + result);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
