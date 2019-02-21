package com.warehouse.mapper;

import com.warehouse.pojo.OtherPayPal;

public interface OtherPayPalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OtherPayPal record);

    int insertSelective(OtherPayPal record);

    OtherPayPal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OtherPayPal record);

    int updateByPrimaryKey(OtherPayPal record);
}