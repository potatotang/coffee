package day07;

public class Test06 {
	
	class InnerCls {
		int no = 10;
		void abc() {
			xyz();
			System.out.println("여기는 내부클래스");
		}
	}
	
	public static void main(String[] args) {
		Test06 t1 = new Test06();
		InnerCls cls = t1.new InnerCls();
		System.out.println("cls.no : " + cls.no);
		cls.abc();
	}
	
	void xyz() {
		InnerCls c2 = new InnerCls();
	}

}
