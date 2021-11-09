package day12.thread;

public class Test04 {

	public Test04() {
		Coding02 tmp = new Coding02();
		// 이것은 아직 스레드는 아니다.
		// 다시 Thread를 강제로 만들어줘야 한다.
		Thread t1 = new Thread(tmp, "재영");
		Thread t2 = new Thread(tmp, "제니"); // 이제 두 개 모두 NewBorn 상태가 됬다.
		
		// Runnable 상태로 전위
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test04();
	}

}
