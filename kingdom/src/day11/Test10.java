package day11;

/*
	Test09에서 작성한 파일을 읽어보자.
 */
import java.io.*;
public class Test10 {
/*
	DataOutputStream으로 작성된 파일은 반드시 
	DataInputStream으로 읽어야 한다.
	그리고 내보낸 순서대로 읽어와야 한다.
 */
	public Test10() {
		// 스트림준비하고
		FileInputStream fin = null;
		DataInputStream din = null;
		try {
			// 스트림 연결하고
			fin = new FileInputStream("src/day11/DataStreamTest01.txt");
			din = new DataInputStream(fin);
			/*
				파일을 저장할 때
					이름, 나이, 신장, 성별, 전화번호, 메일
				순서로 저장을 했으므로 읽을때도 이 순서가 지켜져야 한다.
			 */
			// 읽어서 변수에 기억시키고
			String name = din.readUTF();// 이름
			int age = din.readInt();	// 나이
			double height = din.readDouble();	// 신장
			char gen = din.readChar();		// 성별
			String tel = din.readUTF();		// 전화번호
			String mail = din.readUTF();	// 메일
			
			// 출력한다.
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("신장 : " + height);
			System.out.println("성별 : " + gen);
			System.out.println("전화 : " + tel);
			System.out.println("메일 : " + mail);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				din.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
