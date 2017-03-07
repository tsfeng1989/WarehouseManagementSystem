package org.wms.dao;

import java.util.List;

import org.wms.entity.Commodity;

/**
 * 
 * @author Forever
 *
 */
public interface CommodityDao {
	//�����Ʒ
	public boolean addCommodity(Commodity c);
	
	//ɾ����Ʒ
	public boolean delCommodity(Commodity c);
	
	//����ID��ѯ��Ʒ1
	public Commodity findByIdCommodity(String sql);
	
	//����ID��ѯ��Ʒ2
	public Commodity findByIdCommoditytwo(Commodity c);
	
	//�޸���Ʒ
	public boolean updateCommodity(Commodity c);
	
	//��ѯȫ����Ʒ
	public List findAllCommodity(String hql);
	
}
