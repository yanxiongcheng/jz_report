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
	
	@RequestMapping("/dailyloanCount")
	@ResponseBody
	public ReportResult queryDailyloanCount(String selectDate){
		return reportService.queryDailyloanCount(selectDate);
	} 
	
}
