package day10;

import java.util.*;
public class Test02 {

	public Test02() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("dooly");
		names.add("jenny");
		names.add("rose");
		
		ArrayList<Integer> ages = new ArrayList<Integer>();
		ages.add(1);
		ages.add(24);
		ages.add(24);
		
		for(int i = 0 ; i < names.size(); i++ ) {
			String form = String.format("%-6s : %2d", names.get(i), ages.get(i));
			System.out.println(form);
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
