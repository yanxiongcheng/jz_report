package com.jinzhu.mapper;

import java.util.List;
import java.util.Map;

public interface ReportMapper {
	
	int selectTotalCount();
	
    int insert();

    int insertByIncrement();
    
    List<Map<String, Object>> selectOrderCompletionRateWithCount(String selectDate);
    
    List<Map<String, Object>> selectOrderCompletionRateWithAmount(String selectDate);
    
    List<Map<String, Object>> selectDailyLoanCount(String selectDate);
    
    List<Map<String, Object>> selectDailyLoanAmount(String selectDate);
    
    List<Map<String, Object>> selectRealLoanCount(String selectDate);
    
    List<Map<String, Object>> selectRealLoanAmount(String selectDate);
    
    List<Map<String, Object>> selectProductSalesWithCount(String selectDate);
    
    List<Map<String, Object>> selectProductSalesWithAmount(String selectDate);

}