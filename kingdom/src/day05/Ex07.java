package day05;

/*
	학생의 java, db, js, jsp, spring 과목을 관리할 클래스를 제작하세요.
	총점과 평균도 원하면 볼 수 있어야 합니다.
	
	5명의 학생들의 점수를 관리할 배열을 만들고
	정보를 출력해주세요.
	
	학생번호와 석차도 입력하게 해서
	학생번호를 입력하면 배열에서 해당학생의 정보를 꺼내서 보여주는 프로그램을 작성하세요.
 */
public class Ex07 {
	int studno, java, db, js, jsp, spring, total; // 0으로 초기화
	double avg;	// 0.0 으로 초기화
	String name;	// null로 초기화
	
	public Ex07(){
	}
	
	// 생성자 오버로딩
	public Ex07(String irum) {
		// 이름을 입력하면서 객체만드는 생성자
		name = irum;
	}
	
	// 이름과 번호를 입력하면서 객체를 만드는 생성자
	public Ex07(String irum, int no) {
		this(irum);
		studno = no;
	}
	
	public Ex07(String irum, int no, int j, int d, int script, int jp, int sp) {
		name = irum;
		studno = no;
		setData(no, j, d, script, jp, sp);
	}
	
	void setData(int no, int j, int d, int script, int jp, int sp) {
		studno = no;
		java = j;
		db = d;
		js = script;
		jsp = jp;
		spring = sp;
	}
	
	void setName(String irum) {
		name = irum;
	}
	
	void setData(String irum, int no, int j, int d, int script, int jp, int sp, int t) {
		/*
			
			String irum, int no, int j, int d, int script, int jp, int sp, int t
			int j, String irum,  int no, int d, int script, int jp, int sp, int t
			String irum, int no, int j, int d, int script
		 */
		
		setName(irum);
		setData(no, j, d, script, jp, sp);
		total = t;
	}
	
	void setData(String irum, int no, int j, int d) {
		name = irum;
		studno = no;
		java = j;
		db = d;
	}
	
	public static void main(String[] args) {
		new Ex07();
		new Ex07("김종국");
		new Ex07("제니", 1);
		// ==> 생성자를 오버로딩한다는 의미는 객체로 만들수 있는 방법이 늘어난다는 의미가 된다.
	}

}
