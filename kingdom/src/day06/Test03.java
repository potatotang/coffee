package day06;

public class Test03 {

	public static void main(String[] args) {
		Shap[] shap = new Shap[10];
		// 랜덤하게 0 과 1을 발생시켜서 1이면 사각형, 0 이면 원의 정보를 기억시켜보자.
		
		for(int i = 0 ; i < 10 ; i++ ) {
			int no = (int)(Math.random() * 2);
			
			if(no == 0) {
				shap[i] = new Won((int)(Math.random() * 21) + 5);
			} else {
				shap[i] = new Sagak((int)(Math.random() * 21) + 5, (int)(Math.random() * 21) + 5);
			}
		}
		
		for(Shap s : shap) {
			System.out.print("면적 : " + s.getArea() + " - ");
			s.toPrint();
		}
		
	}

}
