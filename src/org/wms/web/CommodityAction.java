package org.wms.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.wms.entity.Commodity;
import org.wms.service.CommodityService;

import com.opensymphony.xwork2.ActionContext;

/**
 * 
 * @author Forever
 *
 */
@Controller("commodityAction")
@Scope("prototype")
public class CommodityAction {
	@Resource(name="commodityService")
	private CommodityService commodityService;
	
	//��װ�ͻ�����
	private Commodity c;
	private String[] conditions;
	
	
	//�����Ʒ
	public String addCommodity(){
		System.out.println("ok?");
		return "";
	}
	//��ѯȫ����Ϣ
	public String findAllCommodity(){
		List list = commodityService.findAllCommodity();
		
		ActionContext.getContext().put("clist", list);
		
		return "list";
	}
	
	
	
	
	
	
	
	
	
	
	
	public Commodity getC() {
		return c;
	}
	public void setC(Commodity c) {
		this.c = c;
	}
	public String[] getConditions() {
		return conditions;
	}
	public void setConditions(String[] conditions) {
		this.conditions = conditions;
	}
	public void setCommodityService(CommodityService commodityService) {
		this.commodityService = commodityService;
	}
}
