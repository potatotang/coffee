package day14;

import java.sql.*;
import java.util.*;
import java.util.Date;

import javax.swing.*;

/*
	10번부서 사원들의 정보를 조회해서 출력하자.
	==> PreparedStatement 로 처리
 */
public class Test02 {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	ArrayList<EmpVO> list = new ArrayList<EmpVO>();
	
	public Test02() {
		// 할일
		try {
			// 1. 드라이버로딩하고
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 커넥션 얻어오고
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			// 3. 질의명령 준비하고
			String sql = "SELECT * FROM emp WHERE deptno = ?"; // 변경되는 데이터 부분은 ? 로 처리한다.
			// 4. 명령전달도구 준비하고
			pstmt = con.prepareStatement(sql);
			// 5. 질의명령 완성하고
			int dno = Integer.parseInt(JOptionPane.showInputDialog("부서번호 입력 : "));
			pstmt.setInt(1, dno);
			// 6. 질의명령 보내고 결과받고
			rs = pstmt.executeQuery();
			// 7. 결과에서 데이터꺼내서 VO에 담고
			// 결과가 몇개일지 모르니 반복해서 처리한다.
			while(rs.next()) {
				// VO 만들고
				EmpVO eVO = new EmpVO();
				// 데이터 채우고
				eVO.setEno(rs.getInt("empno"));
				eVO.setName(rs.getString("ename"));
				eVO.setJob(rs.getString("job"));
				eVO.setMgr(rs.getInt("mgr"));
				eVO.setSal(rs.getInt("sal"));
				eVO.setComm(rs.getInt("comm"));
				eVO.setDno(rs.getInt("deptno"));
				eVO.setHiredate(rs.getDate("hiredate"));
				eVO.setSdate();
				
				// 8. 리스트에 VO 담고
				list.add(eVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch(Exception e) {}
		}
		
		// 9. 리스트 출력하고
		for(EmpVO evo : list) {
			System.out.println("사원번호 : " + evo.getEno());
			System.out.println("사원이름 : " + evo.getName());
			System.out.println("사원급여 : " + evo.getSal());
			System.out.println("입 사 일 : " + evo.getSdate());
			System.out.println("부서번호 : " + evo.getDno());
			System.out.println("-----------------------------------");
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
