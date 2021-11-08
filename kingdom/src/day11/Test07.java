package day11;

/*
	fileTest.txt
	파일을 
	fileTest_copy1.txt
	복사해보자.
 */
import java.io.*;

import javax.swing.JOptionPane;
public class Test07 {

	public Test07() {
		// 할일
		/*
			스트림은 단방향이다.
			복사라는 것은 한곳에서 읽어서 다른곳에 그대로 쓰면 된다.
			따라서 스트림이 두개가 필요하다.
		 */
		// 1. 스트림을 준비한다.
		FileInputStream fin = null;	// 원본
		FileOutputStream fout = null; // 복사본
		try {
			// 1-1. 스트림을 연다.
			fin = new FileInputStream("src/day11/fileTest.txt");
			fout = new FileOutputStream("src/day11/fileTest_copy1.txt");
			// 2. 파일을 읽어서 그대로 저장한다.
			// 몇번 반복해야 할지 모른다.
			// 반복해서 처리하고 이때 읽어서 그대로 다른곳에 쓰면된다.
			byte[] buff = new byte[1024];
			while(true) {
				int len = fin.read(buff);
				if(len == -1) {
					// 읽어온 데이터가 없으므로 반복문을 즉시 종료시킨다.
					break;
				}
				fout.write(buff, 0, len);
			}
			
			JOptionPane.showMessageDialog(null, "집에 갑시다. 저장성공!!!");
		} catch(Exception e) {
			System.out.println("##### 파일 복사 실패 #####");
			e.printStackTrace();
		} finally {
			// 3. 스트림 닫아준다.
			try {
				fin.close();
				fout.close();
			} catch(Exception e) {}
		}
		
		
	}

	public static void main(String[] args) {
		new Test07();
	}

}
