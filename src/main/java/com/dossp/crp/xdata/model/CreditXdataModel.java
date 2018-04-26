package com.dossp.crp.xdata.model;

import java.math.BigDecimal;
import javax.persistence.*;

import com.dossp.common.model.BaseModel;

@Table(name = "v_report_xdata_pct_futures_spot")
public class CreditXdataModel extends BaseModel {
	
	/** 
	 * 
	 * @Fields serialVersionUID
	 */ 
	private static final long serialVersionUID = -8017766577019712471L;

	@Id
    @GeneratedValue(generator = "JDBC")
    private Long id;
	
    @Column(name = "data_date")
    private String dataDate;

    @Column(name = "exchange_name")
    private String exChange;

    @Column(name = "cd_cat_code2")
    private String cdCatCode2;

    @Column(name = "cd_cat_name2")
    private String cdCatName2;

    @Column(name = "cd_code1")
    private String cdCode1;

    @Column(name = "cd_name1")
    private String cdName1;

    private String unit;

    @Column(name = "close_price")
    private BigDecimal closePrice;

    @Column(name = "pct_change_1d")
    private BigDecimal pctChange1d;

    @Column(name = "pct_change_3d")
    private BigDecimal pctChange3d;

    @Column(name = "pct_change_5d")
    private BigDecimal pctChange5d;

    @Column(name = "pct_change_20d")
    private BigDecimal pctChange20d;

    @Column(name = "pct_change_year")
    private BigDecimal pctChangeYear;

    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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


    public String getExChange() {
		return exChange;
	}

	public void setExChange(String exChange) {
		this.exChange = exChange;
	}

	/**
     * @return cd_cat_code2
     */
    public String getCdCatCode2() {
        return cdCatCode2;
    }

    /**
     * @param cdCatCode2
     */
    public void setCdCatCode2(String cdCatCode2) {
        this.cdCatCode2 = cdCatCode2;
    }

    /**
     * @return cd_cat_name2
     */
    public String getCdCatName2() {
        return cdCatName2;
    }

    /**
     * @param cdCatName2
     */
    public void setCdCatName2(String cdCatName2) {
        this.cdCatName2 = cdCatName2;
    }

    /**
     * @return cd_code1
     */
    public String getCdCode1() {
        return cdCode1;
    }

    /**
     * @param cdCode1
     */
    public void setCdCode1(String cdCode1) {
        this.cdCode1 = cdCode1;
    }

    /**
     * @return cd_name1
     */
    public String getCdName1() {
        return cdName1;
    }

    /**
     * @param cdName1
     */
    public void setCdName1(String cdName1) {
        this.cdName1 = cdName1;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return close_price
     */
    public BigDecimal getClosePrice() {
        return closePrice;
    }

    /**
     * @param closePrice
     */
    public void setClosePrice(BigDecimal closePrice) {
        this.closePrice = closePrice;
    }

    /**
     * @return pct_change_1d
     */
    public BigDecimal getPctChange1d() {
        return pctChange1d;
    }

    /**
     * @param pctChange1d
     */
    public void setPctChange1d(BigDecimal pctChange1d) {
        this.pctChange1d = pctChange1d;
    }

    /**
     * @return pct_change_3d
     */
    public BigDecimal getPctChange3d() {
        return pctChange3d;
    }

    /**
     * @param pctChange3d
     */
    public void setPctChange3d(BigDecimal pctChange3d) {
        this.pctChange3d = pctChange3d;
    }

    /**
     * @return pct_change_5d
     */
    public BigDecimal getPctChange5d() {
        return pctChange5d;
    }

    /**
     * @param pctChange5d
     */
    public void setPctChange5d(BigDecimal pctChange5d) {
        this.pctChange5d = pctChange5d;
    }

    /**
     * @return pct_change_20d
     */
    public BigDecimal getPctChange20d() {
        return pctChange20d;
    }

    /**
     * @param pctChange20d
     */
    public void setPctChange20d(BigDecimal pctChange20d) {
        this.pctChange20d = pctChange20d;
    }

    /**
     * @return pct_change_year
     */
    public BigDecimal getPctChangeYear() {
        return pctChangeYear;
    }

    /**
     * @param pctChangeYear
     */
    public void setPctChangeYear(BigDecimal pctChangeYear) {
        this.pctChangeYear = pctChangeYear;
    }
}