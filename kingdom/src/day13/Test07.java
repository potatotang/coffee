package day13;

public class Test07 {
	int[] num = new int[5];
	public Test07() {
		// NewBorn 상태로 만든다.
		MyThread07_01 t1 = new MyThread07_01(this);
		MyThread07_02 t2 = new MyThread07_02(this);
		
		// Runnable 상태로 전위
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test07();
	}

}


class MyThread07_01 extends Thread {
	Test07 main;
	public MyThread07_01() {}
	public MyThread07_01(Test07 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		/*
			이 스레드에서는 배열변수에 데이터를 기억하는 역할을 할 예정이다.
			이 스레드가 5개의 데이터를 완성할때까지는
			다른 스레드에서 배열을 사용하지 못하게 하고 싶다.
		 */
		System.out.println("### 데이터 기억 시작 ###");
		
		synchronized(main.num){
			for(int i = 0 ; i < 5 ; i++ ) {
				int no = (int)(Math.random()*101);
				main.num[i] = no;
				System.out.println(no + " ] 를 기억했습니다.");
				
				// 쉬는 시간을 0.5 ~ 2초 사이로 랜덤하게 정해서
				int sec = (int)(Math.random()* (2000 - 500 + 1) + 500);
				try {
					Thread.sleep(sec);
				} catch(Exception e) {}
			}
			System.out.println("***** 데이터 저장 완료 *****");
		}
	}
}

// Test07의 데이터를 읽어오는 스레드
class MyThread07_02 extends Thread {
	Test07 main;
	public MyThread07_02() {}
	public MyThread07_02(Test07 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		// 이 스레드에서는 배열 변수의 데이터를 꺼내서 사용하는 역할을 할 예정이다.
		System.out.println("\t+++++ 데이터 읽기 시작 +++++");
		
		synchronized(main.num) {
			for(int i = 0 ; i < 5 ; i++ ) {
				// 데이터꺼내오고
				int no = main.num[i];
				// 출력
				System.out.println("\t" + no + " ] 를 읽었습니다.");
				
				// 쉬는 시간을 0.5 ~ 2초 사이로 랜덤하게 정해서
				int sec = (int)(Math.random()* (2000 - 500 + 1) + 500);
				try {
					Thread.sleep(sec);
				} catch(Exception e) {}
			}
			System.out.println("\t^^^^^ 데이터 읽어오기 완료 ^^^^^");
		}
	}
}
