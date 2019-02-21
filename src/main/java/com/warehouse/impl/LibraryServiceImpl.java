package com.warehouse.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warehouse.mapper.LibraryMapper;
import com.warehouse.pojo.Library;
import com.warehouse.service.LibraryService;

@Service("libraryService")
public class LibraryServiceImpl implements LibraryService {

	@Autowired
	private LibraryMapper libraryMapper;
	@Override
	public int getLibraryList() {
		return libraryMapper.getLibraryList();
	}

	@Override
	public List<Library> getPageList(Integer currentPageNo, Integer pageSize) {
		Integer startIndex=(currentPageNo-1)*pageSize;
		return libraryMapper.getPageList(startIndex, pageSize);
	}

}
