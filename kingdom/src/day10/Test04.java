package day10;

import java.util.*;

import javax.swing.JOptionPane;
public class Test04 {
/*
	프로그램에 관련된 정보를 컬렉션을 이용해서 출력해보자.
 */
	public Test04() {
		Properties prop = System.getProperties();
		// System.getProperties() 가 존재하는데
		// 프로그램에 관련된 정보를 Map의 형태로 만들어주는 함수
		
		// 먼저 어떤키값들로 데이터가 기억되어있는지 키값들만 추출한다.
		Enumeration en = prop.keys();
		// 순차적으로 하나씩 키값을 꺼내서 저장된 데이터를 출력한다.
		StringBuffer buff = new StringBuffer();
		while(en.hasMoreElements()) {
			// 1. 키값을 꺼낸다.
			String key = (String) en.nextElement();
			buff.append(key + " :\n");
			// 2. 키값을 가지고 데이터를 꺼낸다.
			String value = (String) prop.get(key);
			buff.append(value + "\n\n");
			// 3. 출력한다.
			// System.out.println(key + " : " + value);
		}
		System.out.println(buff.toString());
		JOptionPane.showMessageDialog(null, buff.toString());
	}

	public static void main(String[] args) {
		new Test04();
	}

}
