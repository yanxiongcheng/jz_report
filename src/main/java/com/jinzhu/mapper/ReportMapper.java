package com.jinzhu.mapper;

import java.util.List;
import java.util.Map;

public interface ReportMapper {
	
	int selectTotalCount();
	
    int insert();

    int insertByIncrement();
    
    List<Map<String, Object>> selectOrderCompletionRateWithCount(String selectDate);
    
    List<Map<String, Object>> selectOrderCompletionRateWithAmount(String selectDate);
    
    List<Map<String, Object>> selectDailyloanCount(String selectDate);

}