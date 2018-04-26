/**
 * @copy right Dossp Company All rights reserved
 * @Title: CdExposurePositionModel.java
 * @Date: 2018/3/28 10:25
 * @Package com.dossp.crp.market.commodities.cd.exposure.model
 */
package com.dossp.crp.market.pnl.model;

import com.dossp.common.model.BaseModel;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author weihh
 *         </p>
 *         日期：2018/3/28 10:25
 *         </p>
 *         描述：
 */
public class MarketPnlModel extends BaseModel {

    private static final long serialVersionUID = -7486194957581458774L;
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;
    //粕类
    private BigDecimal pulpSpotPosition;
    private BigDecimal pulpFuturesPosition;
    private BigDecimal pulpTotalPosition;
    //豆油
    private BigDecimal soyBeanSpotPosition;
    private BigDecimal soyBeanFuturesPosition;
    private BigDecimal soyBeanTotalPosition;
    //菜油
    private BigDecimal vegetableSpotPosition;
    private BigDecimal vegetableFuturesPosition;
    private BigDecimal vegetableTotalPosition;
    //棕榈油
    private BigDecimal palmSpotPosition;
    private BigDecimal palmFuturesPosition;
    private BigDecimal palmTotalPosition;
    //油籽类
    private BigDecimal oilSeedSpotPosition;
    private BigDecimal oilSeedFuturesPosition;
    private BigDecimal oilSeedTotalPosition;
    //玉米
    private BigDecimal cornSpotPosition;
    private BigDecimal cornFuturesPosition;
    private BigDecimal cornTotalPosition;
    //玉米淀粉
    private BigDecimal cornStarchSpotPosition;
    private BigDecimal cornStarchFuturesPosition;
    private BigDecimal cornStarchTotalPosition;
    //小麦
    private BigDecimal wheatSpotPosition;
    private BigDecimal wheatFuturesPosition;
    private BigDecimal wheatTotalPosition;
    //糖
    private BigDecimal sugarSpotPosition;
    private BigDecimal sugarFuturesPosition;
    private BigDecimal sugarTotalPosition;
    //棉花
    private BigDecimal cottonSpotPosition;
    private BigDecimal cottonFuturesPosition;
    private BigDecimal cottonTotalPosition;
    //稻谷
    private BigDecimal riceSpotPosition;
    private BigDecimal riceFuturesPosition;
    private BigDecimal riceTotalPosition;

    //粕类cil
    private BigDecimal cilPulpSpotPosition;
    private BigDecimal cilPulpFuturesPosition;
    private BigDecimal cilPulpTotalPosition;
    //植物油cil
    private BigDecimal cilVegetableSpotPosition;
    private BigDecimal cilVegetableFuturesPosition;
    private BigDecimal cilVegetableTotalPosition;
    //软商品油籽cil
    private BigDecimal cilOilSeedSpotPosition;
    private BigDecimal cilOilSeedFuturesPosition;
    private BigDecimal cilOilSeedTotalPosition;
    //大豆&油籽压榨cil
    private BigDecimal cilSqueezeSpotPosition;
    private BigDecimal cilSqueezeFuturesPosition;
    private BigDecimal cilSqueezeTotalPosition;
    //玉米高粱cil
    private BigDecimal cilCornSpotPosition;
    private BigDecimal cilCornFuturesPosition;
    private BigDecimal cilCornTotalPosition;
    //小麦cil
    private BigDecimal cilWheatSpotPosition;
    private BigDecimal cilWheatFuturesPosition;
    private BigDecimal cilWheatTotalPosition;
    //糖cil
    private BigDecimal cilSugarSpotPosition;
    private BigDecimal cilSugarFuturesPosition;
    private BigDecimal cilSugarTotalPosition;
    //棉花cil
    private BigDecimal cilCottonSpotPosition;
    private BigDecimal cilCottonFuturesPosition;
    private BigDecimal cilCottonTotalPosition;
    //咖啡cil
    private BigDecimal cilCoffeeSpotPosition;
    private BigDecimal cilCoffeeFuturesPosition;
    private BigDecimal cilCoffeeTotalPosition;
    //运费敞口cil
    private BigDecimal cilFreightSpotPosition;
    private BigDecimal cilFreightFuturesPosition;
    private BigDecimal cilFreightTotalPosition;

    @Column(name = "cd_name")
    private String cdName;
    @Column(name = "all_pnl_amt")
    private BigDecimal allPnlAmt;
    private BigDecimal subPnlAmt1;
    private BigDecimal subPnlAmt2;
    private BigDecimal subPnlAmt3;
    private BigDecimal subPnlAmt4;
    private BigDecimal subPnlAmt5;
    private BigDecimal subPnlAmt6;
    private BigDecimal subPnlAmt7;
    private BigDecimal subPnlAmt8;
    private BigDecimal subPnlAmt9;
    private BigDecimal subPnlAmt10;
    private BigDecimal subPnlAmt11;
    
    
    
    public BigDecimal getSubPnlAmt1() {
		return subPnlAmt1;
	}

	public void setSubPnlAmt1(BigDecimal subPnlAmt1) {
		this.subPnlAmt1 = subPnlAmt1;
	}

	public BigDecimal getSubPnlAmt2() {
		return subPnlAmt2;
	}

	public void setSubPnlAmt2(BigDecimal subPnlAmt2) {
		this.subPnlAmt2 = subPnlAmt2;
	}

	public BigDecimal getSubPnlAmt3() {
		return subPnlAmt3;
	}

	public void setSubPnlAmt3(BigDecimal subPnlAmt3) {
		this.subPnlAmt3 = subPnlAmt3;
	}

	public BigDecimal getSubPnlAmt4() {
		return subPnlAmt4;
	}

	public void setSubPnlAmt4(BigDecimal subPnlAmt4) {
		this.subPnlAmt4 = subPnlAmt4;
	}

	public BigDecimal getSubPnlAmt5() {
		return subPnlAmt5;
	}

	public void setSubPnlAmt5(BigDecimal subPnlAmt5) {
		this.subPnlAmt5 = subPnlAmt5;
	}

	public BigDecimal getSubPnlAmt6() {
		return subPnlAmt6;
	}

	public void setSubPnlAmt6(BigDecimal subPnlAmt6) {
		this.subPnlAmt6 = subPnlAmt6;
	}

	public BigDecimal getSubPnlAmt7() {
		return subPnlAmt7;
	}

	public void setSubPnlAmt7(BigDecimal subPnlAmt7) {
		this.subPnlAmt7 = subPnlAmt7;
	}

	public BigDecimal getSubPnlAmt8() {
		return subPnlAmt8;
	}

	public void setSubPnlAmt8(BigDecimal subPnlAmt8) {
		this.subPnlAmt8 = subPnlAmt8;
	}

	public BigDecimal getSubPnlAmt9() {
		return subPnlAmt9;
	}

	public void setSubPnlAmt9(BigDecimal subPnlAmt9) {
		this.subPnlAmt9 = subPnlAmt9;
	}

	public BigDecimal getSubPnlAmt10() {
		return subPnlAmt10;
	}

	public void setSubPnlAmt10(BigDecimal subPnlAmt10) {
		this.subPnlAmt10 = subPnlAmt10;
	}

	public BigDecimal getSubPnlAmt11() {
		return subPnlAmt11;
	}

	public void setSubPnlAmt11(BigDecimal subPnlAmt11) {
		this.subPnlAmt11 = subPnlAmt11;
	}

	public String getCdName() {
		return cdName;
	}

	public void setCdName(String cdName) {
		this.cdName = cdName;
	}

	public BigDecimal getAllPnlAmt() {
		return allPnlAmt;
	}

	public void setAllPnlAmt(BigDecimal allPnlAmt) {
		this.allPnlAmt = allPnlAmt;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPulpSpotPosition() {
        return pulpSpotPosition;
    }

    public void setPulpSpotPosition(BigDecimal pulpSpotPosition) {
        this.pulpSpotPosition = pulpSpotPosition;
    }

    public BigDecimal getPulpFuturesPosition() {
        return pulpFuturesPosition;
    }

    public void setPulpFuturesPosition(BigDecimal pulpFuturesPosition) {
        this.pulpFuturesPosition = pulpFuturesPosition;
    }

    public BigDecimal getPulpTotalPosition() {
        return pulpTotalPosition;
    }

    public void setPulpTotalPosition(BigDecimal pulpTotalPosition) {
        this.pulpTotalPosition = pulpTotalPosition;
    }

    public BigDecimal getSoyBeanSpotPosition() {
        return soyBeanSpotPosition;
    }

    public void setSoyBeanSpotPosition(BigDecimal soyBeanSpotPosition) {
        this.soyBeanSpotPosition = soyBeanSpotPosition;
    }

    public BigDecimal getSoyBeanFuturesPosition() {
        return soyBeanFuturesPosition;
    }

    public void setSoyBeanFuturesPosition(BigDecimal soyBeanFuturesPosition) {
        this.soyBeanFuturesPosition = soyBeanFuturesPosition;
    }

    public BigDecimal getSoyBeanTotalPosition() {
        return soyBeanTotalPosition;
    }

    public void setSoyBeanTotalPosition(BigDecimal soyBeanTotalPosition) {
        this.soyBeanTotalPosition = soyBeanTotalPosition;
    }

    public BigDecimal getVegetableSpotPosition() {
        return vegetableSpotPosition;
    }

    public void setVegetableSpotPosition(BigDecimal vegetableSpotPosition) {
        this.vegetableSpotPosition = vegetableSpotPosition;
    }

    public BigDecimal getVegetableFuturesPosition() {
        return vegetableFuturesPosition;
    }

    public void setVegetableFuturesPosition(BigDecimal vegetableFuturesPosition) {
        this.vegetableFuturesPosition = vegetableFuturesPosition;
    }

    public BigDecimal getVegetableTotalPosition() {
        return vegetableTotalPosition;
    }

    public void setVegetableTotalPosition(BigDecimal vegetableTotalPosition) {
        this.vegetableTotalPosition = vegetableTotalPosition;
    }

    public BigDecimal getPalmSpotPosition() {
        return palmSpotPosition;
    }

    public void setPalmSpotPosition(BigDecimal palmSpotPosition) {
        this.palmSpotPosition = palmSpotPosition;
    }

    public BigDecimal getPalmFuturesPosition() {
        return palmFuturesPosition;
    }

    public void setPalmFuturesPosition(BigDecimal palmFuturesPosition) {
        this.palmFuturesPosition = palmFuturesPosition;
    }

    public BigDecimal getPalmTotalPosition() {
        return palmTotalPosition;
    }

    public void setPalmTotalPosition(BigDecimal palmTotalPosition) {
        this.palmTotalPosition = palmTotalPosition;
    }

    public BigDecimal getOilSeedSpotPosition() {
        return oilSeedSpotPosition;
    }

    public void setOilSeedSpotPosition(BigDecimal oilSeedSpotPosition) {
        this.oilSeedSpotPosition = oilSeedSpotPosition;
    }

    public BigDecimal getOilSeedFuturesPosition() {
        return oilSeedFuturesPosition;
    }

    public void setOilSeedFuturesPosition(BigDecimal oilSeedFuturesPosition) {
        this.oilSeedFuturesPosition = oilSeedFuturesPosition;
    }

    public BigDecimal getOilSeedTotalPosition() {
        return oilSeedTotalPosition;
    }

    public void setOilSeedTotalPosition(BigDecimal oilSeedTotalPosition) {
        this.oilSeedTotalPosition = oilSeedTotalPosition;
    }

    public BigDecimal getCornSpotPosition() {
        return cornSpotPosition;
    }

    public void setCornSpotPosition(BigDecimal cornSpotPosition) {
        this.cornSpotPosition = cornSpotPosition;
    }

    public BigDecimal getCornFuturesPosition() {
        return cornFuturesPosition;
    }

    public void setCornFuturesPosition(BigDecimal cornFuturesPosition) {
        this.cornFuturesPosition = cornFuturesPosition;
    }

    public BigDecimal getCornTotalPosition() {
        return cornTotalPosition;
    }

    public void setCornTotalPosition(BigDecimal cornTotalPosition) {
        this.cornTotalPosition = cornTotalPosition;
    }

    public BigDecimal getCornStarchSpotPosition() {
        return cornStarchSpotPosition;
    }

    public void setCornStarchSpotPosition(BigDecimal cornStarchSpotPosition) {
        this.cornStarchSpotPosition = cornStarchSpotPosition;
    }

    public BigDecimal getCornStarchFuturesPosition() {
        return cornStarchFuturesPosition;
    }

    public void setCornStarchFuturesPosition(BigDecimal cornStarchFuturesPosition) {
        this.cornStarchFuturesPosition = cornStarchFuturesPosition;
    }

    public BigDecimal getCornStarchTotalPosition() {
        return cornStarchTotalPosition;
    }

    public void setCornStarchTotalPosition(BigDecimal cornStarchTotalPosition) {
        this.cornStarchTotalPosition = cornStarchTotalPosition;
    }

    public BigDecimal getWheatSpotPosition() {
        return wheatSpotPosition;
    }

    public void setWheatSpotPosition(BigDecimal wheatSpotPosition) {
        this.wheatSpotPosition = wheatSpotPosition;
    }

    public BigDecimal getWheatFuturesPosition() {
        return wheatFuturesPosition;
    }

    public void setWheatFuturesPosition(BigDecimal wheatFuturesPosition) {
        this.wheatFuturesPosition = wheatFuturesPosition;
    }

    public BigDecimal getWheatTotalPosition() {
        return wheatTotalPosition;
    }

    public void setWheatTotalPosition(BigDecimal wheatTotalPosition) {
        this.wheatTotalPosition = wheatTotalPosition;
    }

    public BigDecimal getSugarSpotPosition() {
        return sugarSpotPosition;
    }

    public void setSugarSpotPosition(BigDecimal sugarSpotPosition) {
        this.sugarSpotPosition = sugarSpotPosition;
    }

    public BigDecimal getSugarFuturesPosition() {
        return sugarFuturesPosition;
    }

    public void setSugarFuturesPosition(BigDecimal sugarFuturesPosition) {
        this.sugarFuturesPosition = sugarFuturesPosition;
    }

    public BigDecimal getSugarTotalPosition() {
        return sugarTotalPosition;
    }

    public void setSugarTotalPosition(BigDecimal sugarTotalPosition) {
        this.sugarTotalPosition = sugarTotalPosition;
    }

    public BigDecimal getCottonSpotPosition() {
        return cottonSpotPosition;
    }

    public void setCottonSpotPosition(BigDecimal cottonSpotPosition) {
        this.cottonSpotPosition = cottonSpotPosition;
    }

    public BigDecimal getCottonFuturesPosition() {
        return cottonFuturesPosition;
    }

    public void setCottonFuturesPosition(BigDecimal cottonFuturesPosition) {
        this.cottonFuturesPosition = cottonFuturesPosition;
    }

    public BigDecimal getCottonTotalPosition() {
        return cottonTotalPosition;
    }

    public void setCottonTotalPosition(BigDecimal cottonTotalPosition) {
        this.cottonTotalPosition = cottonTotalPosition;
    }

    public BigDecimal getRiceSpotPosition() {
        return riceSpotPosition;
    }

    public void setRiceSpotPosition(BigDecimal riceSpotPosition) {
        this.riceSpotPosition = riceSpotPosition;
    }

    public BigDecimal getRiceFuturesPosition() {
        return riceFuturesPosition;
    }

    public void setRiceFuturesPosition(BigDecimal riceFuturesPosition) {
        this.riceFuturesPosition = riceFuturesPosition;
    }

    public BigDecimal getRiceTotalPosition() {
        return riceTotalPosition;
    }

    public void setRiceTotalPosition(BigDecimal riceTotalPosition) {
        this.riceTotalPosition = riceTotalPosition;
    }

    public BigDecimal getCilPulpSpotPosition() {
        return cilPulpSpotPosition;
    }

    public void setCilPulpSpotPosition(BigDecimal cilPulpSpotPosition) {
        this.cilPulpSpotPosition = cilPulpSpotPosition;
    }

    public BigDecimal getCilPulpFuturesPosition() {
        return cilPulpFuturesPosition;
    }

    public void setCilPulpFuturesPosition(BigDecimal cilPulpFuturesPosition) {
        this.cilPulpFuturesPosition = cilPulpFuturesPosition;
    }

    public BigDecimal getCilPulpTotalPosition() {
        return cilPulpTotalPosition;
    }

    public void setCilPulpTotalPosition(BigDecimal cilPulpTotalPosition) {
        this.cilPulpTotalPosition = cilPulpTotalPosition;
    }

    public BigDecimal getCilVegetableSpotPosition() {
        return cilVegetableSpotPosition;
    }

    public void setCilVegetableSpotPosition(BigDecimal cilVegetableSpotPosition) {
        this.cilVegetableSpotPosition = cilVegetableSpotPosition;
    }

    public BigDecimal getCilVegetableFuturesPosition() {
        return cilVegetableFuturesPosition;
    }

    public void setCilVegetableFuturesPosition(BigDecimal cilVegetableFuturesPosition) {
        this.cilVegetableFuturesPosition = cilVegetableFuturesPosition;
    }

    public BigDecimal getCilVegetableTotalPosition() {
        return cilVegetableTotalPosition;
    }

    public void setCilVegetableTotalPosition(BigDecimal cilVegetableTotalPosition) {
        this.cilVegetableTotalPosition = cilVegetableTotalPosition;
    }

    public BigDecimal getCilOilSeedSpotPosition() {
        return cilOilSeedSpotPosition;
    }

    public void setCilOilSeedSpotPosition(BigDecimal cilOilSeedSpotPosition) {
        this.cilOilSeedSpotPosition = cilOilSeedSpotPosition;
    }

    public BigDecimal getCilOilSeedFuturesPosition() {
        return cilOilSeedFuturesPosition;
    }

    public void setCilOilSeedFuturesPosition(BigDecimal cilOilSeedFuturesPosition) {
        this.cilOilSeedFuturesPosition = cilOilSeedFuturesPosition;
    }

    public BigDecimal getCilOilSeedTotalPosition() {
        return cilOilSeedTotalPosition;
    }

    public void setCilOilSeedTotalPosition(BigDecimal cilOilSeedTotalPosition) {
        this.cilOilSeedTotalPosition = cilOilSeedTotalPosition;
    }

    public BigDecimal getCilSqueezeSpotPosition() {
        return cilSqueezeSpotPosition;
    }

    public void setCilSqueezeSpotPosition(BigDecimal cilSqueezeSpotPosition) {
        this.cilSqueezeSpotPosition = cilSqueezeSpotPosition;
    }

    public BigDecimal getCilSqueezeFuturesPosition() {
        return cilSqueezeFuturesPosition;
    }

    public void setCilSqueezeFuturesPosition(BigDecimal cilSqueezeFuturesPosition) {
        this.cilSqueezeFuturesPosition = cilSqueezeFuturesPosition;
    }

    public BigDecimal getCilSqueezeTotalPosition() {
        return cilSqueezeTotalPosition;
    }

    public void setCilSqueezeTotalPosition(BigDecimal cilSqueezeTotalPosition) {
        this.cilSqueezeTotalPosition = cilSqueezeTotalPosition;
    }

    public BigDecimal getCilCornSpotPosition() {
        return cilCornSpotPosition;
    }

    public void setCilCornSpotPosition(BigDecimal cilCornSpotPosition) {
        this.cilCornSpotPosition = cilCornSpotPosition;
    }

    public BigDecimal getCilCornFuturesPosition() {
        return cilCornFuturesPosition;
    }

    public void setCilCornFuturesPosition(BigDecimal cilCornFuturesPosition) {
        this.cilCornFuturesPosition = cilCornFuturesPosition;
    }

    public BigDecimal getCilCornTotalPosition() {
        return cilCornTotalPosition;
    }

    public void setCilCornTotalPosition(BigDecimal cilCornTotalPosition) {
        this.cilCornTotalPosition = cilCornTotalPosition;
    }

    public BigDecimal getCilWheatSpotPosition() {
        return cilWheatSpotPosition;
    }

    public void setCilWheatSpotPosition(BigDecimal cilWheatSpotPosition) {
        this.cilWheatSpotPosition = cilWheatSpotPosition;
    }

    public BigDecimal getCilWheatFuturesPosition() {
        return cilWheatFuturesPosition;
    }

    public void setCilWheatFuturesPosition(BigDecimal cilWheatFuturesPosition) {
        this.cilWheatFuturesPosition = cilWheatFuturesPosition;
    }

    public BigDecimal getCilWheatTotalPosition() {
        return cilWheatTotalPosition;
    }

    public void setCilWheatTotalPosition(BigDecimal cilWheatTotalPosition) {
        this.cilWheatTotalPosition = cilWheatTotalPosition;
    }

    public BigDecimal getCilSugarSpotPosition() {
        return cilSugarSpotPosition;
    }

    public void setCilSugarSpotPosition(BigDecimal cilSugarSpotPosition) {
        this.cilSugarSpotPosition = cilSugarSpotPosition;
    }

    public BigDecimal getCilSugarFuturesPosition() {
        return cilSugarFuturesPosition;
    }

    public void setCilSugarFuturesPosition(BigDecimal cilSugarFuturesPosition) {
        this.cilSugarFuturesPosition = cilSugarFuturesPosition;
    }

    public BigDecimal getCilSugarTotalPosition() {
        return cilSugarTotalPosition;
    }

    public void setCilSugarTotalPosition(BigDecimal cilSugarTotalPosition) {
        this.cilSugarTotalPosition = cilSugarTotalPosition;
    }

    public BigDecimal getCilCottonSpotPosition() {
        return cilCottonSpotPosition;
    }

    public void setCilCottonSpotPosition(BigDecimal cilCottonSpotPosition) {
        this.cilCottonSpotPosition = cilCottonSpotPosition;
    }

    public BigDecimal getCilCottonFuturesPosition() {
        return cilCottonFuturesPosition;
    }

    public void setCilCottonFuturesPosition(BigDecimal cilCottonFuturesPosition) {
        this.cilCottonFuturesPosition = cilCottonFuturesPosition;
    }

    public BigDecimal getCilCottonTotalPosition() {
        return cilCottonTotalPosition;
    }

    public void setCilCottonTotalPosition(BigDecimal cilCottonTotalPosition) {
        this.cilCottonTotalPosition = cilCottonTotalPosition;
    }

    public BigDecimal getCilCoffeeSpotPosition() {
        return cilCoffeeSpotPosition;
    }

    public void setCilCoffeeSpotPosition(BigDecimal cilCoffeeSpotPosition) {
        this.cilCoffeeSpotPosition = cilCoffeeSpotPosition;
    }

    public BigDecimal getCilCoffeeFuturesPosition() {
        return cilCoffeeFuturesPosition;
    }

    public void setCilCoffeeFuturesPosition(BigDecimal cilCoffeeFuturesPosition) {
        this.cilCoffeeFuturesPosition = cilCoffeeFuturesPosition;
    }

    public BigDecimal getCilCoffeeTotalPosition() {
        return cilCoffeeTotalPosition;
    }

    public void setCilCoffeeTotalPosition(BigDecimal cilCoffeeTotalPosition) {
        this.cilCoffeeTotalPosition = cilCoffeeTotalPosition;
    }

    public BigDecimal getCilFreightSpotPosition() {
        return cilFreightSpotPosition;
    }

    public void setCilFreightSpotPosition(BigDecimal cilFreightSpotPosition) {
        this.cilFreightSpotPosition = cilFreightSpotPosition;
    }

    public BigDecimal getCilFreightFuturesPosition() {
        return cilFreightFuturesPosition;
    }

    public void setCilFreightFuturesPosition(BigDecimal cilFreightFuturesPosition) {
        this.cilFreightFuturesPosition = cilFreightFuturesPosition;
    }

    public BigDecimal getCilFreightTotalPosition() {
        return cilFreightTotalPosition;
    }

    public void setCilFreightTotalPosition(BigDecimal cilFreightTotalPosition) {
        this.cilFreightTotalPosition = cilFreightTotalPosition;
    }
}
