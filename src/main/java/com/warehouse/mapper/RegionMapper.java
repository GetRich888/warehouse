package com.warehouse.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.warehouse.pojo.Region;

@Mapper
public interface RegionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Region record);

    int insertSelective(Region record);

    Region selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Region record);

    int updateByPrimaryKey(Region record);
    
    //分页查询
    int getRegionList();
    List<Region> getPageList(@Param("startIndex") Integer startIndex,@Param("pageSize") Integer pageSize);
}