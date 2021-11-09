package day12.thread;

public class Test03 {

	public Test03() {
		CodingThread t1 = new CodingThread("재영");	// 이렇게 하면 하나가 NewBorn 상태가 됬다.
		CodingThread t2 = new CodingThread("제니"); // 이렇게 하면 하나가 NewBorn 상태가 됬다.
		
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test03();
	}

}
