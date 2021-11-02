package db;


import java.sql.*;

public class MyJDBC {
	
	public MyJDBC() {
		try{
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			// 여기는 드라이버 로딩에 실패한 경우...
			System.out.println("드라이버 로딩 실패");
		}
	}
	
	// Connection 반환해주는 함수
	public Connection getCon() {
		Connection con = null;
		try {
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kingdom", "cookie");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	// Statement 반환해주는 함수
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try{
			stmt = con.createStatement(ResultSet.CONCUR_READ_ONLY, ResultSet.TYPE_SCROLL_INSENSITIVE);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	
	// PreparedStatement 반환해주는 함수
	public PreparedStatement getPSTMT(Connection con, String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, ResultSet.CONCUR_READ_ONLY, ResultSet.TYPE_SCROLL_INSENSITIVE);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return pstmt;
	}
	
	// 자원 반환해주는 함수
	public void close(Object o) {
		try {
			if(o instanceof Connection) {
				((Connection) o).close();
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
