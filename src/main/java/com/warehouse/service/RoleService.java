package com.warehouse.service;

import java.util.List;
import java.util.Map;

import com.warehouse.pojo.adminManage.Role;

public interface RoleService {
	public List<Role> roleSelect(Map<String, Object> requirement);
}
