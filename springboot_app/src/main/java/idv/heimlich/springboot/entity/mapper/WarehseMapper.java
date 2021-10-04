package idv.heimlich.springboot.entity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import idv.heimlich.springboot.entity.po.Warehse;
import idv.heimlich.springboot.entity.po.WarehseExample;
import idv.heimlich.springboot.entity.po.WarehseKey;

public interface WarehseMapper {

	long countByExample(WarehseExample example);

	int deleteByExample(WarehseExample example);

	int deleteByPrimaryKey(WarehseKey key);

	int insert(Warehse record);

	int insertSelective(Warehse record);

	List<Warehse> selectByExample(WarehseExample example);

	Warehse selectByPrimaryKey(WarehseKey key);

	int updateByExampleSelective(@Param("record") Warehse record, @Param("example") WarehseExample example);

	int updateByExample(@Param("record") Warehse record, @Param("example") WarehseExample example);

	int updateByPrimaryKeySelective(Warehse record);

	int updateByPrimaryKey(Warehse record);

}
