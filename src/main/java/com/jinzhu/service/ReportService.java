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
	ReportResult queryDailyloanCount(String selectDate);

}
