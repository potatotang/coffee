package day06;

public class Student {
	/*
		이 클래스는 학생 한명의 데이터를 기억할 용도의 클래스
		
		이런 클래스를 VO(Value Object) 클래스라고 부른다.
		DTO(Data Transfer Object) 클래스라고도 한다.
	 */
	private String name;
	private int stdno, java, db, web, jsp, spring, total;
	private double avg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStdno() {
		return stdno;
	}
	public void setStdno(int stdno) {
		this.stdno = stdno;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}
