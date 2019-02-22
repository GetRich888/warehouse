package com.warehouse.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warehouse.mapper.RegionMapper;
import com.warehouse.pojo.Region;
import com.warehouse.service.RegionService;

@Service("regionService")
public class RegionServiceImpl implements RegionService {

	@Autowired
	private RegionMapper regionMapper;
	@Override
	public int getRegionList() {
		return regionMapper.getRegionList();
	}

	@Override
	public List<Region> getPageList(Integer currentPageNo2, Integer pageSize) {
		Integer startIndex=(currentPageNo2-1)*pageSize;
		return regionMapper.getPageList(startIndex, pageSize);
	}

}
