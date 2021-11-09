package day12;

/*
	이미지 파일을 복사해서  복사된 이미지파일을 만들어보자.
	이때 문자 기반 스트림으로 처리해보자.
	
	이때 이미지 파일은 기계어로 저장된 파일이므로
	문자단위로 처리하면 절대로 안되다.
	
	여기서는 문자단위로 처리하면 안되는 것을 보여주기위한 예제이다.
 */
import java.io.*;

import javax.swing.JOptionPane;
public class Test04 {

	public Test04() {
		// 스트림 준비하고
		FileReader fr = null;
		FileWriter fw = null;
		try {
			// 파일에 연결하고
			/*
			// 문자 파일 복사
			fr = new FileReader("src/day12/yeats_fw.txt");
			fw = new FileWriter("src/day12/yeats_copy.txt");
			 */
			
			// 이미지 파일 복사
			fr = new FileReader("src/day12/jenny.jpg");
			fw = new FileWriter("src/day12/제니.jpg");
			
			// 몇번 반복할지 알 수 없으므로 
			// 문자배열 준비하고
			char[] arr = new char[1024];
			while(true) {
				int len = fr.read(arr);
				if(len == -1) {
					// 이 경우는 읽어온 데이터가 없는 경우
					break;
				}
				fw.write(arr, 0, len);
			}
			
			JOptionPane.showMessageDialog(null, "* 파일 복사에 성공했습니다. *");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				fr.close();
			} catch(Exception e) {}
		}
		
		// 읽어서 바로 저장하고
		
		// 완료 메세지 출력해주고..
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
