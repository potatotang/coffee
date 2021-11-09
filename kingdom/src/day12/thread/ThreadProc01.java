package day12.thread;

public class ThreadProc01 implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++ ) {
			System.out.println("돌쇠가 나무를 합니다.");
		}
	}

}
