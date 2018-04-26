/**
 * @copy right Dossp Company All rights reserved
 * @Title: DailyCdExposureMapper.java
 * @Date: 2018/3/28 11:40
 * @Package com.dossp.crp.market.commodities.cd.exposure.mapper
 */
package com.dossp.crp.market.pnl.mapper;

import java.util.List;

import com.dossp.common.mybatis.MyBaseMapper;
import com.dossp.crp.market.pnl.model.DailyCdPnlModel;
import com.dossp.crp.market.pnl.model.MarketPnlModel;

/**
 * @author weihh
 *         </p>
 *         日期：2018/3/28 11:40
 *         </p>
 *         描述：
 */
public interface MarketPnlMapper extends MyBaseMapper<MarketPnlModel>{

    /**
     * @param dataDate
     * @return
     */
    List<MarketPnlModel> getData(String dataDate);
    
    List<MarketPnlModel> getLastDayData(String tradeDate);
    
    String getMaxDate();
}
