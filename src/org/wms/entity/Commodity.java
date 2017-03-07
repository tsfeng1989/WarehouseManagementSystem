package org.wms.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 商品实体类
 * @author Forever
 * 
 */
@Entity
@Table(name="tb_commodity")
public class Commodity {
	private String c_id;
	private String c_name;
	private String c_units;
	private int c_quantity;
	private Date c_time;
	private String c_operator;
	public Commodity() {
		super();
	}
	public Commodity(String c_id, String c_name, String c_units, int c_quantity, Date c_time, String c_operator) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_units = c_units;
		this.c_quantity = c_quantity;
		this.c_time = c_time;
		this.c_operator = c_operator;
	}
	@Id
	@GeneratedValue(generator="pk")
	@GenericGenerator(name="pk",strategy="uuid.hex")
	public String getC_id() {
		return c_id;
	}
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_units() {
		return c_units;
	}
	public void setC_units(String c_units) {
		this.c_units = c_units;
	}
	public int getC_quantity() {
		return c_quantity;
	}
	public void setC_quantity(int c_quantity) {
		this.c_quantity = c_quantity;
	}
	public Date getC_time() {
		return c_time;
	}
	public void setC_time(Date c_time) {
		this.c_time = c_time;
	}
	public String getC_operator() {
		return c_operator;
	}
	public void setC_operator(String c_operator) {
		this.c_operator = c_operator;
	}
}


