package com.jinzhu.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.jinzhu.service.ReportService;


/**
 * 定时获取报表数据
 * @author yanxc
 *
 */
public class GetReportDataJob {
	
	private static final Logger logger = LoggerFactory.getLogger(GetReportDataJob.class);
	
	@Autowired
	private ReportService reportService;
	public void work() {  
        int count = 0;
        int insertCount = 0;
        try {
        	count = reportService.queryTotalCount();
        	logger.info("报表数据总记录数：" + count);
        	logger.info("报表数据插入中 ......");
        	if(count == 0){//第一次插入全量数据
        		insertCount = reportService.addReportData();
        	}else{//增量插入
        		insertCount = reportService.addReportDataByIncrement();
        	}
        	logger.info("共插入" + insertCount + "条记录，报表数据插入完成！");
		} catch (Exception e) {
			logger.error("报表数据插入发生异常，原因：", e);
		}
    }  

}
