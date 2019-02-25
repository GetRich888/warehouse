package com.warehouse.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.warehouse.pojo.COMAccount;

@Mapper
public interface COMAccountMapper {
    int deleteByPrimaryKey(Integer id);
 
    int insert(COMAccount record);

    int insertSelective(COMAccount record);

    COMAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(COMAccount record);

    int updateByPrimaryKey(COMAccount record);

    /**
     * 查询公司账户信息
     * @return
     */
    List<COMAccount> selectCOMAccountInfo();
    
}