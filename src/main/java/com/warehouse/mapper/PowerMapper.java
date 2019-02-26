package com.warehouse.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.warehouse.pojo.adminManage.Power;

@Mapper
public interface PowerMapper {
    int insert(Power record);

    int insertSelective(Power record);
    
    List<Power> powerQuery(Map<String, Object> require);
}