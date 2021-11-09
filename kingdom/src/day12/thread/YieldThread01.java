package day12.thread;

public class YieldThread01 extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i < 1000; i++ ) {
			System.out.println("선생님이 학교를 구경합니다.");
			// 한번 구경했으니
			// 다른 프로그램에게 양보한다.
			// 즉, Runnable 상태로 되돌린다.
			yield();
		}
	}
}
