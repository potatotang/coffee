package empProj.VO;

import java.sql.Time;
import java.util.*;
import java.text.*;
public class EmpVO {
	private int eno, dno, sal, comm, mgr;
	private String name, job, mgrname, sdate;
	private Date hiredate;
	private Time hireTime;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMgrname() {
		return mgrname;
	}
	public void setMgrname(String mgrname) {
		this.mgrname = mgrname;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate() {
		SimpleDateFormat form = new SimpleDateFormat("yyyy년 MM월 dd일");
		sdate = form.format(hiredate);
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Time getHireTime() {
		return hireTime;
	}
	public void setHireTime(Time hireTime) {
		this.hireTime = hireTime;
	}
}
