package day12;

/*
	jenny.txt 파일을 읽어보자.
	
	참고 ]
		ObjectOutputStream으로 전송한 데이터는
		반드시 ObjectInputStream을 사용해서 읽어야 한다.
 */
import java.io.*;
import javax.swing.*;
public class Test08 {

	public Test08() {
		// 스트림 준비
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		
		try {
			// 스트림 만들고
			fin = new FileInputStream("src/day12/jenny.txt");
			oin = new ObjectInputStream(fin);
			
			// 클래스를 통채로 읽는다.
			Member jenny = (Member) oin.readObject();
			/*
				ObjectOutputStream은 객체 데이터를 채울때
				Object 타입으로 자동 형변환되서 처리한다.
				따라서 읽을때는 원래 타입으로 강제 형변환이 필요하다.
			 */
			String name = jenny.getName();
			String id = jenny.getId();
			String pw = jenny.getPw();
			String mail = jenny.getMail();
			String tel = jenny.getTel();
			int age = jenny.getAge();
			double height = jenny.getHeight();
			
			// 출력
			String str = String.format("이름 : %s\n아이디 : %s\n비밀번호 : %s\n전화 : %s\n메일 : %s\n나이 : %3d\n신장 : %5.2f", 
					name, id, pw, tel, mail, age, height);
			JOptionPane.showMessageDialog(null, str);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
