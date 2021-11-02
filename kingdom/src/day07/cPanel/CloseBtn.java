package day07.cPanel;
/**
 * 이 클래스는 닫기 버튼 이벤트 처리용 클래스
 * @author	전은석
 * @since	2021.11.02
 * @version	v.1.0
 * @see
 * 			day07.cPanel.ColorFr
 * 			java.awt.event.ActionListener
 * 
 * 			작업이력 ]
 * 					2021.11.02	-	클래스 작성 - 담당자 : 전은석
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CloseBtn implements ActionListener {
	// ColorFr 객체의 주소를 기억할 준비를 한다.
	// ==> 변수만들어준다.
	ColorFr main;
	
	// 이 클래스가 객체가 되는 순간 ColorFr 객체의 주소를 전달 받아서 기억해놓는다.
	public CloseBtn() {}
	public CloseBtn(ColorFr main) {
		this.main = main;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0); // 현재 실행중인 프로그램 종료시키는 명령...
	}

}
