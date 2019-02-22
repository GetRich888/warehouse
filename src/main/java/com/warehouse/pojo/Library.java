package com.warehouse.pojo;

/**
 * 仓库类
 * @author Administrator
 *
 */
public class Library {
    private Integer id;

    private String l_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name == null ? null : l_name.trim();
    }
}