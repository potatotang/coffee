package day08;

public class Test03 {
	
	public Test03() {
		// 사원들이름 조회 질의명령
		EmpSQL eSQL = new EmpSQL();
		String sql = eSQL.getSQL(eSQL.SEL_NAME_ALL);
		System.out.println(sql);
		
		// 사원번호로 사원정보조회 질의명령
		sql = eSQL.getSQL(eSQL.SEL_INFO_ENO);
		System.out.println(sql);
		
	}
	
	public static void main(String[] args) {
		new Test03();
	}

}
