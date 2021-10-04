package idv.heimlich.springboot.entity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import idv.heimlich.springboot.entity.po.UserLog;
import idv.heimlich.springboot.entity.po.UserLogExample;

public interface UserLogMapper {

	long countByExample(UserLogExample example);

	int deleteByExample(UserLogExample example);

	int insert(UserLog record);

	int insertSelective(UserLog record);

	List<UserLog> selectByExample(UserLogExample example);

	int updateByExampleSelective(@Param("record") UserLog record, @Param("example") UserLogExample example);

	int updateByExample(@Param("record") UserLog record, @Param("example") UserLogExample example);

}
