package day13;

public class Test06 {
	int num;
	public Test06() {
		// NewBorn 상태로 만든다.
		SyncTest01 s1 = new SyncTest01(this);
		SyncTest02 s2 = new SyncTest02(this);
		
		// Runnable 상태로 전위
		s1.start();
		s2.start();
	}

	public static void main(String[] args) {
		new Test06();
	}

}

class SyncTest01 extends Thread {
	Test06 main;
	public SyncTest01() {}
	public SyncTest01(Test06 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++ ) {
			int no = (int)(Math.random()*101);
			main.num = no;
			System.out.println(main.num + " ] 을 기억했습니다.");
		}
	}
}

class SyncTest02 extends Thread {
	Test06 main;
	public SyncTest02() {}
	public SyncTest02(Test06 main) {
		this.main = main;
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++ ) {
			int no = main.num;
			System.out.println("\t\t" + no + " > 를 읽었습니다.");
		}
	}
}

