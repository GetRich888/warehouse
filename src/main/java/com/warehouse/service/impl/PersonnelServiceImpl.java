package com.warehouse.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warehouse.mapper.PersonnelMapper;
import com.warehouse.pojo.adminManage.Personnel;
import com.warehouse.service.PersonnelService;

@Service("personnelService")
public class PersonnelServiceImpl implements PersonnelService{

	@Autowired
	PersonnelMapper personnelMapper;
	
	@Override
	public List<Personnel> queryPersonnel(Map<String, Object> require) {
		List<Personnel> selectPersonnel = personnelMapper.selectPersonnel(require);
		return selectPersonnel;
	}

}
