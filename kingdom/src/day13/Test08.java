package day13;

public class Test08 {

	public Test08() {
		// NewBorn
		Thread0801 t1 = new Thread0801(this, "제니");
		Thread0802 t2 = new Thread0802(this, "둘리");
		
		// Runnable
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test08();
	}
	
	synchronized void abc() {
		// 이 함수를 호출한 스레드의 이름을 알아낸다.
		String name = Thread.currentThread().getName();
		System.out.println(name + " ] 스레드가 abc 함수를 사용하기 시작");
		
		try {
			Thread.sleep(3000);
		} catch(Exception e) {}
		System.out.println(name + " ] 스레드가 abc 함수를 종료");
	}
	
	synchronized void xyz() {
		// 지금 이 함수를 호출하는 스레드를 알아낸다.
		String name = Thread.currentThread().getName();
		System.out.println("\t" + name + " ] 스레드가 xyz 함수를 사용 시작");
		// 원래 여기서는 필요한 작업을 해야하는데...
		// 딱히 생각도 안나고 코딩하기 싫어서 3초동안만 이 함수를 차지하도록 하자.
		try {
			Thread.sleep(3000);
		} catch (Exception e) {}
		System.out.println("\t" + name + " ] 스레드가 xyz 함수를 사용 종료");
	}
}

class Thread0801 extends Thread {
	Test08 main;
	public Thread0801() {}
	public Thread0801(Test08 main, String name) {
		super(name);
		this.main = main;
	}
	
	@Override
	public void run() {
		main.abc();
		main.xyz();
	}
}

class Thread0802 extends Thread {
	Test08 main;
	public Thread0802() {}
	public Thread0802(Test08 main, String name) {
		super(name);
		this.main = main;
	}
	@Override
	public void run() {
		main.abc();
		main.xyz();
	}
}













