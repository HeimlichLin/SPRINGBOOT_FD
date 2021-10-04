package idv.heimlich.springboot.adapter.repository.mybatis;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.context.annotation.Primary;

import idv.heimlich.springboot.entity.mapper.WarehseMapper;
import idv.heimlich.springboot.entity.po.Warehse;
import idv.heimlich.springboot.entity.po.WarehseExample;
import idv.heimlich.springboot.entity.po.WarehseExample.Criteria;
import idv.heimlich.springboot.entity.repository.WarehseRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Primary
@Slf4j
public class WarehseRepositoryImpl implements WarehseRepository {

	private final WarehseMapper warehseMapper;

	@Override
	public Warehse findByBondId(String userid) {
		final WarehseExample example = new WarehseExample();
		final Criteria createCriteria = example.createCriteria();
		createCriteria.andBondidEqualTo(userid);
		final List<Warehse> selectByExample = this.warehseMapper.selectByExample(example);
		log.info("Warehse Select By Example size:" + selectByExample.size());
		return CollectionUtils.isEmpty(selectByExample) ? null : selectByExample.get(0);
	}

}
