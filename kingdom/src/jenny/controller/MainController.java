package jenny.controller;

import jenny.view.*;
public class MainController {
	public Board board;
	public Login login;
	public MainController() {
		board = new Board(this);
		login = new Login(this);
	}

	public static void main(String[] args) {
		new MainController();
	}

}
