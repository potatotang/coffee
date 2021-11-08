package day11;

/*
	1. day11 패키지에 폴더하나를 강제로 만들어보자.
	2. 계층화된 폴더를 만들어보자.
	3. 만들어진 파일(폴더)하나를 삭제하자.
	4. fileTest01.txt 파일을 fileTest_new.txt 로 이름을 변경해보자.
 */
import java.io.*;

import javax.swing.JOptionPane;
public class Test05 {

	public Test05() {
		/*
		// 1. 만들고 싶은 폴더(없어도 상관없다.) 파일로 만들자.
		File f1 = new File("src/day11/folderTest");
		boolean bool = f1.mkdir();
		String str = "";
		if(bool) {
			str = "폴더 만들기 성공!!!";
		} else {
			str = "폴더 만들기 실패!!!";			
		}
		JOptionPane.showMessageDialog(null, str);
		*/
		
		/*
		// 2. 계층화된 폴더 만들기
		// day11 패키지에 folderTest/folder01/folder02/folder03
//		File f2 = new File("c:\\\\data\\day11\\folderTest\\folder01\\folder02\\folder03");
		File f2 = new File("src/day11/folderTest/folder01/folder02/folder03");
		
		if(!f2.exists()) {
			boolean bool = f2.mkdirs();
			String str = "";
			if(bool) {
				str = "폴더 만들기 성공!!!";
			} else {
				str = "폴더 만들기 실패!!!";			
			}
			JOptionPane.showMessageDialog(null, str);
		} else {
			
//			f2.delete();
			f2 = new File("src/day11/folderTest/folder01/folder02");
			boolean bool = f2.delete();
			if(bool) {
			System.out.println("*** 폴더 삭제 성공 ***");
			} else {
				System.out.println("### 폴더 삭제 실패 ###");
			}
		}
		*/
		
		// renameTo()
		// File 객체 두개를 만든다.
		File oldF = new File("src/day11/fileTest01.txt");
		File newF = new File("src/day11/fileTest_new.txt");
		// 이름을 바꿔준다.
		oldF.renameTo(newF);
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}













