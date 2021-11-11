package db;

/**
 *  이 클래스는 오라클 데이터베이스 작업에 필요한 기본작업을 해주는 클래스
 * @author	전은석
 * @since	2021.11.11
 * @version	v.1.0
 * 		
 * 			작업이력 ]
 * 				2021/11/11 - 클래스제작 - 담당자 : 전은석
 *
 */
import java.sql.*;
public class CNUJDBC {
	private String url, id, pw;
	public CNUJDBC() {
		this("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
	}
	
	public CNUJDBC(String url, String id, String pw) {
		/* 
			이 클래스가 new 되는 순간은
			오라클을 이용한 데이터베이스 작업을 해야되는 상황일 것이다.
			따라서 이 클래스가 객체가 되는 순간
			필요한 드라이버를 로딩해놓고 사용할 준비를 시켜놓자.
		 */
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			System.out.println("### 드라이버 로딩 실패 ###");
			e.printStackTrace();
		}
		this.url = url;
		this.id = id;
		this.pw = pw;
	}
	
	// Connection을 만들어서 반환해주는 함수
	public Connection getCon() {
		// scott 계정에 접속해서 반환해주는 함수
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	// Statement 만들어서 반환해주는 함수
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
												ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	// PreparedStatement 만들어서 반환해주는 함수
	public PreparedStatement getPSTMT(Connection con, String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	
	// 사용이 끝난 자원 반환해주는 함수
	public void close(Object o) {
		// 이 함수가 실행될때 
		// Connection을 입력할지, Statement를 입력해서 실행할지,
		// PreparedStatement를 입력해서 실행할지
		// ResultSet을 닫아줘야하는 작업일지는 모르는 상황이다.
		// 따라서 입력된 데이터의 타입을 확인하고
		// 그 타입에 따라서 처리해주면 된다.
		
		try{
			if(o instanceof Connection) {
				((Connection) o).close();
				// (Connection) o.close(); 
				//	==> o의 close() 를 호출한 결과를 Connection으로 강제형변환
			} else if(o instanceof Statement) {
				((Statement) o).close();
			} else if(o instanceof PreparedStatement) {
				((PreparedStatement) o).close();
			} else if(o instanceof ResultSet) {
				((ResultSet) o).close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}












