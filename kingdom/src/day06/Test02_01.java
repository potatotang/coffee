package day06;

public class Test02_01 extends Test02 {
	int no = 100;
	
	public static void main(String[] args) {
		Test02_01 t1 = new Test02_01();
		t1.abc();
		System.out.println("t1.no : " + t1.no);
		
		Test02 t2 = new Test02_01();
		t2.abc();
		System.out.println("t2.no : " + t2.no);
		
		Test02 t3 = new Test02_02();
		
		t3.abc();
	}
	
	public void abc() {
		System.out.println("***** 여기는 Test02_01 클래스 *****");
	}
}
