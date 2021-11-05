package day10;

/*
	dooly.txt 파일을 읽어서 Map에 담아서 출력해보자.
 */
import java.io.*;
import java.util.*;
public class Test01 {
	Properties prop = new Properties();
	// 외부파일과 연결할 예정이다.
	FileInputStream fin = null;
	// fin 은 파일에 연결해야되는 것이고
	// 따라서 만들때 파일의 위치와 이름이 잘못되면 오류가 발생한다. ==> 예외처리가 필요하다.
	public Test01() {
		try {
			fin = new FileInputStream("src/day10/dool2.txt");
//			fin = new FileInputStream("src/day10/dooly.txt");
			/*
				경로는 
					절대 경로와 상대경로를 모두 사용할 수 있다.
				현재는 프로젝트를 기준으로 절대경로로 처리하는 방법이다.
			 */
			
			// 이제 파일의 내용을 Properties가 읽도록 한다.
			prop.load(fin);
			// 이 순간 파일의 내용을 읽어서 Map에 담아놨다.
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// 이제 맵이 완성이 됬으니 맵을 읽어서 내용을 출력해보자.
		Set keys = prop.keySet();
		// 키값들을 알아냈으니 데이터를 꺼내서 출력해보자.
		ArrayList list = new ArrayList(keys);
		
		// 맵에 있는데이터를 꺼낼준비가 됬으니 꺼내서 출력해보자.
		for(int i = 0 ; i < list.size(); i++ ) {
			String key = (String) list.get(i);
			String value = (String) prop.get(key);
			
			System.out.println(key + " : " + value);
		}
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}










