package day05;

public class Test01 {
/*
	정수를 하나를 입력하면 정수를 문자열로 변환시켜서 반환해주는 함수를 만들어서 실행하세요.
	
	함수이름은 add를 사용하세요.
 */
	/*
		참고 ]
			함수를 제작하는 위치는 클래스블럭 하위이기만 하면 된다.
			
			함수는 반드시 클래스 블럭 바로 하위에 위치해야만 한다.
			함수내부에 함수를 만들 수 없다.
	 */
	public Test01() { // 생성자
		add(123); // 정상적으로 처리되고 단시 만들어진(반환해주는) 데이터를 사용하지 않을 뿐이다.
		
		String str = add(123);
		
		System.out.println(add(123));
	}
	
	String add(int no) {
		/*
		String str = no + "";
		return str;
		 */
		return no + "";
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
