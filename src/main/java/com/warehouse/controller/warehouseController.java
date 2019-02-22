package com.warehouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.warehouse.pojo.Goodsshelves;
import com.warehouse.pojo.Library;
import com.warehouse.pojo.Region;
import com.warehouse.pojo.Stock;
import com.warehouse.service.GoodsshelvesService;
import com.warehouse.service.LibraryService;
import com.warehouse.service.RegionService;
import com.warehouse.service.StockService;
import com.warehouse.tools.PageTool;

@Controller
public class warehouseController {

	@Autowired
	private LibraryService libraryService;
	
	@Autowired
	private RegionService regionService;
	
	@Autowired
	private GoodsshelvesService goodsshelvesService;
	
	@Autowired
	private StockService stockService;
	
	@RequestMapping("/articleList1")
	public String add1() {
		return "/warehouse/articleList1";
	}
	@RequestMapping("/articleList")
	public String article(Model model,Integer small,Integer currentPageNo,Integer currentPageNo2,Integer currentPageNo3,Integer currentPageNo4) {
		if(null == currentPageNo) {
			currentPageNo =1; 
		}
		if(null == currentPageNo2) {
			currentPageNo2 =1; 
		}
		if(null == currentPageNo3) {
			currentPageNo3 =1; 
		}
		if(null == currentPageNo4) {
			currentPageNo4 =1; 
		}
		int getlibraryList = libraryService.getLibraryList();//库
		PageTool pageTool1 = new PageTool();
		pageTool1.setTotalCount(getlibraryList);//库总行数
		pageTool1.setCurrentPageNo(currentPageNo);
		List<Library> libraryList = libraryService.getPageList(currentPageNo, pageTool1.getPageSize());
		model.addAttribute("libraryList", libraryList);
		model.addAttribute("pageTool1", pageTool1);
		
		int getregionList = regionService.getRegionList();//区
		PageTool pageTool2 = new PageTool();
		pageTool2.setTotalCount(getregionList);//区总行数
		pageTool2.setCurrentPageNo(currentPageNo2);
		List<Region> regionList = regionService.getPageList(currentPageNo2, pageTool2.getPageSize());
		model.addAttribute("regionList", regionList);
		model.addAttribute("pageTool2", pageTool2);
		
		int getgoodsshelvesList = goodsshelvesService.getGoodsshelvesList();//货架
		PageTool pageTool3 = new PageTool();
		pageTool3.setTotalCount(getgoodsshelvesList);//货架总行数
		pageTool3.setCurrentPageNo(currentPageNo3);
		List<Goodsshelves> goodsshelvesList = goodsshelvesService.getPageList(currentPageNo3, pageTool3.getPageSize());
		model.addAttribute("goodsshelvesList", goodsshelvesList);
		model.addAttribute("pageTool3", pageTool3);
		
		int getstockList = stockService.getStockList();//库存
		PageTool pageTool4 = new PageTool();
		pageTool4.setTotalCount(getstockList);//库存总行数
		pageTool4.setCurrentPageNo(currentPageNo4);
		List<Stock> stockList = stockService.getPageList(currentPageNo4, pageTool4.getPageSize());
		model.addAttribute("stockList", stockList);
		model.addAttribute("pageTool4", pageTool4);
		
		return "/warehouse/articleList";
	}
}
