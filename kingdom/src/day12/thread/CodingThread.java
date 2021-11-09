package day12.thread;

public class CodingThread extends Thread {
	/*
		하나의 프로그램을 이용해서 여러번 실행할 경우
		이것을 구분할 필요가 있을 것이다.
		구분하는 방법은 여러가지가 있다.
		
		1. 변수 하나를 만들고 그 변수에 값을 다르게 입력해서 구분하는 방법
			String name;
		2. 스레드 자체에 이름을 부여하는 방법이 있다.
			이때는 상위클래스인 Thread의 생성자중
				Thread(String name)
			를 이용하면 된다.
			즉, 상위 클래스의 기본생성자가 아닌 
			다른 생성자를 이용하면 스레드에 이름을 부여할 수 있다.
			
			super()
			이 명령은 	
					1. 반드시 생성자 안에서만 사용해야 하고
					2. 반드시 생성자의 첫줄 첫문장으로만 사용해야 한다.
	 */
	
	public CodingThread() {}
	public CodingThread(String name) {
		super(name);
		// new 시킬때 입력되는 이름으로 스레드 이름을 붙일 것이다.
	}
	@Override
	public void run() {
		// 스레드 이름을 이용하는 방법
		// 		getName() 함수를 이용해서 이름을 알아낼 수 있다.
		// 지금 run은 두번 실행된다.
		// 그것도 순서를 무시한 병행처리가 된다.
		// 지금 어떤 스레드가 실행되는지를 먼저 알아낸다.
		//		currentThread()
		for(int i = 0 ; i < 1000; i++ ) {
			Thread t = Thread.currentThread();
			String name = t.getName();
			
			// 출력
			System.out.println((name.equals("재영") ? "" : "\t\t") + name + " ] 씨가 코딩을 합니다.");
		}
		
	}
}
