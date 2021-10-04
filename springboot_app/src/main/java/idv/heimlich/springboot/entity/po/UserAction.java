package idv.heimlich.springboot.entity.po;

import java.io.Serializable;

public class UserAction implements Serializable {
	private String userId;

	private String bondNo;

	private String startdate;

	private String enddate;

	private String starttime;

	private String endtime;

	private String ip;

	private String url;

	private String attribute;

	private String declno;

	private String refbillno;

	private String message;

	private static final long serialVersionUID = 1L;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	public String getBondNo() {
		return this.bondNo;
	}

	public void setBondNo(String bondNo) {
		this.bondNo = bondNo == null ? null : bondNo.trim();
	}

	public String getStartdate() {
		return this.startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate == null ? null : startdate.trim();
	}

	public String getEnddate() {
		return this.enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate == null ? null : enddate.trim();
	}

	public String getStarttime() {
		return this.starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime == null ? null : starttime.trim();
	}

	public String getEndtime() {
		return this.endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime == null ? null : endtime.trim();
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip == null ? null : ip.trim();
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}

	public String getAttribute() {
		return this.attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute == null ? null : attribute.trim();
	}

	public String getDeclno() {
		return this.declno;
	}

	public void setDeclno(String declno) {
		this.declno = declno == null ? null : declno.trim();
	}

	public String getRefbillno() {
		return this.refbillno;
	}

	public void setRefbillno(String refbillno) {
		this.refbillno = refbillno == null ? null : refbillno.trim();
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message == null ? null : message.trim();
	}

}
