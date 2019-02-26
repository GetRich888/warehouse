package com.warehouse.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warehouse.mapper.RoleMapper;
import com.warehouse.pojo.adminManage.Role;
import com.warehouse.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleMapper roleMapper;
	
	@Override
	public List<Role> roleSelect(Map<String, Object> requirement) {
		
		return roleMapper.selectRole(requirement);
	}
	
}
