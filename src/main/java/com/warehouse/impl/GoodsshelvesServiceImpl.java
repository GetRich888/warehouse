package com.warehouse.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warehouse.mapper.GoodsshelvesMapper;
import com.warehouse.pojo.Goodsshelves;
import com.warehouse.service.GoodsshelvesService;

@Service("goodsshelvesService")
public class GoodsshelvesServiceImpl implements GoodsshelvesService {

	@Autowired
	private GoodsshelvesMapper goodsshelvesMapper;
	@Override
	public int getGoodsshelvesList() {
		return goodsshelvesMapper.getGoodsshelvesList();
	}

	@Override
	public List<Goodsshelves> getPageList(Integer currentPageNo, Integer pageSize) {
		Integer startIndex=(currentPageNo-1)*pageSize;
		return goodsshelvesMapper.getPageList(startIndex, pageSize);
	}

}
