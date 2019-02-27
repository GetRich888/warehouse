package com.warehouse.pojo.adminManage;

import java.util.List;

public class Role {
    private Integer id;

    private String name;

    private Integer isEffective;

    private Integer department_id;

    private String comment;
    
    private List<Personnel> personnelList;

    public List<Personnel> getPersonnelList() {
		return personnelList;
	}

	public void setPersonnelList(List<Personnel> personnelList) {
		this.personnelList = personnelList;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}