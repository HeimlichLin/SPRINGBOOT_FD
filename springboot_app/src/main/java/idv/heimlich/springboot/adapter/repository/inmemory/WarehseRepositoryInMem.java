package idv.heimlich.springboot.adapter.repository.inmemory;

import java.text.SimpleDateFormat;
import java.util.Date;

import idv.heimlich.springboot.entity.po.Warehse;
import idv.heimlich.springboot.entity.repository.WarehseRepository;

public class WarehseRepositoryInMem implements WarehseRepository {

	CommonRepositoryInMem<Warehse> repository = new CommonRepositoryInMem<>();
	public static final String AG140 = "AG140";
	protected static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy/MM/dd");

	public WarehseRepositoryInMem() {

		final Warehse warehse = new Warehse();
		warehse.setPostcode("003");
		warehse.setBondno(AG140);
		warehse.setBondban("36510597");
		warehse.setBondname("中航物流股份有限公司");
		warehse.setSpecialst("唐小姐");
		warehse.setBondadd(null);
		warehse.setBondid("psw0043");
		warehse.setBondpw("e1803");
		warehse.setAuthority("W");
		warehse.setRcvid("TVCBTVTWTPE00041");
		warehse.setSepid("TVCBSWTWTYN00043-BDW");
		warehse.setCustomsoffice("AA");
		warehse.setRecvFlag("V");
		warehse.setBondtype("1");
		warehse.setStatus("2");
		warehse.setActivedate(new Date());
		warehse.setEnddate(new Date());
		warehse.setChargedate(new Date());
		warehse.setTel("03-4824926#652");
		warehse.setFax(null);
		warehse.setCofficer(null);
		warehse.setCustomFlag(null);
		warehse.setAutoconfirm(null);
		this.repository.saveOrUpdate(warehse);
	}

	@Override
	public Warehse findByBondId(String userid) {
		return this.repository.findById(() -> userid);
	}

}
