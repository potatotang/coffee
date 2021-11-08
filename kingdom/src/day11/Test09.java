package day11;

/*
	파일에 
	친구의 정보를 저장하자
		정보
			이름		String
			나이		int
			신장		double
			성별		char
			전화번호	String
			메일		String
 */
import java.io.*;
public class Test09 {

	public Test09() {
		// 기본(타겟)스트림 준비
		FileOutputStream fout = null;
		// 필터 스트림 준비
		DataOutputStream dout = null;
		try {
			// 스트림 연결
			fout = new FileOutputStream("src/day11/DataStreamTest01.txt");
			dout = new DataOutputStream(fout);
			
			// 데이터 만들고
			String name = "제니";
			int age = 26;
			double height = 160.5;
			char gen = 'F';
			String tel = "010-1111-1111";
			String mail = "jenny@cnu.ac.kr";
			/*
				DataInputStream / DataOutputStram 은 
				자바의 데이터를 변환없이 사용할 수 있다.
			 */
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeDouble(height);
			dout.writeChar(gen);
			dout.writeUTF(tel);
			dout.writeUTF(mail);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dout.close();
				fout.close();
			} catch(Exception e) {}
		}
		
		// 데이터 보내고
		
	}

	public static void main(String[] args) {
		new Test09();
	}

}
