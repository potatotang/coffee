package day08;

import javax.swing.*;
public class Test01 {
	
	public Test01() {
		abc();
		
//		try {
			xyz();
//		} catch(NumberFormatException e) {
//			e.printStackTrace();
//		}
	}
	
	void abc() {
		String sno = JOptionPane.showInputDialog("정수를 입력하세요!");
		
		try {
			int no = Integer.parseInt(sno);// 1
			System.out.println("입력된 정수는 " + no + "이고 그 제곱은 " + (no * no) + " 입니다."); // 2
		/*
		} catch(Exception e) { // 넓은 범위의 예외를 먼저 기술하면 하위 예외 catch 블럭은 절대로 실행되지 않는다.
		*/
		} catch(NumberFormatException e) {
			System.out.println(e);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			e.printStackTrace();
//			System.out.println("*********** 선생님 도와주세요! ********"); // 3
//			return;
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("##### 숙제 끝 #####"); // 4
		}
		
		System.out.println("*** 프로그램 종료 ***"); // 5
		
		// 1번에서 예외가 발생한 경우 실행 순서 1 --> 3 --> 4 --> 함수 실행 종료
	}
	
	void xyz() throws NumberFormatException {
		String sno = JOptionPane.showInputDialog("정수를 입력하세요!");
		
		int no = Integer.parseInt(sno);// 1
		System.out.println("입력된 정수는 " + no + "이고 그 제곱은 " + (no * no) + " 입니다."); // 2
		System.out.println("##### 숙제 끝 #####"); // 4
		
		System.out.println("*** 프로그램 종료 ***"); // 5
		
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
