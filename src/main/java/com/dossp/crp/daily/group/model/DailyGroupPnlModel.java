/**
 * @copy right Dossp Company All rights reserved
 * @Title: DailyGroupPnlModel.java
 * @Date: 2018/4/20 17:46
 * @Package com.dossp.crp.daily.group.model
 */
package com.dossp.crp.daily.group.model;

import com.dossp.common.model.BaseModel;

import java.math.BigDecimal;

/**
 * @author weihh
 *         </p>
 *         日期：2018/4/20 17:46
 *         </p>
 *         描述：
 */
public class DailyGroupPnlModel extends BaseModel {

    private static final long serialVersionUID = -1986779207651431681L;
    private String corpName;
    private BigDecimal futuresPnl;
    private BigDecimal spotPnl;
    private BigDecimal totalPnl;
    private BigDecimal deltaPnl;
    private BigDecimal ret;

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public BigDecimal getFuturesPnl() {
        return futuresPnl;
    }

    public void setFuturesPnl(BigDecimal futuresPnl) {
        this.futuresPnl = futuresPnl;
    }

    public BigDecimal getSpotPnl() {
        return spotPnl;
    }

    public void setSpotPnl(BigDecimal spotPnl) {
        this.spotPnl = spotPnl;
    }

    public BigDecimal getTotalPnl() {
        return totalPnl;
    }

    public void setTotalPnl(BigDecimal totalPnl) {
        this.totalPnl = totalPnl;
    }

    public BigDecimal getDeltaPnl() {
        return deltaPnl;
    }

    public void setDeltaPnl(BigDecimal deltaPnl) {
        this.deltaPnl = deltaPnl;
    }

    public BigDecimal getRet() {
        return ret;
    }

    public void setRet(BigDecimal ret) {
        this.ret = ret;
    }
}
