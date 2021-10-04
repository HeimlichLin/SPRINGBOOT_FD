package idv.heimlich.springboot.entity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import idv.heimlich.springboot.entity.po.Userinf;
import idv.heimlich.springboot.entity.po.UserinfExample;

public interface UserinfMapper {

	long countByExample(UserinfExample example);

	int deleteByExample(UserinfExample example);

	int deleteByPrimaryKey(String userid);

	int insert(Userinf record);

	int insertSelective(Userinf record);

	List<Userinf> selectByExample(UserinfExample example);

	Userinf selectByPrimaryKey(String userid);

	int updateByExampleSelective(@Param("record") Userinf record, @Param("example") UserinfExample example);

	int updateByExample(@Param("record") Userinf record, @Param("example") UserinfExample example);

	int updateByPrimaryKeySelective(Userinf record);

	int updateByPrimaryKey(Userinf record);

}
