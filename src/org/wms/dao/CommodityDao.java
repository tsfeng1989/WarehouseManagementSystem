package org.wms.dao;

import java.util.List;

import org.wms.entity.Commodity;

/**
 * 
 * @author Forever
 *
 */
public interface CommodityDao {
	//添加商品
	public boolean addCommodity(Commodity c);
	
	//删除商品
	public boolean delCommodity(Commodity c);
	
	//根据ID查询商品1
	public Commodity findByIdCommodity(String sql);
	
	//根据ID查询商品2
	public Commodity findByIdCommoditytwo(Commodity c);
	
	//修改商品
	public boolean updateCommodity(Commodity c);
	
	//查询全部商品
	public List findAllCommodity(String hql);
	
}
