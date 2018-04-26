/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: MarketPnlVo.java 
 *
 * @Date:  2018年4月19日  下午6:04:26
 *
 * @Package com.dossp.crp.market.pnl.vo
 */


package com.dossp.crp.market.pnl.vo;

/**
 * @author zhoujh
 * 
 * 日期：2018年4月19日 下午6:04:26
 *
 * 描述：
 * @version V1.0
 *
 */

public class MarketPnlVo {
	private String cdCatName;
	//头寸
	private String pulpFuturesPosition;
	private String pulpSpotPosition;
	private String pulpTotalPosition;
	private String deltaStatus;
	private String delta;
	//盈亏
	private String futuresAllPnlAmt;
	private String spotAllPnlAmt;
	private String allPnlAmt;
	
	
	public String getFuturesAllPnlAmt() {
		return futuresAllPnlAmt;
	}
	public void setFuturesAllPnlAmt(String futuresAllPnlAmt) {
		this.futuresAllPnlAmt = futuresAllPnlAmt;
	}
	public String getSpotAllPnlAmt() {
		return spotAllPnlAmt;
	}
	public void setSpotAllPnlAmt(String spotAllPnlAmt) {
		this.spotAllPnlAmt = spotAllPnlAmt;
	}
	public String getAllPnlAmt() {
		return allPnlAmt;
	}
	public void setAllPnlAmt(String allPnlAmt) {
		this.allPnlAmt = allPnlAmt;
	}
	public String getCdCatName() {
		return cdCatName;
	}
	public void setCdCatName(String cdCatName) {
		this.cdCatName = cdCatName;
	}
	public String getPulpFuturesPosition() {
		return pulpFuturesPosition;
	}
	public void setPulpFuturesPosition(String pulpFuturesPosition) {
		this.pulpFuturesPosition = pulpFuturesPosition;
	}
	public String getPulpSpotPosition() {
		return pulpSpotPosition;
	}
	public void setPulpSpotPosition(String pulpSpotPosition) {
		this.pulpSpotPosition = pulpSpotPosition;
	}
	public String getPulpTotalPosition() {
		return pulpTotalPosition;
	}
	public void setPulpTotalPosition(String pulpTotalPosition) {
		this.pulpTotalPosition = pulpTotalPosition;
	}
	public String getDeltaStatus() {
		return deltaStatus;
	}
	public void setDeltaStatus(String deltaStatus) {
		this.deltaStatus = deltaStatus;
	}
	public String getDelta() {
		return delta;
	}
	public void setDelta(String delta) {
		this.delta = delta;
	}
	
	
}
