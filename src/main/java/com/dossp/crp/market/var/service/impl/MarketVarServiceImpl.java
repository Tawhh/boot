/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: MarketVarServiceImpl.java 
 *
 * @Date:  2018年4月20日  上午11:53:24
 *
 * @Package com.dossp.crp.market.var.service.impl
 */


package com.dossp.crp.market.var.service.impl;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.dossp.common.util.DateUtil;
import com.dossp.common.util.MathUtil;
import com.dossp.crp.market.var.mapper.MarketVarMapper;
import com.dossp.crp.market.var.model.MarketVarModel;
import com.dossp.crp.market.var.model.MarketVarTableModel;
import com.dossp.crp.market.var.service.MarketVarService;
import com.dossp.crp.market.var.vo.MarketVarChartVo;
import com.dossp.crp.market.var.vo.MarketVarVo;

/**
 * @author wulei
 * 
 * 日期：2018年4月20日 上午11:53:24
 *
 * 描述：
 * @version V1.0
 *
 */
@Service
public class MarketVarServiceImpl implements MarketVarService{

	@Autowired
	private MarketVarMapper mapper;
	
	/** 
	 * @return 
	 */
	@Override
	@Cacheable(cacheNames="MarketVar", key="'MarketVar.getData'")
	public Map<Object, Object> getData() {
		
		MarketVarVo vo = new MarketVarVo();
		String endDate = mapper.findMaxTradeDate();
		
		Calendar calendar = Calendar.getInstance();
		Date date = DateUtil.parseDate(endDate, "yyyy-MM-dd");
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, -1);
        date = calendar.getTime();
        String beginDate = DateUtil.formateDate(date, "yyyy-MM-dd");
        
        vo.setBeginDate(beginDate);
        vo.setEndDate(endDate);
        vo.setCorpCode("C1999");
        
		List<MarketVarModel> data = mapper.getData(vo);
		
		List<String> varPositive = new ArrayList<String>();
		List<String> varNegative = new ArrayList<String>();
		List<String> varLimitPositive = new ArrayList<String>();
		List<String> varLimitNegative = new ArrayList<String>();
		List<String> pnl = new ArrayList<String>();
		
		for (MarketVarModel model : data) {
			if (StringUtils.isBlank(model.getVarPositive())) {
				model.setVarPositive("");
			}
			if (StringUtils.isBlank(model.getVarNegative())) {
				model.setVarNegative("");
			}
			if (StringUtils.isBlank(model.getVarLimitPositive())) {
				model.setVarLimitPositive("");
			}
			if (StringUtils.isBlank(model.getVarLimitNegative())) {
				model.setVarLimitNegative("");
			}
			if (StringUtils.isBlank(model.getPnl())) {
				model.setPnl("");
			}
			varPositive.add(model.getVarPositive());
			varNegative.add(model.getVarNegative());
			varLimitPositive.add(model.getVarLimitPositive());
			varLimitNegative.add(model.getVarLimitNegative());
			pnl.add(model.getPnl());
		}

		List<MarketVarChartVo> list = new ArrayList<MarketVarChartVo>();
		
		MarketVarChartVo varP = new MarketVarChartVo();
		varP.setName("varPositive");
		varP.setData(varPositive);
		list.add(varP);
		
		MarketVarChartVo varN = new MarketVarChartVo();
		varN.setName("varNegative");
		varN.setData(varNegative);
		list.add(varN);
		
		MarketVarChartVo varLimitP = new MarketVarChartVo();
		varLimitP.setName("varLimitPositive");
		varLimitP.setData(varLimitPositive);
		list.add(varLimitP);
		
		MarketVarChartVo varLimitN = new MarketVarChartVo();
		varLimitN.setName("varLimitNegative");
		varLimitN.setData(varLimitNegative);
		list.add(varLimitN);
		
		MarketVarChartVo pnlmodel = new MarketVarChartVo();
		pnlmodel.setName("pnl");
		pnlmodel.setData(pnl);
		list.add(pnlmodel);
		
		
		List<MarketVarChartVo> superpositionData = getSuperpositionData(vo);
		List<String> dateList = getDateList(vo);
		List<MarketVarTableModel> varTableList = getVarTableList(vo);
		
		Map<Object, Object> map = new HashMap<>();
		
		map.put("data_top", varTableList);
		map.put("data_middle", list);
		map.put("data_below", superpositionData);
		map.put("date", dateList);
		map.put("maxDate", endDate);
		
		return map;
	}
	
	/** 
	 * @param vo
	 * @return 
	 */
	public List<MarketVarChartVo> getSuperpositionData(MarketVarVo vo) {
		
		List<MarketVarModel> superpositionData = mapper.getSuperpositionData(vo);
		
		List<MarketVarChartVo> result = new ArrayList<MarketVarChartVo>();
		
		Set<String> set = new HashSet<String>();
		List<String> orgNames = new ArrayList<>();
		
		for (MarketVarModel model : superpositionData) {
			if(set.add(model.getUnitName())){
				orgNames.add(model.getUnitName());
            }
		}
		
		for (String orgName : orgNames) {
			MarketVarChartVo var = new MarketVarChartVo();
			var.setName(orgName);
			List<String> list = new ArrayList<>();
			for (MarketVarModel model : superpositionData) {
				if (StringUtils.equals(orgName, model.getUnitName())) {
					if (StringUtils.isBlank(model.getVarPositive())) {
						model.setVarPositive("");
					}
					list.add(model.getVarPositive());
				}
			}
			var.setData(list);
			result.add(var);
		}
		
		return result;
	}
	

	/** 
	 * @param vo
	 * @return 
	 */
	public List<String> getDateList(MarketVarVo vo) {
		return mapper.getDateList(vo);
	}
	
	/** 
	 * @param vo
	 * @return 
	 */
	public List<MarketVarTableModel> getVarTableList(MarketVarVo vo) {
		
		MarketVarTableModel model = mapper.getJtztVar(vo);
		List<MarketVarTableModel> varTableList = mapper.getVarTableList(vo);
		for (MarketVarTableModel marketVarTableModel : varTableList) {
			Double num1 = new Double(marketVarTableModel.getVar());
			Double num2 = new Double(model.getVar());
			double div = MathUtil.div(num1, num2, 4);
			marketVarTableModel.setVarPnt(div);
		}
		return varTableList;
	}

	/** 
	 * @return 
	 */
	
	
	@Override
	public String getMaxDate() {
		return mapper.findMaxTradeDate();
	}
	
}
