package com.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warehouse.mapper.impl.COMAccountMapperImpl;

@RequestMapping("/finance/")
@Controller
public class FinanceController {

	private static final String Finance_page = "page/finance/";
	
	@Autowired
	private COMAccountMapperImpl cOMAccountMapperImpl;
	
	/**
	 * ===================================================================
	 * =============================账户信息================================
	 */
	
	@RequestMapping("accountInfo")
	public String finance(Model model) {
		System.out.println("账户信息");
		model.addAttribute("AIList", cOMAccountMapperImpl.selectCOMAccountInfo());
		return FinanceController.Finance_page+"accountInfo";
	}
	
	@ResponseBody
	@RequestMapping("removeAccount")
	public String removeAccount(int id) {
		System.out.println("删除账户");
		return "true";
	}
	
	@RequestMapping("openAccountEditWindow")
	public String editAccount() {
		System.out.println("打开编辑窗口");
		return "htmls/editAccount";
	}
	
	@RequestMapping("test")
	public String test() {
		System.out.println("test");
		return "htmls/test";
	}

	/**
	 * ===================================================================
	 * =============================付款单==================================
	 */
	
	@RequestMapping("/paymentDoc")
	public String paymentDoc() {
		System.out.println("付款单");
		return "page/finance/paymentDoc";
	}

	/**
	 * ===================================================================
	 * =============================收款单================================
	 */
	
	@RequestMapping("/receiptsDoc")
	public String receiptsDoc() {
		System.out.println("收款单");
		return "page/finance/receiptsDoc";
	}

	/**
	 * ===================================================================
	 * =============================利润分析================================
	 */
	
	@RequestMapping("/profitAnalysis")
	public String profitAnalysis() {
		System.out.println("利润分析");
		return "page/finance/profitAnalysis";
	}
}
