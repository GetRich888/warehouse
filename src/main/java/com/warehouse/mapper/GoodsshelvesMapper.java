package com.warehouse.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.warehouse.pojo.Goodsshelves;

@Mapper
public interface GoodsshelvesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goodsshelves record);

    int insertSelective(Goodsshelves record);

    Goodsshelves selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodsshelves record);

    int updateByPrimaryKey(Goodsshelves record);
    
  //分页查询
    int getGoodsshelvesList();
    List<Goodsshelves> getPageList(@Param("startIndex") Integer startIndex,@Param("pageSize") Integer pageSize);
}