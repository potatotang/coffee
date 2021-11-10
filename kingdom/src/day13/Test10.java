package day13;

public class Test10 {

	public Test10() {
		Thread1001 t1 = new Thread1001();
		Thread1002 t2 = new Thread1002();
		t1.start();
		t2.start();
		
		/*
			이제 이 메인은 t1 스레드가 종료되기 전까지 실행하지 못하도록 하고 싶다.
			이처럼 특정 스레드가 다른 스레드에 실행이 될때
			실행하지 못하도록 막는 방법 
				join()
		 */
		try {
			t1.join();
			t2.join();
			/*
				t1 스레드가 Block 상태가 되는 것이 아니고
				지금 실행중인 프로그램(스레드 포함) ==> 메인 프로세스
				가 중단되는 것이다.
				언제까지??
					<== 지정한 스레드(t1) 가 종료될때 까지...
			 */
		} catch(Exception e) {}
		System.out.println("##### 종료 #####");
	}

	public static void main(String[] args) {
		System.out.println("*** 프로세스 실행 ***");
		new Test10();
	}

}

class Thread1001 extends Thread {
	public void run() {
		for(int i = 0 ; i < 100 ; i++ ) {
			System.out.println("제니가 충남대학교에 입학한다면??? " + (i+1));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}

class Thread1002 extends Thread {
	public void run() {
		for(int i = 0 ; i < 500 ; i++ ) {
			System.out.println("아이유가 오타벡를 만나러 옵니다. " + (i+1));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}
