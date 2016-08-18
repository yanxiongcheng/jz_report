package com.jinzhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jinzhu.common.bean.ReportResult;
import com.jinzhu.service.ReportService;

@Controller
@RequestMapping("/report")
public class ReportController {

	@Autowired
	private ReportService reportService;
	
	@RequestMapping("/orderCompRateC")
	@ResponseBody
	public ReportResult queryOrderCompletionRateWithCount(String selectDate){
		return reportService.queryOrderCompletionRateWithCount(selectDate);
	} 
	
	@RequestMapping("/orderCompRateA")
	@ResponseBody
	public ReportResult queryOrderCompletionRateWithAmount(String selectDate){
		return reportService.queryOrderCompletionRateWithAmount(selectDate);
	} 
	
	@RequestMapping("/dailyLoanCount")
	@ResponseBody
	public ReportResult queryDailyLoanCount(String selectDate){
		return reportService.queryDailyLoanCount(selectDate);
	} 
	
	@RequestMapping("/dailyLoanAmount")
	@ResponseBody
	public ReportResult queryDailyLoanAmount(String selectDate){
		return reportService.queryDailyLoanAmount(selectDate);
	} 
	
	@RequestMapping("/realLoanCount")
	@ResponseBody
	public ReportResult queryRealLoanCount(String selectDate){
		return reportService.queryRealLoanCount(selectDate);
	} 
	
	@RequestMapping("/realLoanAmount")
	@ResponseBody
	public ReportResult queryRealLoanAmount(String selectDate){
		return reportService.queryRealLoanAmount(selectDate);
	} 
	@RequestMapping("/productSalesC")
	@ResponseBody
	public ReportResult queryProductSalesWithCount(String selectDate){
		return reportService.queryProductSalesWithCount(selectDate);
	} 
	
	@RequestMapping("/productSalesA")
	@ResponseBody
	public ReportResult queryProductSalesWithAmount(String selectDate){
		return reportService.queryProductSalesWithAmount(selectDate);
	} 
	
}
