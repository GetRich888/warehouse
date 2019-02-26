package com.warehouse.service;

import java.util.List;
import java.util.Map;

import com.warehouse.pojo.adminManage.Role;

/**
 * 角色业务逻辑层
 * @author Administrator
 *
 */
public interface RoleService {
	
	/**
	 * 按条件查询角色
	 * @param requirement
	 * @return
	 */
	public List<Role> roleSelect(Map<String, Object> requirement);
	
	public int roleInsert(Role role);
	
}
