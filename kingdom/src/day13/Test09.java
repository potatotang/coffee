package day13;

/*
	ArrayList 하나를 준비해서
	이곳에 데이터를 넣고 빼고를 할 예정이다.
		1번 스레드는 이곳에 데이터를 입력할 예정이고
		2번 스레드는 이곳에 데이터를 가지고 갈 예정이다.
		
	규칙 ]
		5개의 데이터가 입력되면 더이상 입력하면 안된다.
 */

import java.util.*;
public class Test09 {
	ArrayList<Integer> list = new ArrayList<Integer>();
	public Test09() {
		Thread0901 t1 = new Thread0901(this);
		Thread0902 t2 = new Thread0902(this);
		
		t1.start();
		t2.start();
	}
	
	// 데이터를 입력하는 함수
	synchronized void makeData(int num) {
		if(list.size() == 5) {
			// 이 경우는 일을 하면 안된다.
			try {
				System.out.println("한숨 자고 합니다.");
				wait();
			} catch(Exception e) {}
		}
		
		// 데이터 하나를 추가
		list.add(num);
		System.out.println(num + " ] 을 채웠습니다.");
		System.out.println(list.size() + " 개의 숫자를 채웠습니다.");
		// 이제 숫자를 꺼내는 작업을 해도 된다.
		notify();
		// ==> 가장 먼저 Block 상태로 들어간 스레드가 작업을 진행하게 된다.
	}
	
	// 데이터 꺼내는 함수
	 synchronized void getData() {
		 if(list.size() == 0) {
			 // 이 경우는 꺼낼 데이터가 없기 때문에 꺼내는 작업을 하면 안된다.
			 // 따라서 스스로 Block 상태가 되어야 한다.
			 try {
				System.out.println("\t가지고가는 사람 쉬러갑니다.");
				 wait();
			} catch (InterruptedException e) {}
		 }
		 
		 // 사용할 데이터를 list 꺼낸다.
		 int no = list.get(0);
		 // 꺼낸 데이터는 삭제한다.
		 list.remove(0);
		 System.out.println("\t" + no + " ]  꺼내갑니다.");
		 System.out.println("\t" + list.size() + " 개의 숫자가 있습니다.");
		 // 이제 list에는 최소한 데이터를 입력할 공간 하나는 확보하게 된다.
		 // 따라서 데이터를 채우는 작업을 깨워준다.
		 notify();
		 
	 }
	
	public static void main(String[] args) {
		 new Test09();
	}
}

class Thread0901 extends Thread {
	Test09 main;
	public Thread0901() {}
	public Thread0901(Test09 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 50 ; i++ ) {
			int no = (int)(Math.random()*101);
			main.makeData(no);
			
			int sec = (int)(Math.random()*1501 + 500);
			try {
				Thread.sleep(sec);
			} catch (InterruptedException e) {}
		}
	}
}

class Thread0902 extends Thread {
	Test09 main;
	public Thread0902() {}
	public Thread0902(Test09 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 50 ; i++ ) {
			main.getData();
			
			int sec = (int)(Math.random()*1501 + 500);
			try {
				Thread.sleep(sec);
			} catch (InterruptedException e) {}
		}
	}
}
