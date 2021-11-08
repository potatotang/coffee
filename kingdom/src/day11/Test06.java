package day11;

/*
	day11 폴더의 파일 목록을 알아내보자.
 */
import java.io.*;
public class Test06 {

	public Test06() {
		// 작업순서
		// 1. 목록을 알고 싶은 폴더를 파일객체로 만든다.
		File f = new File("src/day11");
		
		/*
		// list()로 꺼내는 방법
		// 2. 목록 꺼내오고
		String[] fArr = f.list();
		// 3. 출력
		for(String s : fArr) {
			System.out.println(s);
		}
		*/
		
		/*
		// 파일의 정보까지 꺼내는 방법
		File[] fArr = f.listFiles();
		System.out.println();
		for(int i = 0 ; i < fArr.length ; i++ ) {
			File fileInfo = fArr[i];
			String fname = fileInfo.getName();	// 파일 이름 반환해주는 함수
			long len = fileInfo.length(); // 파일 사이즈 반환해주는 함수
			String folder = fileInfo.getParent();
			
			// 출력
			System.out.println("폴더 : " + folder);
			System.out.println("파일이름 : " + fname);
			System.out.println("파일길이 : " + len + " byte");
			System.out.println("------------------------------------------------");
			System.out.println();
			
		}
		*/
		
		// 확장자가 .txt 인 파일만 골라서 출력해보자.
		String[] fArr = f.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				/*
					이 함수는 자동 호출되는 함수이다.
					목록을 구하는 파일을 하나씩 발견할 때마다 이 함수가 호출된다.
					이때 이함수가 호출되는 해당 파일에서 이함수의 반환값이 
						true 인경우는 결과에 포함시키고
						false 인경우는 결과에서 제외시킨다.
						
					확장자를 알아내는 방법
						파일이름.endsWith("txt");
				 */
				if(name.endsWith("txt")) {
					return true;
				}
				return false;
			}
		});
		
		// 출력해보자.
		for(int i = 0 ; i < fArr.length ; i++ ) {
			String fileName = fArr[i];
			System.out.println((i + 1) + " . " + fileName);
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
