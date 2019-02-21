package com.warehouse.mapper;

import com.warehouse.pojo.PayPalDoc;

public interface PayPalDocMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayPalDoc record);

    int insertSelective(PayPalDoc record);

    PayPalDoc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayPalDoc record);

    int updateByPrimaryKey(PayPalDoc record);
}