package idv.heimlich.springboot.entity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import idv.heimlich.springboot.entity.po.Menuinf;
import idv.heimlich.springboot.entity.po.MenuinfExample;

public interface MenuinfMapper {

	long countByExample(MenuinfExample example);

	int deleteByExample(MenuinfExample example);

	int deleteByPrimaryKey(String menuid);

	int insert(Menuinf record);

	int insertSelective(Menuinf record);

	List<Menuinf> selectByExample(MenuinfExample example);

	Menuinf selectByPrimaryKey(String menuid);

	int updateByExampleSelective(@Param("record") Menuinf record, @Param("example") MenuinfExample example);

	int updateByExample(@Param("record") Menuinf record, @Param("example") MenuinfExample example);

	int updateByPrimaryKeySelective(Menuinf record);

	int updateByPrimaryKey(Menuinf record);

	@Select("select distinct * from menuinf f where f.menuid in (select menuid from authmenu where authid=#{authid}) or f.is_common='Y' and is_hide='N'   order by menu_sort")
	List<Menuinf> selectByAuthid(String authid);

	@Select("select distinct * from menuinf f where is_hide='N'   order by menu_sort")
	List<Menuinf> selectByRoot();

}
