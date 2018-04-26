package com.dossp.crp.market.pnl.model;

import java.math.BigDecimal;

import javax.persistence.*;

import com.dossp.common.model.BaseModel;

/**
 * @author wulei
 *         </p>
 *         日期：2018/3/30 15:36
 *         </p>
 *         描述：
 */
public class DailyCdPnlModel extends BaseModel{
	
	private static final long serialVersionUID = 1247285798891722306L;
	
	@Id
	private Long id;

    @Column(name = "data_date")
    private String dataDate;
    
    /**
     * 品种名称
     */
    @Column(name = "cd_name")
    private String cdName;
    
    /**
     * 现货浮动
     */
    @Column(name = "spot_floating_pnl_amt")
    private BigDecimal spotFloatingPnlAmt;
    
    /**
     * 现货毛利
     */
    @Column(name = "spot_realized_pnl_amt")
    private BigDecimal spotRealizedPnlAmt;
    
    /**
     * 现货总盈亏
     */
    @Column(name = "spot_all_pnl_amt")
    private BigDecimal spotAllPnlAmt;
    
    /**
     * 期货浮动
     */
    @Column(name = "total_floating_pnl_amt")
    private BigDecimal totalFloatingPnlAmt;
    
    /**
     * 期货平仓
     */
    @Column(name = "total_offset_pnl_amt")
    private BigDecimal totalOffsetPnlAmt;
    
    /**
     * 期货总盈亏
     */
    @Column(name = "futures_all_pnl_amt")
    private BigDecimal futuresAllPnlAmt;
    
    /**
     * 业务盈亏
     */
    @Column(name = "all_pnl_amt")
    private BigDecimal allPnlAmt;
    /**
     * 业务盈亏
     */
    @Column(name = "var")
    private String var;
    
    public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}

	/**
     * 变动值
     */
    private BigDecimal subPnlAmt;
    
	public BigDecimal getSubPnlAmt() {
		return subPnlAmt;
	}

	public void setSubPnlAmt(BigDecimal subPnlAmt) {
		this.subPnlAmt = subPnlAmt;
	}

	/**
     * @return data_date
     */
    public String getDataDate() {
        return dataDate;
    }

    /**
     * @param dataDate
     */
    public void setDataDate(String dataDate) {
        this.dataDate = dataDate;
    }

    /**
     * @return cd_name1
     */
    public String getCdName() {
        return cdName;
    }

    /**
     * @param cdName1
     */
    public void setCdName(String cdName) {
        this.cdName = cdName;
    }

	public BigDecimal getSpotFloatingPnlAmt() {
		return spotFloatingPnlAmt;
	}

	public void setSpotFloatingPnlAmt(BigDecimal spotFloatingPnlAmt) {
		this.spotFloatingPnlAmt = spotFloatingPnlAmt;
	}

	public BigDecimal getSpotRealizedPnlAmt() {
		return spotRealizedPnlAmt;
	}

	public void setSpotRealizedPnlAmt(BigDecimal spotRealizedPnlAmt) {
		this.spotRealizedPnlAmt = spotRealizedPnlAmt;
	}

	public BigDecimal getSpotAllPnlAmt() {
		return spotAllPnlAmt;
	}

	public void setSpotAllPnlAmt(BigDecimal spotAllPnlAmt) {
		this.spotAllPnlAmt = spotAllPnlAmt;
	}

	public BigDecimal getTotalFloatingPnlAmt() {
		return totalFloatingPnlAmt;
	}

	public void setTotalFloatingPnlAmt(BigDecimal totalFloatingPnlAmt) {
		this.totalFloatingPnlAmt = totalFloatingPnlAmt;
	}

	public BigDecimal getTotalOffsetPnlAmt() {
		return totalOffsetPnlAmt;
	}

	public void setTotalOffsetPnlAmt(BigDecimal totalOffsetPnlAmt) {
		this.totalOffsetPnlAmt = totalOffsetPnlAmt;
	}

	public BigDecimal getFuturesAllPnlAmt() {
		return futuresAllPnlAmt;
	}

	public void setFuturesAllPnlAmt(BigDecimal futuresAllPnlAmt) {
		this.futuresAllPnlAmt = futuresAllPnlAmt;
	}

	public BigDecimal getAllPnlAmt() {
		return allPnlAmt;
	}

	public void setAllPnlAmt(BigDecimal allPnlAmt) {
		this.allPnlAmt = allPnlAmt;
	}
    
}