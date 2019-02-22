package com.warehouse.pojo;

import java.util.Date;

/**
 * 库存类
 * @author Administrator
 *
 */
public class Stock {
    private Integer id;

    private Integer c_id;

    private Integer stock_number;

    private Date production_time;

    private Integer quality_guarantee_period;

    private Integer item_pricing;

    private Integer l_id;

    private Integer r_id;

    private Integer g_id;

    private Commodity commodity;
    
    
    public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public Integer getStock_number() {
        return stock_number;
    }

    public void setStock_number(Integer stock_number) {
        this.stock_number = stock_number;
    }

    public Date getProduction_time() {
        return production_time;
    }

    public void setProduction_time(Date production_time) {
        this.production_time = production_time;
    }

    public Integer getQuality_guarantee_period() {
        return quality_guarantee_period;
    }

    public void setQuality_guarantee_period(Integer quality_guarantee_period) {
        this.quality_guarantee_period = quality_guarantee_period;
    }

    public Integer getItem_pricing() {
        return item_pricing;
    }

    public void setItem_pricing(Integer item_pricing) {
        this.item_pricing = item_pricing;
    }

    public Integer getL_id() {
        return l_id;
    }

    public void setL_id(Integer l_id) {
        this.l_id = l_id;
    }

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public Integer getG_id() {
        return g_id;
    }

    public void setG_id(Integer g_id) {
        this.g_id = g_id;
    }
}