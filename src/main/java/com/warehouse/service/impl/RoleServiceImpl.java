package com.warehouse.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warehouse.mapper.RoleMapper;
import com.warehouse.mapper.adminRelevan.Person_to_Role;
import com.warehouse.pojo.adminManage.Role;
import com.warehouse.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleMapper roleMapper;
	
	@Autowired
	Person_to_Role person_to_Role;
	
	
	
	@Override
	public List<Role> roleSelect(Map<String, Object> requirement) {
		
		List<Role> selectRole = roleMapper.selectRole(requirement);
		return selectRole;
	}

	@Override
	public int roleInsert(Role role) {
		int insertSelective = roleMapper.insertSelective(role);
		return insertSelective;
	}
	
}
