package com.warehouse.pojo;

/**
 * 区域类
 * @author Administrator
 *
 */
public class Region {
    private Integer id;

    private Integer l_id;

    private String r_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getL_id() {
        return l_id;
    }

    public void setL_id(Integer l_id) {
        this.l_id = l_id;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name == null ? null : r_name.trim();
    }
}