package com.warehouse.pojo;

/**
 * 货架类
 * @author Administrator
 *
 */
public class Goodsshelves {
    private Integer id;

    private Integer r_id;

    private String g_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name == null ? null : g_name.trim();
    }
}