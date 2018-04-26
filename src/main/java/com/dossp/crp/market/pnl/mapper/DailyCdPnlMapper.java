package com.dossp.crp.market.pnl.mapper;

import java.util.List;

import com.dossp.common.mybatis.MyBaseMapper;
import com.dossp.crp.market.pnl.model.DailyCdPnlModel;

/**
 * @author wulei
 *         </p>
 *         日期：2018/3/30 15:36
 *         </p>
 *         描述：
 */
public interface DailyCdPnlMapper extends MyBaseMapper<DailyCdPnlModel> {

	String findMaxDate();

	List<DailyCdPnlModel> getData(String tradeDate);

	List<DailyCdPnlModel> getLastDayData(String tradeDate);

}