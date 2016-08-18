package com.jinzhu.service;

import com.jinzhu.common.bean.ReportResult;

public interface ReportService {

	/**
	 * 查询报表数据总记录数
	 * @return
	 */
	int queryTotalCount();

	/**
	 * 全量插入到报表数据
	 * @return
	 */
	int addReportData();

	/**
	 * 增量插入到报表数据
	 * @return
	 */
	int addReportDataByIncrement();
	
	/**
	 *  根据年月查询订单完成率（数量）
	 * @param selectDate
	 * @return
	 */
	ReportResult queryOrderCompletionRateWithCount(String selectDate);
	
	/**
	 *  根据年月查询订单完成率（金额）
	 * @param selectDate
	 * @return
	 */
	ReportResult queryOrderCompletionRateWithAmount(String selectDate);
	
	/**
	 * 根据年月查询每日申贷笔数
	 * @param selectDate
	 * @return
	 */
	ReportResult queryDailyLoanCount(String selectDate);
	
	/**
	 * 根据年月查询每日申贷金额
	 * @param selectDate
	 * @return
	 */
	
	ReportResult queryDailyLoanAmount(String selectDate);
	/**
	 * 根据年月查询每日实际放款笔数
	 * @param selectDate
	 * @return
	 */
	ReportResult queryRealLoanCount(String selectDate);
	
	/**
	 * 根据年月查询每日实际放款金额
	 * @param selectDate
	 * @return
	 */
	ReportResult queryRealLoanAmount(String selectDate);
	/**
	 * 根据年月查询各类产品销售情况（笔数）
	 * @param selectDate
	 * @return
	 */
	ReportResult queryProductSalesWithCount(String selectDate);
	
	/**
	 * 根据年月查询各类产品销售情况（金额）
	 * @param selectDate
	 * @return
	 */
	ReportResult queryProductSalesWithAmount(String selectDate);

}
