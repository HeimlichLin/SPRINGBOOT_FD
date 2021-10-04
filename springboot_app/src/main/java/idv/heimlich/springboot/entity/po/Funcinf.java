package idv.heimlich.springboot.entity.po;

import java.io.Serializable;

public class Funcinf implements Serializable {

	private String funcid;

	private String funcname;

	private String codename;

	private static final long serialVersionUID = 1L;

	public String getFuncid() {
		return this.funcid;
	}

	public void setFuncid(String funcid) {
		this.funcid = funcid == null ? null : funcid.trim();
	}

	public String getFuncname() {
		return this.funcname;
	}

	public void setFuncname(String funcname) {
		this.funcname = funcname == null ? null : funcname.trim();
	}

	public String getCodename() {
		return this.codename;
	}

	public void setCodename(String codename) {
		this.codename = codename == null ? null : codename.trim();
	}

}
