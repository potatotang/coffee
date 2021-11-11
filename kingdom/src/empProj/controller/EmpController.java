package empProj.controller;

import java.util.*;

import javax.swing.JOptionPane;

import empProj.dao.*;
import empProj.VO.*;

/**
 * 이 클래스는 사원정보테이블 작업을 컨트롤할 용도의 클래스
 * @author	전은석
 * @since	2021.11.11
 * @version	v.1.0
 * @see
 * 			empProj.dao.EmpDao
 * 			empProj.VO.EmpVO
 * 
 * 			작업이력 - 	담당자 : 전은석
 * 						2021.11.11 - 	클래스제작
 * 										직급조회 처리
 *
 */
public class EmpController {
	EmpDao eDao;
	
	public EmpController() {
		// 이 클래스는 사원정보에 관련된 작업을 컨트롤 할 예정이므로
		// 반드시 사원정보테이블 관련 데이터베이스 작업을 해야 하므로
		// 그 작업을 전담하는 클래스를 준비해둔다.
		eDao = new EmpDao();
		// 안내메세지...
		StringBuffer buff = new StringBuffer();
		buff.append("1. 모든사원직급조회\n\n");
		buff.append("11. 사원의 급여 수정\n\n");
		buff.append("q. 프로그램 종료\n\n");
		buff.append("원하는 작업번호를 입력하세요!");
		
		boolean bool = true; // 반복문 제어변수
		while(bool) {
			String str = JOptionPane.showInputDialog(buff.toString());
			
			switch(str) {
			case "1":
				reqJob();
				break;
			case "11":
				upSal();
				break;
			case "q":
				bool = false;
				System.out.println("### 프로그램을 종료합니다. ###");
				break;
			default:
				JOptionPane.showMessageDialog(null, "입력코드가 잘못되었습니다.");
			}
		}
	}

	public static void main(String[] args) {
		new EmpController();
	}
	
	// 직급요청 처리함수
	public void reqJob() {
		// 할일
		// 함수 호출해서 리스트 받고
		ArrayList<EmpVO> list = eDao.getJob();
		// 하나씩 데이터 꺼내서 출력하고
		System.out.println("---------------------------");
		for(EmpVO evo : list) {
			// 출력
			System.out.println("사원번호 : " + evo.getEno());
			System.out.println("사원이름 : " + evo.getName());
			System.out.println("사원직급 : " + evo.getJob());
			System.out.println("---------------------------");
		}
	}
	
	// 사원의 급여 수정 요청 처리함수
	public void upSal() {
		// 할일
		// 데이터 만들고
		String name = JOptionPane.showInputDialog("수정할 사원의 이름을 입력하세요!");
		int sal = 0;
		String ssal = JOptionPane.showInputDialog("수정될 급여를 입력하세요!");
		try {
			sal = Integer.parseInt(ssal);
		} catch(Exception e) {
			e.printStackTrace();
			// 만약 정수로 변환을 시도하다가 예외가 발생하는 경우는 
			// 이 함수의 실행에 문제가 있는 경우이므로
			// 이 함수 실행을 종료시킨다.
			return;
		}
		// 데이터 입력해서 데이터베이스 작업 처리하고 결과받고
		EmpVO eVO = eDao.editSal(name, sal);
		
		// 수정작업 성공여부에 따라 처리
		if(eVO.getCnt() == 0) {
			// 이 경우는 수정에 실패한 경우
			JOptionPane.showMessageDialog(null, 
					name + " ] 사원의 급여 수정에 실패했습니다.");
		} else {
			// 수정에 성공한 경우
			System.out.println(name + " ] 사원의 급여를 " + eVO.getSal() + " 로 수정했습니다.");
			System.out.println("---------------------------");
			System.out.println("사원번호 : " + eVO.getEno());
			System.out.println("사원이름 : " + eVO.getName());
			System.out.println("사원급여 : " + eVO.getSal());
			System.out.println("---------------------------");
		}
	}
}
