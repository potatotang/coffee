package day11;

/*
	파일에 저장하는 프로그램을 작성하세요.
	단, Buffered 스트림을 사용해서 처리하세요.
 */
import java.io.*;

import javax.swing.JOptionPane;
public class Test08 {

	public Test08() {
		// 반드시 타겟(기본) 스트림이 필요하다.
		FileOutputStream fout = null;
		// 필요에 따라서 보조(필터) 스트림을 연결한다.
		BufferedOutputStream bout = null;
		
		try {
		 	fout = new FileOutputStream("src/day11/버퍼드테스트01.txt");
		 	bout = new BufferedOutputStream(fout);
		 	
		 	// 저장할 데이터를 만든다.
		 	String str = "가을도 다가고 버스도 지나가고 바람은 무지 춥네요~~~!";
		 	// byte 기반 스트림을 사용하기 때문에 byte 배열이 필요하다.
		 	byte[] buff = str.getBytes();
		 	bout.write(buff);
		 	/*
		 	 	주의사항 ]
		 	 		버퍼는 다 채우지 않으면 자동으로 꺼내지지 않는다.
		 	 		따라서 아직 FileOutputStream 까지 전달되지 않은 상태다
		 	 		==> 파일이 아직 저장이 안된다.
		 	 		
		 	 		따라서 습관적으로 완료된 시점에서 버퍼를 비워주는 습관을 가진다.
		 	 */
		 	bout.flush();
		 	
		 	JOptionPane.showMessageDialog(null, "저장 완료~~~!");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bout.close(); // BufferedStream은 타겟(기본)스트림을 이용해서 만들기 때문에 먼저 닫아준다.
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
