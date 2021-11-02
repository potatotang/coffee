package day07;

import day06.*;
public class Test02 {

	public static void main(String[] args) {
		Sagak s1 = new Sagak(10, 5);
		Won w1 = new Won(7);
		
		String msg = (s1 instanceof Shap) ? "Shap 타입입니다." : "Shap 타입이 아닙니다.";
		String msg1 = (w1 instanceof Shap) ? "Shap 타입입니다." : "Shap 타입이 아닙니다.";
//		String msg2 = (w1 instanceof Sagak) ? "Shap 타입입니다." : "Shap 타입이 아닙니다.";
		
		System.out.println("s1 은 " + msg);
		System.out.println("w1 은 " + msg1);
		
	}

}
