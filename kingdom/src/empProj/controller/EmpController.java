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
		
		boolean bool = true;
		while(bool) {
			String str = JOptionPane.showInputDialog("1. 모든사원직급조회\n\nq. 프로그램 종료\\n\\n원하는 작업번호를 입력하세요!");
			
			switch(str) {
			case "1":
				reqJob();
				break;
			case "q":
				bool = false;
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
}
