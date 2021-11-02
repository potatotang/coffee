package day07;

public class Test05 {
	
	public static class TopClass {
		public void toPrint() {
			new Test05().abc();
			System.out.println("여기는 탑레벨 내부클래스");
		}
	}
	
	public static void main(String[] args) {
		TopClass t1 = new TopClass();
		t1.toPrint();
	}
	
	void abc() {
		TopClass t = new TopClass();
		System.out.println("탑클래스 객체생성 완료!");
	}

}
