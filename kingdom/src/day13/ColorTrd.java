package day13;

import java.awt.*;
import javax.swing.*;

public class ColorTrd extends Thread {
// 이 클래스는 스레드 프로그램 클래스로 
// 3초마다 랜덤하게 칼라를 만들어서 Test05의 멤버 pan에 적용시키는 역할을 한다.
	Test05 main;
	private boolean isStart = true;
	private boolean bool = false;
	
	public ColorTrd() {}
	public ColorTrd(Test05 main) {
		this.main = main;
	}
	
	public void run() {
		while(isStart) {
			// 이 명령을 반복해야되는 상황인지를 먼저 확인해서 처리한다.
			if(bool) {
				// 이 경우는 이 스레드가 Block 상태가 되어야 한다.
//					this.suspend();
			} else {
				// 만약 필요한 순간이 되서 이 실행을 종료해야 한다면 
				// stop() 대신 isStart 변수의 데이터를 변경해서 
				// 이 함수가 자연스럽게 종료가 되도록 유도한다.
				
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				Color tmp = new Color(red, green, blue);
				main.pan.setBackground(tmp);
				
			}
			// 3초마다 변경할 것이므로
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}
	
	public boolean isStart() {
		return isStart;
	}
	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}
	public boolean isBool() {
		return bool;
	}
	public void setBool(boolean bool) {
		this.bool = bool;
	}
}
