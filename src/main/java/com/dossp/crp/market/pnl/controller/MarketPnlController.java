/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: MarketPnlController.java 
 *
 * @Date:  2018年4月19日  下午6:03:51
 *
 * @Package com.dossp.crp.market.pnl.controller
 */


package com.dossp.crp.market.pnl.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dossp.common.model.JsonMsg;
import com.dossp.crp.market.pnl.model.DailyCdPnlModel;
import com.dossp.crp.market.pnl.model.MarketPnlModel;
import com.dossp.crp.market.pnl.service.MarketPnlService;
import com.dossp.crp.market.pnl.vo.MarketPnlVo;

/**
 * @author zhoujh
 * 
 * 日期：2018年4月19日 下午6:03:51
 *
 * 描述：
 * @version V1.0
 *
 */
@Controller
@RequestMapping(value = "/api/market/pnl")
public class MarketPnlController{
	
	@Autowired
	private MarketPnlService marketPnlService;
	
	/**
	 * 
	 */
	@RequestMapping(value = "index")
	public String to_list() {
		return "market/pnl";
	}
	
	/**
	 * 
	 */
	@RequestMapping(value = "do_list")
	@ResponseBody
	public JsonMsg do_list(HttpServletRequest request) {
		JsonMsg ret = new JsonMsg();
		List<MarketPnlModel> list = new ArrayList<>();
		String dataDate = marketPnlService.getMaxDate();
		try {
			list = marketPnlService.getData(dataDate);
			List<MarketPnlVo> openList = new ArrayList<>();
			//粕类
			MarketPnlVo data1 = new MarketPnlVo();
			data1.setCdCatName("粕类");
			data1.setPulpFuturesPosition(list.get(0).getPulpFuturesPosition().toString());
			data1.setPulpSpotPosition(list.get(0).getPulpSpotPosition().toString());
			data1.setPulpTotalPosition(list.get(0).getPulpTotalPosition().toString());
			if(list.get(0).getSubPnlAmt1().toString().indexOf("-")==-1) {
				data1.setDeltaStatus("up");
			}else {
				data1.setDeltaStatus("down");
			}
			if("0.00".equals(list.get(0).getSubPnlAmt1().toString())){
				data1.setDeltaStatus("flat");
			}
			data1.setDelta(list.get(0).getSubPnlAmt1().toString());
			openList.add(data1);
			//豆油
			MarketPnlVo data2 = new MarketPnlVo();
			data2.setCdCatName("豆油");
			data2.setPulpFuturesPosition(list.get(0).getSoyBeanFuturesPosition().toString());
			data2.setPulpSpotPosition(list.get(0).getSoyBeanSpotPosition().toString());
			data2.setPulpTotalPosition(list.get(0).getSoyBeanTotalPosition().toString());
			if(list.get(0).getSubPnlAmt2().toString().indexOf("-")==-1) {
				data2.setDeltaStatus("up");
			}else {
				data2.setDeltaStatus("down");
			}
			if("0.00".equals(list.get(0).getSubPnlAmt2().toString())){
				data2.setDeltaStatus("flat");
			}
			data2.setDelta(list.get(0).getSubPnlAmt2().toString());
			openList.add(data2);
			//菜油
			MarketPnlVo data3 = new MarketPnlVo();
			data3.setCdCatName("菜油");
			data3.setPulpFuturesPosition(list.get(0).getVegetableFuturesPosition().toString());
			data3.setPulpSpotPosition(list.get(0).getVegetableSpotPosition().toString());
			data3.setPulpTotalPosition(list.get(0).getVegetableTotalPosition().toString());
			if(list.get(0).getSubPnlAmt3().toString().indexOf("-")==-1) {
				data3.setDeltaStatus("up");
			}else {
				data3.setDeltaStatus("down");
			}
			if("0.00".equals(list.get(0).getSubPnlAmt3().toString())){
				data3.setDeltaStatus("flat");
			}
			data3.setDelta(list.get(0).getSubPnlAmt3().toString());
			openList.add(data3);
			//棕榈油
			MarketPnlVo data4 = new MarketPnlVo();
			data4.setCdCatName("棕榈油");
			data4.setPulpFuturesPosition(list.get(0).getPalmFuturesPosition().toString());
			data4.setPulpSpotPosition(list.get(0).getPalmSpotPosition().toString());
			data4.setPulpTotalPosition(list.get(0).getPalmTotalPosition().toString());
			if(list.get(0).getSubPnlAmt4().toString().indexOf("-")==-1) {
				data4.setDeltaStatus("up");
			}else {
				data4.setDeltaStatus("down");
			}
			if("0.00".equals(list.get(0).getSubPnlAmt4().toString())){
				data4.setDeltaStatus("flat");
			}
			data4.setDelta(list.get(0).getSubPnlAmt4().toString());
			openList.add(data4);
			//油籽类
			MarketPnlVo data5 = new MarketPnlVo();
			data5.setCdCatName("油籽类");
			data5.setPulpFuturesPosition(list.get(0).getOilSeedFuturesPosition().toString());
			data5.setPulpSpotPosition(list.get(0).getOilSeedSpotPosition().toString());
			data5.setPulpTotalPosition(list.get(0).getOilSeedTotalPosition().toString());
			if(list.get(0).getSubPnlAmt5().toString().indexOf("-")==-1) {
				data5.setDeltaStatus("up");
			}else {
				data5.setDeltaStatus("down");
			}
			if("0.00".equals(list.get(0).getSubPnlAmt5().toString())){
				data5.setDeltaStatus("flat");
			}
			data5.setDelta(list.get(0).getSubPnlAmt5().toString());
			openList.add(data5);
			//玉米
			MarketPnlVo data6 = new MarketPnlVo();
			data6.setCdCatName("玉米");
			data6.setPulpFuturesPosition(list.get(0).getCornFuturesPosition().toString());
			data6.setPulpSpotPosition(list.get(0).getCornSpotPosition().toString());
			data6.setPulpTotalPosition(list.get(0).getCornTotalPosition().toString());
			if(list.get(0).getSubPnlAmt6().toString().indexOf("-")==-1) {
				data6.setDeltaStatus("up");
			}else {
				data6.setDeltaStatus("down");
			}
			if("0.00".equals(list.get(0).getSubPnlAmt6().toString())){
				data6.setDeltaStatus("flat");
			}
			data6.setDelta(list.get(0).getSubPnlAmt6().toString());
			openList.add(data6);
			//玉米淀粉
			MarketPnlVo data7 = new MarketPnlVo();
			data7.setCdCatName("玉米淀粉");
			data7.setPulpFuturesPosition(list.get(0).getCornStarchFuturesPosition().toString());
			data7.setPulpSpotPosition(list.get(0).getCornStarchSpotPosition().toString());
			data7.setPulpTotalPosition(list.get(0).getCornStarchTotalPosition().toString());
			if(list.get(0).getSubPnlAmt7().toString().indexOf("-")==-1) {
				data7.setDeltaStatus("up");
			}else {
				data7.setDeltaStatus("down");
			}
			if("0.00".equals(list.get(0).getSubPnlAmt7().toString())){
				data7.setDeltaStatus("flat");
			}
			data7.setDelta(list.get(0).getSubPnlAmt7().toString());
			openList.add(data7);
			//小麦
			MarketPnlVo data8 = new MarketPnlVo();
			data8.setCdCatName("小麦");
			data8.setPulpFuturesPosition(list.get(0).getWheatFuturesPosition().toString());
			data8.setPulpSpotPosition(list.get(0).getWheatSpotPosition().toString());
			data8.setPulpTotalPosition(list.get(0).getWheatTotalPosition().toString());
			if(list.get(0).getSubPnlAmt8().toString().indexOf("-")==-1) {
				data8.setDeltaStatus("up");
			}else {
				data8.setDeltaStatus("down");
			}
			if("0.00".equals(list.get(0).getSubPnlAmt8().toString())){
				data8.setDeltaStatus("flat");
			}
			data8.setDelta(list.get(0).getSubPnlAmt8().toString());
			openList.add(data8);
			//糖
			MarketPnlVo data9 = new MarketPnlVo();
			data9.setCdCatName("糖");
			data9.setPulpFuturesPosition(list.get(0).getSugarFuturesPosition().toString());
			data9.setPulpSpotPosition(list.get(0).getSugarSpotPosition().toString());
			data9.setPulpTotalPosition(list.get(0).getSugarTotalPosition().toString());
			if(list.get(0).getSubPnlAmt9().toString().indexOf("-")==-1) {
				data9.setDeltaStatus("up");
			}else {
				data9.setDeltaStatus("down");
			}
			if("0.00".equals(list.get(0).getSubPnlAmt9().toString())){
				data9.setDeltaStatus("flat");
			}
			data9.setDelta(list.get(0).getSubPnlAmt9().toString());
			openList.add(data9);
			//棉花
			MarketPnlVo data10 = new MarketPnlVo();
			data10.setCdCatName("棉花");
			data10.setPulpFuturesPosition(list.get(0).getCottonFuturesPosition().toString());
			data10.setPulpSpotPosition(list.get(0).getCottonSpotPosition().toString());
			data10.setPulpTotalPosition(list.get(0).getCottonTotalPosition().toString());
			if(list.get(0).getSubPnlAmt10().toString().indexOf("-")==-1) {
				data10.setDeltaStatus("up");
			}else {
				data10.setDeltaStatus("down");
			}
			if("0.00".equals(list.get(0).getSubPnlAmt10().toString())){
				data10.setDeltaStatus("flat");
			}
			data10.setDelta(list.get(0).getSubPnlAmt10().toString());
			openList.add(data10);
			//稻谷
			MarketPnlVo data11 = new MarketPnlVo();
			data11.setCdCatName("稻谷");
			data11.setPulpFuturesPosition(list.get(0).getRiceFuturesPosition().toString());
			data11.setPulpSpotPosition(list.get(0).getRiceSpotPosition().toString());
			data11.setPulpTotalPosition(list.get(0).getRiceTotalPosition().toString());
			if(list.get(0).getSubPnlAmt11().toString().indexOf("-")==-1) {
				data11.setDeltaStatus("up");
			}else {
				data11.setDeltaStatus("down");
			}
			if("0.00".equals(list.get(0).getSubPnlAmt11().toString())){
				data11.setDeltaStatus("flat");
			}
			data11.setDelta(list.get(0).getSubPnlAmt11().toString());
			openList.add(data11);
			
			List<DailyCdPnlModel> list1 = new ArrayList<>();
			list1 = marketPnlService.getDataPnl(dataDate);
			List<MarketPnlVo> pnlList = new ArrayList<>();
			for(DailyCdPnlModel m:list1) {
				MarketPnlVo data = new MarketPnlVo();
				data.setCdCatName(m.getCdName());
				data.setFuturesAllPnlAmt(m.getFuturesAllPnlAmt().toString());
				data.setSpotAllPnlAmt(m.getSpotAllPnlAmt().toString());
				data.setAllPnlAmt(m.getAllPnlAmt().toString());
				if(m.getSubPnlAmt().toString().indexOf("-")==-1) {
					data.setDeltaStatus("up");
				}else {
					data.setDeltaStatus("down");
				}
				if("0.00".equals(m.getSubPnlAmt().toString())){
					data.setDeltaStatus("flat");
				}
				data.setDelta(m.getSubPnlAmt().toString());
				pnlList.add(data);
			}
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("dataDate", dataDate);
			map.put("openList", openList);
			map.put("pnlList", pnlList);
			ret.setObj(map);
			ret.setSuccess(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
	
}
