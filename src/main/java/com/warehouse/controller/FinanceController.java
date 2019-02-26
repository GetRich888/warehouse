package com.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.warehouse.mapper.impl.COMAccountMapperImpl;

@RequestMapping("/finance")
@Controller
public class FinanceController {

	@Autowired
	private COMAccountMapperImpl cOMAccountMapperImpl;
	
	@RequestMapping("/accountInfo")
	public String finance(Model model) {
		System.out.println("账户信息");
		model.addAttribute("AIList", cOMAccountMapperImpl.selectCOMAccountInfo());
		return "page/finance/accountInfo";
	}

	@RequestMapping("/paymentDoc")
	public String paymentDoc() {
		System.out.println("付款单");
		return "page/finance/paymentDoc";
	}

	@RequestMapping("/receiptsDoc")
	public String receiptsDoc() {
		System.out.println("收款单");
		return "page/finance/receiptsDoc";
	}

	@RequestMapping("/profitAnalysis")
	public String profitAnalysis() {
		System.out.println("利润分析");
		return "page/finance/profitAnalysis";
	}
}
