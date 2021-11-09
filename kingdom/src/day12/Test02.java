package day12;

/*
	char 단위로 파일에 데이터를 저장하는 프로그램을 작성하세요.
	
The Wanderings of Oisin and Other Poems

We rode in sorrow, with strong hounds three,
Bran, Sgeolan, and Lomair,
On a morning misty and mild and fair.
The mist-drops hung on the fragrant trees,
And in the blossoms hung the bees.
We rode in sadness above Lough Lean,
For our best were dead on Gavra's green.

- William Butler Yeats -
 */

import java.io.*;

import javax.swing.JOptionPane;
public class Test02 {

	public Test02() {
		// 문자단위 스트림 준비하고
		FileWriter fw = null;
		try {
			// 스트림을 파일에 연결해서 만들고
			fw = new FileWriter("src/day12/yeats_fw.txt");
			
			/*
			// 1. 한글자만 입력해보자.
			char ch = 'Y';
			fw.write(ch);
			
			// 2. 여러문자를 입력
			String str = "The Wanderings of Oisin and Other Poems";
			fw.write(str);
			 */
			
			// 3. 시 한편 입력
			StringBuffer buff = new StringBuffer("The Wanderings of Oisin and Other Poems");
			buff.append("\r\n");
			buff.append("\r\n");
			buff.append("We rode in sorrow, with strong hounds three,");
			buff.append("\r\n");
			buff.append("Bran, Sgeolan, and Lomair,");
			buff.append("\r\n");
			buff.append("On a morning misty and mild and fair.");
			buff.append("\r\n");
			buff.append("The mist-drops hung on the fragrant trees,");
			buff.append("\r\n");
			buff.append("And in the blossoms hung the bees.");
			buff.append("\r\n");
			buff.append("We rode in sadness above Lough Lean,");
			buff.append("\r\n");
			buff.append("For our best were dead on Gavra's green.");
			buff.append("\r\n");
			buff.append("\r\n");
			buff.append("- William Butler Yeats -");
			fw.write(buff.toString());
			
			// 작업끝 메세지 출력하고
			JOptionPane.showMessageDialog(null, "*** 파일 저장 성공 ***");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
