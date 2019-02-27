package com.warehouse.mapper.adminRelevan;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.warehouse.pojo.adminManage.Personnel;

@Mapper
public interface Person_to_Role {
	public List<Personnel> selectPersonnelByRoleId(@Param("roleId")Integer roleId);
}
