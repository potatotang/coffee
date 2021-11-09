package day12.thread;

public class ThreadProc02 implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++ ) {
			System.out.println("\t재영씨가 코딩 공부를 합니다.");
		}
	}

}
