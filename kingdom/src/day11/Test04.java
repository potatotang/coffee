package day11;

/*
	파일을 만들어서 저장하는 프로그램을 작성해 보자.
 */
import java.io.*;

import javax.swing.JOptionPane;
public class Test04 {

	public Test04() {
		// 파일에 저장하기 위해서는 파일로 연결된 스트림이 필요하다.
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day11/fileTest01.txt");
			// 이때 파일은 없어도 되지만 경로는 존재해야 한다.
			// ==> 파일을 자동으로 존재하지 않아도 만들어준다.
			/*
			// 1. 한글자 입력하고 저장하기
			fout.write('O');
			*/
			
			// 2. 여러글자 저장
			String str = "Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.\r\n" + 
					"The behavior of this method when this string cannot be encoded in the default charset is unspecified. The CharsetEncoder class should be used when more control over the encoding process is required.";
			// 문자열을 byte 배열로 변환 <=== byte 단위로 처리하기 때문에...
			byte[] buff = str.getBytes();
			// fout.write(buff);
			
			// 일부만 저장하는 방법
			// 먼저 위치값을 찾는다.
			int idx = str.indexOf("T", str.indexOf("T") + 1);
			fout.write(buff, idx, buff.length - idx);
			
			JOptionPane.showMessageDialog(null, "☆☆☆ 파일 저장 성공 ☆☆☆");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 외부장치와 연결된 경우는 해당 외부장치의 사용이 끝나면 닫아주는 것이 원칙이다.
			try {
				fout.close();
			} catch(Exception e) {}
		}
		
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
