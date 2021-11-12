package jenny.dao;

import java.util.*;
import java.sql.*;

import db.*;
import jenny.sql.*;

public class MemberDao {
	CNUJDBC db;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	MemberSQL mSQL;
//	BoardSQL bSQL;
	
	public MemberDao() {
		db = new CNUJDBC();
		mSQL = new MemberSQL();
//		bSQL = new BoardSQL();
	}
	
	// 로그인 데이터베이스 작업 전담 처리함수
	public int getLogin(String id, String pw) {
		// con
		con = db.getCon();
		// sql
		String sql = mSQL.getSQL(mSQL.SEL_LOGIN);
		System.out.println(sql);
		// pstmt
		pstmt = db.getPSTMT(con, sql);
		
		// 반환값 변수
		int cnt = 0 ;
		try {
			// 데이터채우고
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			// 보내고 결과 받고
			rs = pstmt.executeQuery();
			// 결과 꺼내고
			rs.next(); // 한줄내리고
			cnt = rs.getInt("cnt");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		return cnt;
	}

}
