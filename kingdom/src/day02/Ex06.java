package day02;

import javax.swing.JOptionPane;

public class Ex06 {
	/*
		실수를 입력한후
		소수이하 세째자리에서 반올림한 결과를 출력하는 프로그램을 작성하세요.
		
		힌트 ]
			
			3.1415 를 세째자리에서 반올림하려면
			
			3.1415 + 0.005 를 해주고
			소수 세째자리 이하는 버리면 된다.
		
	 */
	
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("소수이하 세자리이상되는 실수를 입력하세요!");
		double dNo = Double.parseDouble(str);
		
		/*
		double tmp = dNo + 0.005;
		tmp *= 100;
		int no = (int) tmp;
		
		double result = no / 100.;
		*/
		
		int tmp = (int)(dNo * 1000) + 5;
		tmp /= 10;
		
		double result = tmp / 100.0;
		
		
		JOptionPane.showMessageDialog(null, "입력한 숫자 : " + dNo + "\n반올림한 숫자 : " + result);
	}
}
