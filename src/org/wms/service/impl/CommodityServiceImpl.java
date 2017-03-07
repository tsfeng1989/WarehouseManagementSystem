package org.wms.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.wms.dao.CommodityDao;
import org.wms.entity.Commodity;
import org.wms.service.CommodityService;
/**
 * 
 * @author Forever
 *
 */
@Service("commodityService")
public class CommodityServiceImpl implements CommodityService {
	@Resource(name="CommodityDao")
	private CommodityDao CommodityDao;
	
	//�����Ʒ
	@Override
	public boolean addCommodity(Commodity c) {
		return CommodityDao.addCommodity(c);
	}
	
	//ɾ����Ʒ
	@Override
	public boolean delCommodity(Commodity c) {
		return CommodityDao.delCommodity(c);
	}
	
	//����ID��ѯ��Ʒ1
	@Override
	public Commodity findByIdCommodity(String id) {
		String sql = "from Commodity where c_id='"+id+"'";
		return CommodityDao.findByIdCommodity(sql);
	}
	
	//����ID��ѯ��Ʒ2
	@Override
	public Commodity findByIdCommoditytwo(Commodity c) {
		return CommodityDao.findByIdCommoditytwo(c);
	}
	
	//�޸���Ʒ
	@Override
	public boolean updateCommodity(Commodity c) {
		return CommodityDao.updateCommodity(c);
	}

	//��ѯȫ����Ʒ
	@Override
	public List findAllCommodity() {
		return CommodityDao.findAllCommodity("from Commodity");
	}
	
	
	public void setCommodityDao(CommodityDao commodityDao) {
		CommodityDao = commodityDao;
	}
}
