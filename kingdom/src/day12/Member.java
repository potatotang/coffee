package day12;

import java.io.*;
public class Member implements Serializable {
	private String name, id, pw, tel, mail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	private int age;
	private double height;
	
	public Member() {}
	public Member(String name, String id, String pw, String tel, String mail, int age, double height) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.tel = tel;
		this.mail = mail;
		this.age = age;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", pw=" + pw + ", tel=" + tel + ", mail=" + mail + ", age=" + age
				+ ", height=" + height + "]";
	}
	
}
