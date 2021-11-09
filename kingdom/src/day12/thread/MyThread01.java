package day12.thread;

public class MyThread01 extends Thread {
	// 이 클래스 내부에도 역시 생성자, 함수, 변수도 물론 사용할 수 있다.
	
	@Override
	public void run() {
		// 이 프로그램에서는 반장님이 코딩을 1000개 만드는 작업을 시킬 예정이다.
		for(int i = 0; i < 1000; i++ ) {
			System.out.println("반장님이 [ " + (i + 1) + " ] 번째 코딩을 완료했습니다.");
		}
	}
}
