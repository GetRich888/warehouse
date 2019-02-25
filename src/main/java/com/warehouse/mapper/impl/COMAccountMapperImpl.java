package com.warehouse.mapper.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.warehouse.mapper.COMAccountMapper;
import com.warehouse.pojo.COMAccount;

@Service("cOMAccountMapper")
public class COMAccountMapperImpl implements COMAccountMapper {

	private COMAccountMapper cOMAccountMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(COMAccount record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(COMAccount record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public COMAccount selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(COMAccount record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(COMAccount record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<COMAccount> selectCOMAccountInfo() {
		return cOMAccountMapper.selectCOMAccountInfo();
	}

}
