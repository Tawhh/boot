/**
 * @copy right Dossp Company All rights reserved
 * @Title: DailyGroupChartVo.java
 * @Date: 2018/4/23 10:45
 * @Package com.dossp.crp.daily.group.vo
 */
package com.dossp.crp.daily.group.vo;

import com.dossp.common.model.BaseModel;

/**
 * @author weihh
 *         </p>
 *         日期：2018/4/23 10:45
 *         </p>
 *         描述：
 */
public class DailyGroupChartVo extends BaseModel {

    private static final long serialVersionUID = 4159009047607794608L;
    private String[] corpName;
    private String[] totalPnl;
    private String[] prevTotalPnl;
    private String[] budgetProfit;

    public String[] getCorpName() {
        return corpName;
    }

    public void setCorpName(String[] corpName) {
        this.corpName = corpName;
    }

    public String[] getTotalPnl() {
        return totalPnl;
    }

    public void setTotalPnl(String[] totalPnl) {
        this.totalPnl = totalPnl;
    }

    public String[] getPrevTotalPnl() {
        return prevTotalPnl;
    }

    public void setPrevTotalPnl(String[] prevTotalPnl) {
        this.prevTotalPnl = prevTotalPnl;
    }

    public String[] getBudgetProfit() {
        return budgetProfit;
    }

    public void setBudgetProfit(String[] budgetProfit) {
        this.budgetProfit = budgetProfit;
    }
}
