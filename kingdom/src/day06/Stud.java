package day06;

public class Stud {
	/*
		학생의 java, db, js, jsp, spring 과목을 관리할 클래스(Stud)를 제작하세요.
		총점과 평균도 원하면 볼 수 있어야 합니다.
	 */
	public static String ex;
	private int studno, java, db, js, jsp, spring, total;
	private double avg;
	private String name;
	private int sukcha = 1;
	
	
	public Stud() {}
	
	// 생성자 오버로딩
	public Stud(String name) {
		/*
			this :
				현재 실행중인 객체 자기자신을 가리키는 예약어
		 */
		this.name = name;
	}
	
	public Stud(String name, int studno) {
		this.name = name;
		this.studno = studno;
	}
	
	public Stud(String name, int studno, int java, int db, int js, int jsp, int spring) {
		this(name, studno); // this() 는 생성자 함수의 첫줄 첫문장이어야 한다.
		this.java = java;
		this.db = db;
		this.js = js;
		this.jsp = jsp;
		this.spring = spring;
		setTotal();
		setAvg();
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public void setTotal() {
		total = java + db + js + jsp + spring;
	}
	
	public void setAvg() {
		avg = total / 5.0;
	}
	
	public int getSukcha() {
		return this.sukcha;
	}
	
	public void setSukcha(int s) {
		this.sukcha = s;
	}
	
	// 출력하는 기능의 함수
	public void toPrint() {
		System.out.printf("[ %2d ] %8s - %3d, %3d, %3d, %3d, %3d, %3d, %4.2f\n", studno, name, java, db, js, jsp, spring, total, avg);
	}
}
