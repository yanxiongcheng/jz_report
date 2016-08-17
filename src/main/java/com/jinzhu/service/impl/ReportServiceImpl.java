package com.jinzhu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinzhu.common.bean.ReportResult;
import com.jinzhu.mapper.ReportMapper;
import com.jinzhu.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportMapper reportMapper;
	
	public int queryTotalCount() {
		return reportMapper.selectTotalCount();
	}

	public int addReportData() {
		return reportMapper.insert();
	}

	public int addReportDataByIncrement() {
		return reportMapper.insertByIncrement();
	}

	public ReportResult queryOrderCompletionRateWithCount(
			String selectDate) {
		List<Map<String, Object>> resultMap = reportMapper.selectOrderCompletionRateWithCount(selectDate);
		ReportResult reportResult = new ReportResult();
		reportResult.setData(resultMap);
		return reportResult;
	}

	public ReportResult queryOrderCompletionRateWithAmount(String selectDate) {
		List<Map<String, Object>> resultMap = reportMapper.selectOrderCompletionRateWithAmount(selectDate);
		ReportResult reportResult = new ReportResult();
		reportResult.setData(resultMap);
		return reportResult;
	}

	public ReportResult queryDailyloanCount(String selectDate) {
		List<Map<String, Object>> resultMap = reportMapper.selectDailyloanCount(selectDate);
		ReportResult reportResult = new ReportResult();
		reportResult.setData(resultMap);
		return reportResult;
	}

	public ReportResult queryDailyloanAmount(String selectDate) {
		List<Map<String, Object>> resultMap = reportMapper.selectDailyloanAmount(selectDate);
		ReportResult reportResult = new ReportResult();
		reportResult.setData(resultMap);
		return reportResult;
	}

}
