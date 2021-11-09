package day12.thread;

public class Test05 {

	public Test05() {
		YieldThread01 t1 = new YieldThread01(); // NewBorn 상태
		YieldThread02 t2 = new YieldThread02(); // NewBorn 상태
		
		// Runnable 상태로 전위
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test05();
	}
}
