package com.warehouse.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warehouse.mapper.CommodityMapper;
import com.warehouse.mapper.StockMapper;
import com.warehouse.pojo.Commodity;
import com.warehouse.pojo.Stock;
import com.warehouse.service.StockService;

@Service("stockService")
public class StockServiceImpl implements StockService {

	@Autowired
	private StockMapper stockMapper;

	@Override
	public int getStockList() {
		// TODO Auto-generated method stub
		return stockMapper.getStockList();
	}

	@Override
	public List<Stock> getPageList(Integer currentPageNo4, Integer pageSize) {
		Integer startIndex=(currentPageNo4-1)*pageSize;
		return stockMapper.getPageList(startIndex, pageSize);
	}
	
}
