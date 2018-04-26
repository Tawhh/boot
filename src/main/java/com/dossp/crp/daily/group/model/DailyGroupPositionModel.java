/**
 * @copy right Dossp Company All rights reserved
 * @Title: DailyGroupPositionModel.java
 * @Date: 2018/4/20 18:05
 * @Package com.dossp.crp.daily.group.model
 */
package com.dossp.crp.daily.group.model;

import com.dossp.common.model.BaseModel;

import java.math.BigDecimal;

/**
 * @author weihh
 *         </p>
 *         日期：2018/4/20 18:05
 *         </p>
 *         描述：
 */
public class DailyGroupPositionModel extends BaseModel {

    private static final long serialVersionUID = 5021749547477975921L;
    private String corpName;
    private String corpCode;
    private String cdName;
    private String cdCode;
    private String indexCode;
    private BigDecimal futuresPosition;
    private BigDecimal spotPosition;
    private BigDecimal totalPosition;
    private BigDecimal deltaPosition;
    private BigDecimal rate;

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getCdName() {
        return cdName;
    }

    public void setCdName(String cdName) {
        this.cdName = cdName;
    }

    public BigDecimal getFuturesPosition() {
        return futuresPosition;
    }

    public void setFuturesPosition(BigDecimal futuresPosition) {
        this.futuresPosition = futuresPosition;
    }

    public BigDecimal getSpotPosition() {
        return spotPosition;
    }

    public void setSpotPosition(BigDecimal spotPosition) {
        this.spotPosition = spotPosition;
    }

    public BigDecimal getTotalPosition() {
        return totalPosition;
    }

    public void setTotalPosition(BigDecimal totalPosition) {
        this.totalPosition = totalPosition;
    }

    public BigDecimal getDeltaPosition() {
        return deltaPosition;
    }

    public void setDeltaPosition(BigDecimal deltaPosition) {
        this.deltaPosition = deltaPosition;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getCorpCode() {
        return corpCode;
    }

    public void setCorpCode(String corpCode) {
        this.corpCode = corpCode;
    }

    public String getCdCode() {
        return cdCode;
    }

    public void setCdCode(String cdCode) {
        this.cdCode = cdCode;
    }

    public String getIndexCode() {
        return indexCode;
    }

    public void setIndexCode(String indexCode) {
        this.indexCode = indexCode;
    }
}
