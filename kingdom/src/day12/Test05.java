package day12;
/*
	yeats_copy.txt 파일을 문자기반 보조스트림을 사용해서 읽어보자. 
 */
import java.io.*;
public class Test05 {

	public Test05() {
		// 스트림 준비하고
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// 파일에 연결하고
			fr = new FileReader("src/day12/yeats_copy.txt");
			br = new BufferedReader(fr);
			
			// 몇번 읽어야할지 모르므로...
			String result = "";
			StringBuffer buff = new StringBuffer();
			while(true) {
				// BufferedReader는 버퍼기능과 편의기능까지 갖추고 있다.
				String str = br.readLine();
				/*
					 주의사항 ]
					 	readLine() 는 줄바꿈기호를 만나면
					 	읽는 것을 멈춘다.
					 	따라서 원본 문서처럼 보여줄려면
					 	줄바꿈 기호를 추가해줘야한다.
				 */
				if(str == null) {
					// 꺼내온 데이터가 없는 경우
					break;
				}
				buff.append(str + "\r\n");
				
//				result = result + str + "\r\n";
			}
//			System.out.println(result);
			System.out.println(buff.toString());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch(Exception e) {}
		}
		
		// 읽어서 데이터 만들고
		
		//  출력하고
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
