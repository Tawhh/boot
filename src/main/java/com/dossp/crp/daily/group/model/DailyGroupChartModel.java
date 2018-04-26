/**
 * @copy right Dossp Company All rights reserved
 * @Title: DailyGroupChartModel.java
 * @Date: 2018/4/20 18:02
 * @Package com.dossp.crp.daily.group.model
 */
package com.dossp.crp.daily.group.model;

import com.dossp.common.model.BaseModel;

import java.math.BigDecimal;

/**
 * @author weihh
 *         </p>
 *         日期：2018/4/20 18:02
 *         </p>
 *         描述：
 */
public class DailyGroupChartModel extends BaseModel {

    private static final long serialVersionUID = 8714370724382452241L;
    private String corpName;
    private BigDecimal totalPnl;
    private BigDecimal prevTotalPnl;
    private BigDecimal budgetProfit;

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public BigDecimal getTotalPnl() {
        return totalPnl;
    }

    public void setTotalPnl(BigDecimal totalPnl) {
        this.totalPnl = totalPnl;
    }

    public BigDecimal getPrevTotalPnl() {
        return prevTotalPnl;
    }

    public void setPrevTotalPnl(BigDecimal prevTotalPnl) {
        this.prevTotalPnl = prevTotalPnl;
    }

    public BigDecimal getBudgetProfit() {
        return budgetProfit;
    }

    public void setBudgetProfit(BigDecimal budgetProfit) {
        this.budgetProfit = budgetProfit;
    }
}
