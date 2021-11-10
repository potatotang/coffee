package day12.thread;

import javax.swing.JOptionPane;

public class Test07 {

	public Test07() {
		// 객체를 만들어주고
		SleepTrd01 tmp1 = new SleepTrd01();
		SleepTrd02 tmp2 = new SleepTrd02(); // 이 클래스는 일반클래스를 new 시켜놓은 것과 같다.
		
		// 스레드로 만들어서
		Thread t1 = new Thread(tmp1);
		Thread t2 = new Thread(tmp2);
		// Runnable 상태로 전위시킨다.
		t1.start();
		t2.start();
		
		String str = "";
		while(true) {
			str = JOptionPane.showInputDialog("메뉴를 입력하세요!");
			if(str.equals("q")) {
				try{
					t1.suspend();
				}catch(Exception e) {}
			} else if(str.equals("x")) {
				tmp1.setBool(true);
				tmp2.setBool(true);
				try {
//					t1.stop();
//					t2.stop();
				} catch(Exception e) {}
				break;
			} else {
				t1.resume();
			} 
		}
		JOptionPane.showMessageDialog(null, str);
	}

	public static void main(String[] args) {
		new Test07();
		System.out.println("main() 종료!!!");
	}

}
