package day03;

import javax.swing.JOptionPane;

public class Ex03 {
	/*
		게시판에 게시물을 게시할려고 한다.
		게시판 한페이지에는 15개의 게시물을 보여줄 수 있다.
		게시물의 갯수를 랜덤하게 발생시켜서 
		페이지가 몇개가 필요한지 출력해주는 프로그램을 작성하세요.
	 */
	
	public static void main(String[] args) {
		// 게시물이 0개인 경우에도 적어도 1개의 페이지는 필요하다.
		// 게시물이 15로 나누어 떨어지는 경우는 나눈 몫만큼의 페이지만 필요하다.
		// 게시물이 15로 나누어 떨어지지 않는 경우는 나눈 몫에 한페이지가 더 필요하다.
		
		String sqt = JOptionPane.showInputDialog("게시글 수를 입력하세요!");
		int qt = Integer.parseInt(sqt);
		int row = 15;
		int page = 1; // 게시물이 0개인 경우도 1페이지는 필요하므로 1로 초기화
		
		if(qt != 0) { // 이 부분은 게시글 수가 0개가 아닌 경우만 실행
			if(qt % 15 == 0) {
				page = qt / row;
			} else {
				page = qt / row + 1;
			}
		}
		
		JOptionPane.showMessageDialog(null, "게시글 수 : " + qt + "\n페이지수 : " + page);
		
	}
}
