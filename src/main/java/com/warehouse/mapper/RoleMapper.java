package com.warehouse.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.warehouse.pojo.adminManage.Personnel;
import com.warehouse.pojo.adminManage.Role;

@Mapper
public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);
    
    List<Role> selectRole(Map<String, Object> requirement);
    
    List<Personnel> selectPersonnelByRoleId(Integer rid);
}