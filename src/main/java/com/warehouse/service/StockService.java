package com.warehouse.service;

import java.util.List;


import com.warehouse.pojo.Commodity;
import com.warehouse.pojo.Stock;

public interface StockService {

	int getStockList();
    List<Stock> getPageList(Integer currentPageNo4,Integer pageSize);
}
