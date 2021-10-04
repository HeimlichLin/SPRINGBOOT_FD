package idv.heimlich.springboot.entity.po;

import java.io.Serializable;

import idv.heimlich.springboot.entity.IKey;
import lombok.Data;

@Data
public class WarehseKey implements Serializable, IKey {
	private String bondid;

	private String bondno;

	private static final long serialVersionUID = 1L;

	public String getBondid() {
		return this.bondid;
	}

	public void setBondid(String bondid) {
		this.bondid = bondid == null ? null : bondid.trim();
	}

	public String getBondno() {
		return this.bondno;
	}

	public void setBondno(String bondno) {
		this.bondno = bondno == null ? null : bondno.trim();
	}

	@Override
	public String toKey() {
		return this.toString();
	}

}
