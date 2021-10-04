package idv.heimlich.springboot.entity.po;

import java.io.Serializable;

import idv.heimlich.springboot.entity.IEntity;
import idv.heimlich.springboot.entity.IKey;

public class Userinf implements Serializable, IEntity {
	private String userid;

	private String userpw;

	private String authid;

	private String username;

	private String useroffice;

	private String status;

	private String activedate;

	private String enddate;

	private String department;

	private String tel;

	private String lastlogin;

	private static final long serialVersionUID = 1L;

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid == null ? null : userid.trim();
	}

	public String getUserpw() {
		return this.userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw == null ? null : userpw.trim();
	}

	public String getAuthid() {
		return this.authid;
	}

	public void setAuthid(String authid) {
		this.authid = authid == null ? null : authid.trim();
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getUseroffice() {
		return this.useroffice;
	}

	public void setUseroffice(String useroffice) {
		this.useroffice = useroffice == null ? null : useroffice.trim();
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public String getActivedate() {
		return this.activedate;
	}

	public void setActivedate(String activedate) {
		this.activedate = activedate == null ? null : activedate.trim();
	}

	public String getEnddate() {
		return this.enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate == null ? null : enddate.trim();
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department == null ? null : department.trim();
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}

	public String getLastlogin() {
		return this.lastlogin;
	}

	public void setLastlogin(String lastlogin) {
		this.lastlogin = lastlogin == null ? null : lastlogin.trim();
	}

	@Override
	public IKey getKey() {
		return () -> userid;
	}
}