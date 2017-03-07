package org.wms.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.wms.dao.CommodityDao;
import org.wms.entity.Commodity;
/**
 * 
 * @author Forever
 *
 */
@Repository("CommodityDao")
public class CommodityDaoImpl extends BaseDao implements CommodityDao {
	
	//添加商品
	@Override
	public boolean addCommodity(Commodity c) {
		return addObject(c)!=null?true:false;
	}
	
	//删除商品
	@Override
	public boolean delCommodity(Commodity c) {
		return deleteObject(c);
	}
	
	//根据ID查询商品1
	@Override
	public Commodity findByIdCommodity(String hql) {
		return (Commodity)executeQuery(hql).get(0);
	}
	
	//根据ID查询商品2
	@Override
	public Commodity findByIdCommoditytwo(Commodity c) {
		return (Commodity)get(Commodity.class, c.getC_id());
	}
	
	//修改商品信息
	@Override
	public boolean updateCommodity(Commodity c) {
		return updateObject(c);
	}
	
	//查询全部商品
	@Override
	public List findAllCommodity(String hql) {
		return executeQuery(hql);
	}

}
