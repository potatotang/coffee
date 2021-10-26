package day02;

/*
 	Ex02 ]
 		54232원을 지불 하려고 한다.
 		우리나라 화폐단위별로 몇개씩 필요한지 계산해서 출력하세요.
 		 
 		 화폐단위 ]
 		 	
 		 	50000
 		 	10000
 		 	5000
 		 	1000
 		 	500
 		 	100
 		 	50
 		 	10
 		 	1
 */
public class Ex02 {
	public static void main(String[] args) {
		int total = 54232;
		int oman = total / 50000;
		int tmp = total % 50000;
		int man = tmp / 10000;
		tmp %= 10000;
		int ochun = tmp / 5000;
		tmp %= 5000;
		int chun = tmp / 1000;
		tmp %= 1000;
		int obaek = tmp / 500;
		tmp %= 500;
		int baek = tmp / 100;
		tmp %= 100;
		int osip = tmp / 50;
		tmp %= 50;
		int sip = tmp / 10;
		int il = tmp % 10;
		
		System.out.printf("지불할 금액 %6d 에 필요한 지폐는\n", total);
		System.out.printf("\t%-10s %2d 장\n","오만원권", oman);
		System.out.printf("\t%-11s %2d 장\n","만원권", man);
		System.out.printf("\t%-10s %2d 장\n","오천원권", ochun);
		System.out.printf("\t%-11s %2d 장\n","천원권", chun);
		System.out.printf("\t%-10s %2d 장\n","오백원권", obaek);
		System.out.printf("\t%-11s %2d 장\n","백원권", baek);
		System.out.printf("\t%-10s %2d 장\n","오십원권", osip);
		System.out.printf("\t%-11s %2d 장\n","십원권", sip);
		System.out.printf("\t%-11s %2d 장","일원권", il);
		
	}
}
