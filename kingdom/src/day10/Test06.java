package day10;
/*
	Figure 클래스 포함 하위 타입의 데이터만 입력받을 수 있도록 컬렉션을 만들어 보자.
 */

import java.util.*;
public class Test06 {

	public Test06() {
		ArrayList<? extends Figure> list = null;
		ArrayList<Semo> l1 = new ArrayList<Semo>();
		l1.add(new Semo(5, 10));
		l1.add(new Semo(2, 8));
		
		ArrayList<Nemo> l2 = new ArrayList<Nemo>();
		l2.add(new Nemo(2, 7));
		l2.add(new Nemo(3, 9));
		
		ArrayList<Won> l3 = new ArrayList<Won>();
		l3.add(new Won(10));
		l3.add(new Won(15));
		
		list = l1;
		for(int i = 0 ; i < list.size(); i++ ) {
			System.out.println(String.format("넓  이 : %7.2f", list.get(i).getArea()));
			System.out.println(String.format("밑  변 : %3d", ((Semo)list.get(i)).getWidth()));
			System.out.println("-------------------------");
		}
		System.out.println();
		
		list = l2;
		for(int i = 0 ; i < list.size(); i++ ) {
			System.out.println(String.format("넓  이 : %5f", list.get(i).getArea()));
			System.out.println(String.format("가  로 : %3d",((Nemo)list.get(i)).getGaro()));
			System.out.println("-------------------------");
		}
		System.out.println();
		
		list = l3;
		for(int i = 0 ; i < list.size(); i++ ) {
			System.out.println(String.format("반지름 : %3d",((Won)list.get(i)).getRad()));
			System.out.println(String.format("넓  이 : %7.2f",list.get(i).getArea()));
			System.out.println("-------------------------");
		}
		
//		getFig(l1); // Figure 포함 상위클래스들만 모아놓은 ArrayList 만 입력가능하다.
	}
	
	public ArrayList<? super Figure> getFig(ArrayList<? super Figure> list) {
		
		
		return list;
	}
	
	public static void main(String[] args) {
		new Test06();
	}

}
