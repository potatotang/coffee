package day13;

import java.text.*;

import javax.swing.JOptionPane;
public class Test02 {

	public Test02() {
		double[] data = {0, 10, 20, 30, 40};
		/*
			0 ~ 9
			10 ~ 19
			20 ~ 29
			30 ~ 39
			40 ~
			의 형태로 처리한다.
			
			데이터를 입력할 때 반드시 낮은 숫자부터 나열해줘야 한다.
		 */
		String[] gen = {"유년기", "10대", "20대", "30대", "장년층"};
		
		ChoiceFormat form = new ChoiceFormat(data, gen);
		
		String sage = JOptionPane.showInputDialog("나이를 입력하세요!");
		
		String msg = form.format(Integer.parseInt(sage));
		
		JOptionPane.showMessageDialog(null, "입력한 나이 : " + sage + "\n연령대 : " + msg);
	}

	public static void main(String[] args) {
		new Test02();
	}

}
