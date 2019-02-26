package com.warehouse.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.warehouse.pojo.PayPalDoc;

@Mapper
public interface PayPalDocMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayPalDoc record);

    int insertSelective(PayPalDoc record);

    PayPalDoc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayPalDoc record);

    int updateByPrimaryKey(PayPalDoc record);
    
    List<PayPalDoc> selectPayDoc();
}