package com.warehouse.service;

import java.util.List;

import com.warehouse.pojo.Library;

public interface LibraryService {

	int getLibraryList();
    List<Library> getPageList(Integer currentPageNo,Integer pageSize);
}
