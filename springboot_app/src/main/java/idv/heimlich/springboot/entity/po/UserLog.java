package idv.heimlich.springboot.entity.po;

import java.io.Serializable;
import java.util.UUID;

import idv.heimlich.springboot.entity.IEntity;
import idv.heimlich.springboot.entity.IKey;

public class UserLog implements Serializable, IEntity {
	private String bondno;

	private String bondban;

	private String bondname;

	private String specialst;

	private String bondid;

	private String authority;

	private String customsoffice;

	private String logintime;

	private static final long serialVersionUID = 1L;

	public String getBondno() {
		return this.bondno;
	}

	public void setBondno(String bondno) {
		this.bondno = bondno == null ? null : bondno.trim();
	}

	public String getBondban() {
		return this.bondban;
	}

	public void setBondban(String bondban) {
		this.bondban = bondban == null ? null : bondban.trim();
	}

	public String getBondname() {
		return this.bondname;
	}

	public void setBondname(String bondname) {
		this.bondname = bondname == null ? null : bondname.trim();
	}

	public String getSpecialst() {
		return this.specialst;
	}

	public void setSpecialst(String specialst) {
		this.specialst = specialst == null ? null : specialst.trim();
	}

	public String getBondid() {
		return this.bondid;
	}

	public void setBondid(String bondid) {
		this.bondid = bondid == null ? null : bondid.trim();
	}

	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority == null ? null : authority.trim();
	}

	public String getCustomsoffice() {
		return this.customsoffice;
	}

	public void setCustomsoffice(String customsoffice) {
		this.customsoffice = customsoffice == null ? null : customsoffice.trim();
	}

	public String getLogintime() {
		return this.logintime;
	}

	public void setLogintime(String logintime) {
		this.logintime = logintime == null ? null : logintime.trim();
	}

	@Override
	public IKey getKey() {
		return () -> UUID.randomUUID().toString();
	}
}