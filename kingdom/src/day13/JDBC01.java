package day13;

import java.sql.*;

public class JDBC01 {
/*
	scott 계정의 사원들의 이름과 급여를 조회해서 출력해보자.
 */
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	public JDBC01() {
		// 먼저 드라이버를 로딩해야 한다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 위작업이 에러없이 진행된 상태는 드라이버 로딩에 성공한 상태다.
			System.out.println("*** 드라이버 로딩 성공 ***");
			
			// 오라클 세션을 받아온다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "scott";
			String pw = "tiger";
			con = DriverManager.getConnection(url, id, pw);
			// 접속에 성공한 상태
			System.out.println("***** 접속 성공 *****");
			
			// 이제 질의 명령을 작성하고 전달도구에 담아서 JDBC에게 보내면 된다.
			// 질의명령
			String sql = "SELECT ename, sal FROM emp";
			// 주의사항 ] 질의명령내에 ; 이 있으면 절대로 안된다. JDBC가 붙여서 처리한다.
			
			// 질의명령 전달도구 준비
			stmt = con.createStatement();
			
			// 질의명령을 실어서 JDBC에게 전달하고 결과 받는다.
			rs = stmt.executeQuery(sql);
			// 데이터가 여러개일 것이기 때문에 반복해서 처리해준다.
			while(rs.next()) {
				String name = rs.getString("ename");
				int sal = rs.getInt("sal");
				
				System.out.println(name + " : " + sal);
			}
		} catch(Exception e) {
			// 데이터베이스 작업에 문제가 있는 경우
			System.out.println("#### 작업에 실패했습니다.");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new JDBC01();
	}

}
