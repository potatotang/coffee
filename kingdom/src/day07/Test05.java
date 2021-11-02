package day07;

public class Test05 {
	
	public static class TopClass {
		public static void toPrint() {
			System.out.println("여기는 탑레벨 내부클래스");
		}
	}
	
	public static void main(String[] args) {
		Test05.TopClass.toPrint();
	}
	
	void abc() {
	}

}
