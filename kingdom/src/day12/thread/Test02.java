package day12.thread;

/*
	Runnable 인터페이스를 구현한 스레드 프로그램을 실행시켜보자.
 */
public class Test02 {

	public Test02() {
		// Runnable 인터페이스를 구현한 클래스의 경우는 방법이 조금 다르다.
		ThreadProc01 tmp1 = new ThreadProc01();
		ThreadProc02 tmp2 = new ThreadProc02();
		// 이 상태는 아직  NewBorn 상태가 아니다.
		// 따라서 NewBorn 상태로 만들어 줘야 한다.
		
		Thread t1 = new Thread(tmp1);
		Thread t2 = new Thread(tmp2);
		// *** 이 상태가 NewBorn 상태가 됬다.
		
		// Runnable 상태로 전위시킨다.
		t2.start();
		t1.start();
	}

	public static void main(String[] args) {
		new Test02();
	}

}
