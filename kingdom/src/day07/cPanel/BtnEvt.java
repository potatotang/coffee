package day07.cPanel;
import java.awt.Color;
/**
 * 이 클래스는 색상변경 버튼 이벤트 처리용 클래스
 * @author	전은석
 * @since	2021.11.02
 * @version	v.1.0
 * @see
 * 			day07.cPanel.ColorFr
 * 			java.awt.event.ActionListener
 * 			java.awt.Color
 * 
 * 			작업이력 ]
 * 					2021.11.02	-	클래스 작성 - 담당자 : 전은석
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnEvt implements ActionListener {
	// ColorFr 객체의 주소를 기억할 준비를 한다.
	// ==> 변수만들어준다.
	ColorFr main;
	
	// 이 클래스가 객체가 되는 순간 ColorFr 객체의 주소를 전달 받아서 기억해놓는다.
	public BtnEvt() {}
	public BtnEvt(ColorFr main) {
		this.main = main;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int red = (int)(Math.random()*256);
		int green = (int)(Math.random()*256);
		int blue = (int)(Math.random()*256);
		
		Color c = new Color(red, green, blue);
		
		main.pan.setBackground(c);
	}

}
