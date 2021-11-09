package day12;

/*
	친구 정보를 파일로 Member 클래스를 이용해서 저장해보자.
 */
import java.io.*;

import javax.swing.JOptionPane;
public class Test07 {

	public Test07() {
		// 스트림 준비
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		
		try {
			// 스트림 만들고
			fout = new FileOutputStream("src/day12/jenny.txt");
			oout = new ObjectOutputStream(fout);
			
			// 데이터 준비
			Member jenny = new Member("제니", "jenny", "12345", "010-1111-1111", 
									"jenny@cnu.ac.kr", 26, 165.5 );
			
			// 데이터 채워져있는지 확인하고
//			System.out.println(jenny);
			
			// 데이터를 쓴다.
			oout.writeObject(jenny);
			/*
				이처럼 클래스 전체를 입출력하는 행위를
				직렬화라고 표현한다.
				이때 사용되는 클래스는
				반드시 직렬화 가능한 클래스(Serializable 인터페이스를 구현한 클래스)
				여야만 한다.
			 */
			
			JOptionPane.showMessageDialog(null, "친구 추가 완료!");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
