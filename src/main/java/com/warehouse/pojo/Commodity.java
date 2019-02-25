package com.warehouse.pojo;

/**
 * 商品类
 * @author Administrator
 *
 */
public class Commodity {
    private Integer id;

    private String c_name;

    private String commodity_specification;

    private Integer default_price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name == null ? null : c_name.trim();
    }

    public String getCommodity_specification() {
        return commodity_specification;
    }

    public void setCommodity_specification(String commodity_specification) {
        this.commodity_specification = commodity_specification == null ? null : commodity_specification.trim();
    }

    public Integer getDefault_price() {
        return default_price;
    }

    public void setDefault_price(Integer default_price) {
        this.default_price = default_price;
    }
}