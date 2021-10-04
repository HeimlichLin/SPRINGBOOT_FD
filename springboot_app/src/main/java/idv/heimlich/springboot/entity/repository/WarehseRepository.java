package idv.heimlich.springboot.entity.repository;

import idv.heimlich.springboot.entity.po.Warehse;

public interface WarehseRepository {

	Warehse findByBondId(String userid);

}
