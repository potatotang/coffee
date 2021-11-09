package day12;

/*
	예츠의 오이진의 방랑기를
	파일에 저장해보자.
	
	PrintStream 을 사용해서 저장한다.

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
public class Test01 {

	public Test01() {
		// 스트림을 준비
		PrintStream ps = null;
		
		try {
			// 스트림을 파일에 연결한다.
			ps = new PrintStream("src/day12/yeats.txt");
			
			// 스트림이 준비되면 바로 내용을 쓰면 된다.
			/*
				PrintStream은 직접 파일에 연결된 스트림을 만드는 보조스트림이다.
				내부적으로 기본스트림을 만들어서 처리하게 된다.
			 */
			
			ps.println("The Wanderings of Oisin and Other Poems");
			ps.println();
			ps.println("We rode in sorrow, with strong hounds three,");
			ps.println("Bran, Sgeolan, and Lomair,");
			ps.println("On a morning misty and mild and fair.");
			ps.println("The mist-drops hung on the fragrant trees,");
			ps.println("And in the blossoms hung the bees.");
			ps.println("We rode in sadness above Lough Lean,");
			ps.println("For our best were dead on Gavra's green.");
			ps.println();
			ps.println("- William Butler Yeats -");
			
			JOptionPane.showMessageDialog(null, "*** 파일 저장 성공 ***");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("### 파일 저장 실패 ###");
		} finally {
			try {
				ps.close();
				/*
					참고 ]
						Stream의 close() 는 
						flush() 의 기능을 포함하고 있다.
						따라서 사용하던 스트림을 닫게 되면
						자동으로 flush() 가 호출된다.
				 */
			} catch(Exception e) {}
		}
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}
