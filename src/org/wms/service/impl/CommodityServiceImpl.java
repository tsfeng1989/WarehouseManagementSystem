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
	
	//添加商品
	@Override
	public boolean addCommodity(Commodity c) {
		return CommodityDao.addCommodity(c);
	}
	
	//删除商品
	@Override
	public boolean delCommodity(Commodity c) {
		return CommodityDao.delCommodity(c);
	}
	
	//根据ID查询商品1
	@Override
	public Commodity findByIdCommodity(String id) {
		String sql = "from Commodity where c_id='"+id+"'";
		return CommodityDao.findByIdCommodity(sql);
	}
	
	//根据ID查询商品2
	@Override
	public Commodity findByIdCommoditytwo(Commodity c) {
		return CommodityDao.findByIdCommoditytwo(c);
	}
	
	//修改商品
	@Override
	public boolean updateCommodity(Commodity c) {
		return CommodityDao.updateCommodity(c);
	}

	//查询全部商品
	@Override
	public List findAllCommodity() {
		return CommodityDao.findAllCommodity("from Commodity");
	}
	
	//模糊查询
	@Override
	public List fuzzyQuery(String[] conditions) {
		String hql = "from Commodity c where 1=1";
		if(conditions[0]!=null && conditions[0].length()>0){
			hql += " and c.c_name like '%"+conditions[0]+"%'";
		}
		if(conditions[1]!=null && conditions[1].length()>0){
			hql += " and c.c_operator like '%"+conditions[1]+"%'";
		}
		if(conditions[2]!=null && conditions[2].length()>0){
			hql+=" and c.c_quantity >="+conditions[2];
		}
		if(conditions[3]!=null && conditions[3].length()>0){
			hql+=" and c.c_quantity <="+conditions[3];
		}
		return CommodityDao.findAllCommodity(hql);
	}
	
	
	
	public void setCommodityDao(CommodityDao commodityDao) {
		CommodityDao = commodityDao;
	}
}
