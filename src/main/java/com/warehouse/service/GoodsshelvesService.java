package com.warehouse.service;

import java.util.List;

import com.warehouse.pojo.Goodsshelves;

public interface GoodsshelvesService {
	
	 int getGoodsshelvesList();
	    List<Goodsshelves> getPageList(Integer currentPageNo3,Integer pageSize);
}
