package com.warehouse.mapper;

import com.warehouse.pojo.COMAccount;

public interface COMAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(COMAccount record);

    int insertSelective(COMAccount record);

    COMAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(COMAccount record);

    int updateByPrimaryKey(COMAccount record);
}