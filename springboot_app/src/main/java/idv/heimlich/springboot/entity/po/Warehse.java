package idv.heimlich.springboot.entity.po;

import java.io.Serializable;
import java.util.Date;

import idv.heimlich.springboot.entity.IEntity;
import idv.heimlich.springboot.entity.IKey;

public class Warehse extends WarehseKey implements IEntity, Serializable {

	private String postcode;

	private String bondban;

	private String bondname;

	private String specialst;

	private String bondadd;

	private String bondpw;

	private String authority;

	private String rcvid;

	private String sepid;

	private String customsoffice;

	private String recvFlag;

	private String bondtype;

	private String status;

	private Date activedate;

	private Date enddate;

	private Date chargedate;

	private String tel;

	private String fax;

	private String cofficer;

	private String customFlag;

	private String autoconfirm;

	private static final long serialVersionUID = 1L;

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode == null ? null : postcode.trim();
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

	public String getBondadd() {
		return this.bondadd;
	}

	public void setBondadd(String bondadd) {
		this.bondadd = bondadd == null ? null : bondadd.trim();
	}

	public String getBondpw() {
		return this.bondpw;
	}

	public void setBondpw(String bondpw) {
		this.bondpw = bondpw == null ? null : bondpw.trim();
	}

	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority == null ? null : authority.trim();
	}

	public String getRcvid() {
		return this.rcvid;
	}

	public void setRcvid(String rcvid) {
		this.rcvid = rcvid == null ? null : rcvid.trim();
	}

	public String getSepid() {
		return this.sepid;
	}

	public void setSepid(String sepid) {
		this.sepid = sepid == null ? null : sepid.trim();
	}

	public String getCustomsoffice() {
		return this.customsoffice;
	}

	public void setCustomsoffice(String customsoffice) {
		this.customsoffice = customsoffice == null ? null : customsoffice.trim();
	}

	public String getRecvFlag() {
		return this.recvFlag;
	}

	public void setRecvFlag(String recvFlag) {
		this.recvFlag = recvFlag == null ? null : recvFlag.trim();
	}

	public String getBondtype() {
		return this.bondtype;
	}

	public void setBondtype(String bondtype) {
		this.bondtype = bondtype == null ? null : bondtype.trim();
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public Date getActivedate() {
		return this.activedate;
	}

	public void setActivedate(Date activedate) {
		this.activedate = activedate;
	}

	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public Date getChargedate() {
		return this.chargedate;
	}

	public void setChargedate(Date chargedate) {
		this.chargedate = chargedate;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax == null ? null : fax.trim();
	}

	public String getCofficer() {
		return this.cofficer;
	}

	public void setCofficer(String cofficer) {
		this.cofficer = cofficer == null ? null : cofficer.trim();
	}

	public String getCustomFlag() {
		return this.customFlag;
	}

	public void setCustomFlag(String customFlag) {
		this.customFlag = customFlag == null ? null : customFlag.trim();
	}

	public String getAutoconfirm() {
		return this.autoconfirm;
	}

	public void setAutoconfirm(String autoconfirm) {
		this.autoconfirm = autoconfirm == null ? null : autoconfirm.trim();
	}

	@Override
	public IKey getKey() {
		return this;
	}

}
