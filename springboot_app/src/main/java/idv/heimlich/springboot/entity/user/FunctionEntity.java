package idv.heimlich.springboot.entity.user;

public class FunctionEntity {

	private String funcid;
	private String codename;
	private String funcname;

	public void setCodename(String codename) {
		this.codename = codename;

	}

	public void setFuncid(String funcid) {
		this.funcid = funcid;

	}

	public void setFuncname(String funcname) {
		this.funcname = funcname;
	}

	public String getFuncid() {
		return this.funcid;
	}

	public String getCodename() {
		return this.codename;
	}

	public String getFuncname() {
		return this.funcname;
	}

}
