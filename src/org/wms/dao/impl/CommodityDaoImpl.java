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
	
	//�����Ʒ
	@Override
	public boolean addCommodity(Commodity c) {
		return addObject(c)!=null?true:false;
	}
	
	//ɾ����Ʒ
	@Override
	public boolean delCommodity(Commodity c) {
		return deleteObject(c);
	}
	
	//����ID��ѯ��Ʒ1
	@Override
	public Commodity findByIdCommodity(String hql) {
		return (Commodity)executeQuery(hql).get(0);
	}
	
	//����ID��ѯ��Ʒ2
	@Override
	public Commodity findByIdCommoditytwo(Commodity c) {
		return (Commodity)get(Commodity.class, c.getC_id());
	}
	
	//�޸���Ʒ��Ϣ
	@Override
	public boolean updateCommodity(Commodity c) {
		return updateObject(c);
	}
	
	//��ѯȫ����Ʒ
	@Override
	public List findAllCommodity(String hql) {
		return executeQuery(hql);
	}

}
