package idv.heimlich.springboot.entity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import idv.heimlich.springboot.entity.po.Funcinf;
import idv.heimlich.springboot.entity.po.FuncinfExample;

public interface FuncinfMapper {

	long countByExample(FuncinfExample example);

	int deleteByExample(FuncinfExample example);

	int deleteByPrimaryKey(String funcid);

	int insert(Funcinf record);

	int insertSelective(Funcinf record);

	@Select("select * from funcinf where funcid in (select funcid from authfunc where authid=#{authid}) order by funcid")
	List<Funcinf> selectByAuthid(String authid);

	List<Funcinf> selectByExample(FuncinfExample example);

	Funcinf selectByPrimaryKey(String funcid);

	int updateByExampleSelective(@Param("record") Funcinf record, @Param("example") FuncinfExample example);

	int updateByExample(@Param("record") Funcinf record, @Param("example") FuncinfExample example);

	int updateByPrimaryKeySelective(Funcinf record);

	int updateByPrimaryKey(Funcinf record);

}
