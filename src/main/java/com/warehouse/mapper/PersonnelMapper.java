package com.warehouse.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.warehouse.pojo.adminManage.Personnel;

@Mapper
public interface PersonnelMapper {
    int insert(Personnel record);

    int insertSelective(Personnel record);
    
    List<Personnel> selectPersonnel(Map<String, Object> require); 
    
    List<Personnel> selectPersonnelByRoleId(@Param("id")Integer id); 
    
}