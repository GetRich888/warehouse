package com.warehouse.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warehouse.mapper.PowerMapper;
import com.warehouse.pojo.adminManage.Power;
import com.warehouse.service.PowerService;

@Service("powerService")
public class PowerServiceImpl implements PowerService{

	@Autowired
	PowerMapper powerMapper;

	@Override
	public List<Power> queryPower(Map<String, Object> require) {
		List<Power> powerQuery = powerMapper.powerQuery(require);
		return powerQuery;
	}
	

}
