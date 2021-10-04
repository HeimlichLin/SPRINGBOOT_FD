package idv.heimlich.springboot.entity.menus;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private String menuid;

	private String menuname;

	private String url;
	private List<Menu> menuList = new ArrayList<>();

	public String getMenuid() {
		return this.menuid;
	}

	public void setMenuid(String menuid) {
		this.menuid = menuid;
	}

	public String getMenuname() {
		return this.menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Menu> getMenuList() {
		return this.menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

}
