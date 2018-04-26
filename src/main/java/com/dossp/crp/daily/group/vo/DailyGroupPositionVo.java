/**
 * @copy right Dossp Company All rights reserved
 * @Title: DailyGroupPositionVo.java
 * @Date: 2018/4/23 18:39
 * @Package com.dossp.crp.daily.group.vo
 */
package com.dossp.crp.daily.group.vo;

import com.dossp.common.model.BaseModel;

/**
 * @author weihh
 *         </p>
 *         日期：2018/4/23 18:39
 *         </p>
 *         描述：
 */
public class DailyGroupPositionVo extends BaseModel {

    private static final long serialVersionUID = 6139727227530923501L;

    private String corpCode;
    private String cdCode;
    private String tradeDate;
    private String indexProperty;

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

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getIndexProperty() {
        return indexProperty;
    }

    public void setIndexProperty(String indexProperty) {
        this.indexProperty = indexProperty;
    }
}
