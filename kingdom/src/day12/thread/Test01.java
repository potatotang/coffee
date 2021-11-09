package day12.thread;

/*
	스레드 프로그램을 한번 실행보도록 하자.
 */
public class Test01 {

	public Test01() {
		/*
			1. 스레드  프로그램은 반드시 New Born 상태로 만들어야 한다.
				 New Born 상태란?
				 	실행 가능한 프로그램을 만든다는 의미
				 이것은 자바에서는 new 시키면 된다.
		 */
		
		MyThread01 t1 = new MyThread01();
		MyThread02 t2 = new MyThread02();
		// 두개의 스레드 프로그램이 NewBorn 상태가 되었다.
		
		// 스레드 프로그램이 실행이 되려면 반드시 Runnable 상태로 전위시켜야 한다. start() 를 호출해줘야 한다.
		// Runnable 상태로 전위
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test01();
		System.out.println("프로그램 종료");
	}

}
