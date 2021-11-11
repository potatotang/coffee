package empProj.dao;

/**
 * 이 클래스는 사원 정보 테이블의 데이터베이스 작업을 전담해서 처리할 클래스
 * @author	전은석
 * @since	2021.11.11
 * @version	v.1.0
 * @see
 * 			java.sql.*
 * 			db.CNUJDBC
 * 			empProj.sql.EmpSQL
 * 			empProj.VO.EmpVO
 * 
 * 			작업이력 ]
 * 				2021.11.11	- 	담당자 : 전은석
 * 								클래스제작
 * 								직급조회 작업 처리 코드 추가
 * 	
 */
import java.sql.*;
import java.util.*;

import db.*;
import empProj.VO.*;
import empProj.sql.*;

public class EmpDao {
	CNUJDBC db;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	EmpSQL eSQL;
	
	public EmpDao() {
		// 이 클래스는 객체되는 순간 데이터베이스 작업을 할 준비가 되어있어야된다.
		// 우리는 이 기능을 CNUJDBC클래스에 이미 구현해놓았다.
		// 따라서 그 클래스를 new 시켜서 사용하기만 하면 된다.
		db = new CNUJDBC(); // 드라이버 로딩이 끝난상태...
		
		// 이 클래스에서는 emp 테이블에 관련된 질의명령을 사용해야된다.
		// 우리는 이 질의명령을 모아놓은 클래스를 따로 제작해놓았다.
		// 그 클래스를 사용할 준비해준다.
		eSQL = new EmpSQL();
	}
	
	// 모든 사원의 직급조회 데이터베이스 작업 전담 처리함수
	public ArrayList<EmpVO> getJob() {
		// 할일
		// 1. 커넥션 꺼내오고
		con = db.getCon();
		// 2. 반환값 변수 만들어주고
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		// 3. 질의명령 가져오고
		String sql = eSQL.getSQL(eSQL.SEL_ALL_JOB);
		// 4. 명령전달도구 준비하고
		stmt = db.getSTMT(con);
		try {
			// 5. 질의명령 보내고 결과받고
			rs = stmt.executeQuery(sql);
			// 6. 데이터꺼내서 VO담고
			while(rs.next()) {
				// 한명씩 VO 만들고
				EmpVO eVO = new EmpVO();
				eVO.setEno(rs.getInt("empno"));
				eVO.setName(rs.getString("ename"));
				eVO.setJob(rs.getString("job"));
				// 7. 리스트에 VO 담고
				list.add(eVO);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		// 8. 리스트 반환하고
		return list;
	}

}
