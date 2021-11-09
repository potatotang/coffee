package day12.thread;

public class YieldThread02 extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i < 1000; i++ ) {
			System.out.println("\t반장님이 메뉴를 고릅니다.");
			yield();
		}
	}
}
