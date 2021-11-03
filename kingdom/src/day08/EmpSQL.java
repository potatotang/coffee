package day08;

/**
 * 이 클래스는 사원정보테이블 데이터베이스작업에 필요한 질의명령을 관리하는 클래스
 * @author	전은석
 * @since	2021.11.03
 * @version	v.1.0
 * @see		
 * 			작업이력 ]
 * 				2021.11.03 - 클래스 작성 - 담당자 : 전은석
 *
 */
public class EmpSQL {
	public final int SEL_NAME_ALL = 1001; // 모든 사원의 이름 조회 코드
	public final int SEL_INFO_ENO = 1002;
	
	
	// 질의명령 반환해주는 함수
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case 1001:
			buff.append("SELECT ");
			buff.append("	ename ");
			buff.append("FROM ");
			buff.append("	emp ");
			break;
		case 1002:
			buff.append("SELECT ");
			buff.append("	empno eno, ename name, job, mgr, hiredate, sal, comm, deptno dno ");
			buff.append("FROM ");
			buff.append("	emp ");
			buff.append("WHERE ");
			buff.append("	empno = ? ");
			break;
		}
		
		return buff.toString();
	}
	
}
