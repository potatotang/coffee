package day14;

/*
	오라클에 접속해서 
	현재시간을 출력해보자.
 */
import java.sql.*;
import java.util.Date;
import java.text.*;

import db.*;
public class Test04 {
	/*
		이클래스는 오라클에 접속해서 데이터베이스 작업을 해야되는 클래스이다.
	 */
	CNUJDBC db;
	Connection con;
	Statement stmt;
	ResultSet rs; // select 질의명령(조회 질의명령)에서만 ResultSet이 만들어진다.
	
	public Test04() {
		db = new CNUJDBC();
		// 위의 명령으로 드라이버 로딩이 끝난상태이고 
		// 필요한 자원들을 가져다 쓸수 있게 됬다.
		
		// Connection
		con = db.getCon();
		// 질의명령
		String sql = "SELECT sysdate FROM dual";
		// Statement 꺼내오고
		stmt = db.getSTMT(con);
		// 질의명령을 보내고 결과받고
		try{
			rs = stmt.executeQuery(sql);
			// 데이터꺼내고
			// 가상레코드포인터를 한줄 내리고
			rs.next();
			// 데이터 꺼내고
			Date d = rs.getDate("sysdate");
			// 데이터를 보기 편하게 가공하고
			SimpleDateFormat form = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String sdate = form.format(d);
			
			// 출력하고
			System.out.println("현재 시간 : " + sdate);
			
			/*
				JDBC에서 날짜를 꺼내는 getDate() 함수는 날짜만 꺼내주는 함수이다.
				시간은 꺼내주지 않는다.
				시간도 필요하면 getTime()를 호출해서 별도로 꺼내와야 한다.
			 */
			// 시간 데이터꺼내고
			form = new SimpleDateFormat("yyyy/MM/dd");
			sdate = form.format(d);
			Time t = rs.getTime("sysdate");
			SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
			String stime = form2.format(t);
			System.out.println("----------------------------------");
			System.out.println("현재 시간 : " + sdate + " " + stime);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
