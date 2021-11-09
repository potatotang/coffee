package day12.thread;

public class Coding02 implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++ ) {
			String name = Thread.currentThread().getName();
			System.out.println((name.equals("재영")? "": "\t\t") + name + " ] 씨가 자바 공부를 합니다.");
		}
	}

}
