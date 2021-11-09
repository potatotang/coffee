package day12.thread;

public class SleepTrd02 implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++ ) {
			System.out.println("\t" + i + " 선생님이 치킨마요에 도전합니다." );
			/*
			 	한번 출력하면 비록 시간이 남았지만...
			 	이번에는 아예 블럭상태(Block)로 보낸다.
			 */
			try {
				// Runnable 상태로 복귀할 시간을 정해주면서 명령을 내린다.
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}

}
