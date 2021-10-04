package idv.heimlich.springboot.entity.menus;

import java.util.ArrayList;
import java.util.List;

public class MenusInf {

	List<Menu> menu = new ArrayList<>();

	public List<Menu> getMenu() {
		return this.menu;
	}

	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}

}
