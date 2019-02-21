package com.warehouse.service;

import java.util.List;

import com.warehouse.pojo.Region;

public interface RegionService {

	int getRegionList();
    List<Region> getPageList(Integer currentPageNo,Integer pageSize);
}
