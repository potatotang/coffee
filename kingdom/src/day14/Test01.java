package day14;

import java.sql.*;
import java.util.*;
import java.util.Date;

import javax.swing.*;

/*
	10번부서 사원들의 정보를 조회해서 출력하자.
	==> Statement 로 처리
 */
public class Test01 {
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	ArrayList<EmpVO> list = new ArrayList<EmpVO>();
	
	public Test01() {
		
		// 할일
		try{
			// 1. 데이터베이스 사용할 준비하고(드라이버 로딩하고)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 접속 하나 얻어내고
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "scott";
			String pw = "tiger";
			con = DriverManager.getConnection(url, id, pw);
			// 3. 질의명령 만들고
			int dno = Integer.parseInt(JOptionPane.showInputDialog("부서번호입력 :"));
			String sql = "SELECT * FROM emp WHERE deptno = " + dno;
			// 4. 명령전달도구 준비하고
			stmt = con.createStatement();
			// 5. 실어서 보내고 결과받고
			rs = stmt.executeQuery(sql);
			// 6. 결과에서 데이터꺼내서 VO에 담고
			// ==> 몇개의 결과가 발생할지 모르므로 반복해서 처리한다.
			while(rs.next()) {
				String name = rs.getString("ename");
				String job = rs.getString("job");
				int eno = rs.getInt("empno");
				dno = rs.getInt("deptno");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				
				// VO에 사원 한명의 데이터를 채운다.
				EmpVO eVO = new EmpVO();
				// VO에 데이터 채우고
				eVO.setEno(eno);
				eVO.setName(name);
				eVO.setJob(job);
				eVO.setMgr(mgr);
				eVO.setHiredate(hiredate);
				eVO.setSdate();
				eVO.setSal(sal);
				eVO.setComm(comm);
				eVO.setDno(dno);
				
				// 7. ArrayList 채우고
				list.add(eVO);
			}
			// 8. 하나씩 꺼내서 출력하고
			
			for(EmpVO evo : list) {
				System.out.println("사원번호 : " + evo.getEno());
				System.out.println("사원이름 : " + evo.getName());
				System.out.println("사원급여 : " + evo.getSal());
				System.out.println("입 사 일 : " + evo.getSdate());
				System.out.println("부서번호 : " + evo.getDno());
				System.out.println("-----------------------------------");
			}
			
		} catch(Exception e) {
			System.out.println("### 데이터베이스 작업 실패 ###");
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
		new Test01();
	}

}
