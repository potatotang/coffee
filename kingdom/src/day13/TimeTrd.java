package day13;

import java.util.*;
import java.text.*;

public class TimeTrd extends Thread {
	Test05 main;
	private boolean isStart, bool;
	public TimeTrd() {
	}
	public TimeTrd(Test05 main) {
		this.main = main;
		isStart = true;
	}
	
	public void run() {
		while(isStart) {
			if(!bool) {
				// 시간 데이터 문자열로 만들고
				Calendar cal = Calendar.getInstance();
				// 날짜 표시 형식
				SimpleDateFormat form = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
				String sdate = form.format(cal.getTime());
				System.out.println(sdate);
				// Test05.lbl 의 텍스트 변경해주고
				main.lbl.setText(sdate);
			}
			try {
				// 1초간 Block 상태
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
