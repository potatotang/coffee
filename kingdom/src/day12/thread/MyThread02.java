package day12.thread;

public class MyThread02 extends Thread {
	// 이 스레드에서는 제니가 노래를 1000곡을 부른다.
	@Override
	public void run() {
		for(int i = 0 ; i< 1000 ; i++ ) {
			System.out.println("\t제니가 < " + (i + 1) + " > 번째 곡을 부릅니다.");
		}
	}
}
