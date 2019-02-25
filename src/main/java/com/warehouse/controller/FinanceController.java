package com.warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/finance")
@Controller
public class FinanceController {

	@RequestMapping("/accountInfo")
	public String finance() {
		System.out.println("账户信息");
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
