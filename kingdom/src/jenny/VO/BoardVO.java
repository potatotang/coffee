package jenny.VO;

import java.sql.*;
import java.text.*;
public class BoardVO {
	private int bno, upno, mno, cnt, step;
	private String id, name, pw, title, body, bgroup, sdate;
	private Date wdate;
	private Time wtime;
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", upno=" + upno + ", mno=" + mno + ", cnt=" + cnt + ", step=" + step + ", id="
				+ id + ", name=" + name + ", pw=" + pw + ", title=" + title + ", body=" + body + ", bgroup=" + bgroup
				+ ", sdate=" + sdate + ", wdate=" + wdate + ", wtime=" + wtime + "]";
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getUpno() {
		return upno;
	}
	public void setUpno(int upno) {
		this.upno = upno;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		this.step = step;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getBgroup() {
		return bgroup;
	}
	public void setBgroup(String bgroup) {
		this.bgroup = bgroup;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate() {
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
		sdate = form1.format(wdate) + " " + form2.format(wtime);
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public Date getWdate() {
		return wdate;
	}
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}
	public Time getWtime() {
		return wtime;
	}
	public void setWtime(Time wtime) {
		this.wtime = wtime;
	}
}
