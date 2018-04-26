/**
 * @copy right Dossp Company All rights reserved
 * @Title: DailyGroupService.java
 * @Date: 2018/4/20 17:44
 * @Package com.dossp.crp.daily.group.service
 */
package com.dossp.crp.daily.group.service;

import com.dossp.crp.daily.group.model.DailyGroupPnlModel;
import com.dossp.crp.daily.group.model.DailyGroupPositionModel;
import com.dossp.crp.daily.group.vo.DailyGroupChartVo;

import java.util.List;

/**
 * @author weihh
 *         </p>
 *         日期：2018/4/20 17:44
 *         </p>
 *         描述：
 */
public interface DailyGroupService {

    /**
     * 获取最大日期
     *
     * @return
     */
    String getMaxDate();

    /**
     * @param tradeDate
     * @return
     */
    DailyGroupChartVo getChartData(String tradeDate);

    /**
     * @param tradeDate
     * @return
     */
    List<DailyGroupPnlModel> getPnlData(String tradeDate);

    /**
     * @param tradeDate
     * @return
     */
    List<DailyGroupPositionModel> getPositionData(String tradeDate);
}
