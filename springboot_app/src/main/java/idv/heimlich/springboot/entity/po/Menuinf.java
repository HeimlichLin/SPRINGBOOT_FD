package idv.heimlich.springboot.entity.po;

import java.io.Serializable;

import idv.heimlich.springboot.entity.IEntity;
import idv.heimlich.springboot.entity.IKey;

public class Menuinf implements Serializable, IEntity {

	private String menuid;

	private String rootid;

	private String menuname;

	private String url;

	private String isHide;

	private String menuSort;

	private String isCommon;

	private static final long serialVersionUID = 1L;

	public String getMenuid() {
		return this.menuid;
	}

	public void setMenuid(String menuid) {
		this.menuid = menuid == null ? null : menuid.trim();
	}

	public String getRootid() {
		return this.rootid;
	}

	public void setRootid(String rootid) {
		this.rootid = rootid == null ? null : rootid.trim();
	}

	public String getMenuname() {
		return this.menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname == null ? null : menuname.trim();
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}

	public String getIsHide() {
		return this.isHide;
	}

	public void setIsHide(String isHide) {
		this.isHide = isHide == null ? null : isHide.trim();
	}

	public String getMenuSort() {
		return this.menuSort;
	}

	public void setMenuSort(String menuSort) {
		this.menuSort = menuSort == null ? null : menuSort.trim();
	}

	public String getIsCommon() {
		return this.isCommon;
	}

	public void setIsCommon(String isCommon) {
		this.isCommon = isCommon == null ? null : isCommon.trim();
	}

	@Override
	public IKey getKey() {
		return () -> this.menuid;
	}

}
