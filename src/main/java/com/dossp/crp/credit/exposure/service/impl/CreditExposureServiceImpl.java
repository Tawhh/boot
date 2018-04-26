/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: CreditExposureServiceImpl.java 
 *
 * @Date:  2018年4月16日  下午3:31:41
 *
 * @Package com.dossp.crp.credit.exposure.service.impl
 */


package com.dossp.crp.credit.exposure.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dossp.common.util.MathUtil;
import com.dossp.crp.credit.exposure.mapper.CreditExposureMapper;
import com.dossp.crp.credit.exposure.mode.CreditExposureModel;
import com.dossp.crp.credit.exposure.service.CreditExposureService;
import com.dossp.crp.credit.exposure.vo.CreditExposureChartVo;
import com.dossp.crp.credit.exposure.vo.CreditExposureGroupVo;
import com.dossp.crp.credit.exposure.vo.CreditExposureTableVo;
import com.dossp.crp.credit.exposure.vo.CreditExposureVo;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年4月16日 下午3:31:41
 * </p>
 * 描述：
 *
 */
@Service
public class CreditExposureServiceImpl implements CreditExposureService {
	
	@Autowired
	private CreditExposureMapper creditExposureMapper;

	/** 
	 * @return 
	 */
	@Override
	public CreditExposureVo getData() {
		CreditExposureVo vo = new CreditExposureVo();
		//----集团数据
		CreditExposureModel groupData = creditExposureMapper.getGroupData();
		List<CreditExposureGroupVo> groupVo = generateGroupVo(groupData);
		
		// 专业化公司数据
		List<CreditExposureModel> corpData = creditExposureMapper.getCorpData();
		CreditExposureChartVo chartVo = generateChartVo(corpData);
		List<CreditExposureTableVo> tableVo = generateTableVo(corpData);
		
		vo.setDataDate(groupData.getDataDate());
		vo.setGroup(groupVo);
		vo.setChart(chartVo);
		vo.setTable(tableVo);
		
		return vo;
	}
	
	/** 
	 * @param corpData
	 * @return 
	 */
	private List<CreditExposureTableVo> generateTableVo(List<CreditExposureModel> corpData) {
		List<CreditExposureTableVo> tableList = new ArrayList<CreditExposureTableVo>();
		for(CreditExposureModel m : corpData) {
			CreditExposureTableVo t = new CreditExposureTableVo();
			
			t.setCorp_name(m.getCorpName());
			t.setAr_exposure(m.getArNetAmt());
			t.setAr_exposure_delta(m.getArDeltaNetAmt());
			t.setAr_exposure_status(getStatus(m.getArDeltaNetAmt()));
			t.setAr_index_limit(m.getArNetIndexAmt());
			t.setAr_index_rate(m.getArNetIndexRate());
			t.setAr_turnover(m.getArTurnover());
			t.setAr_turnover_delta(m.getArTurnoverDelta());
			t.setAr_turnover_status(getStatus(m.getArTurnoverDelta()));
			
			t.setPrepay_exposure(m.getPrepayNetAmt());
			t.setPrepay_exposure_delta(m.getPrepayDeltaNetAmt());
			t.setPrepay_exposure_status(getStatus(m.getPrepayDeltaNetAmt()));
			t.setPrepay_index_limit(m.getPrepayNetIndexAmt());
			t.setPrepay_index_rate(m.getPrepayNetIndexRate());
			t.setPrepay_turnover(m.getPrepayTurnover());
			t.setPrepay_turnover_delta(m.getPrepayTurnoverDelta());
			t.setPrepay_turnover_status(getStatus(m.getPrepayTurnoverDelta()));
			
			tableList.add(t);
		}
		
		return tableList;
	}


	/** 
	 * @param corpData
	 * @return 
	 */
	private CreditExposureChartVo generateChartVo(List<CreditExposureModel> corpData) {
		CreditExposureChartVo chart = new CreditExposureChartVo();
		int len = corpData.size();
		String[] corp_name = new String[len];
		String[] ar_exposure = new String[len];
		String[] ar_index = new String[len];
		String[] prepay_exposure = new String[len];
		String[] prepay_index = new String[len];
		String[] ar_prepay_exposure = new String[len];
		String[] ar_prepay_index = new String[len];
		
		for(int i = 0; i < len; i ++) {
			CreditExposureModel m = corpData.get(i);
			corp_name[i] = m.getCorpName();
			ar_exposure[i] = m.getArNetAmt();
			ar_index[i] = m.getArNetIndexAmt();
			prepay_exposure[i] = m.getPrepayNetAmt();
			prepay_index[i] = m.getPrepayNetIndexAmt();
			
			ar_prepay_exposure[i] = MathUtil.add(ar_exposure[i], prepay_exposure[i], 1);
			ar_prepay_index[i] = MathUtil.add(ar_index[i], prepay_index[i], 1);
		}
		
		chart.setCorp_name(corp_name);
		chart.setAr_exposure(ar_exposure);
		chart.setAr_index(ar_index);
		chart.setPrepay_exposure(ar_prepay_exposure);
		chart.setPrepay_index(ar_prepay_index);
		chart.setAr_prepay_exposure(ar_prepay_exposure);
		chart.setAr_prepay_index(ar_prepay_index);
		
		return chart;
	}


	/** 
	 * @param groupData
	 * @return 
	 */
	private List<CreditExposureGroupVo> generateGroupVo(CreditExposureModel groupData) {
		List<CreditExposureGroupVo> groupVoList = new ArrayList<>();
	
		// -----------------境内
		CreditExposureGroupVo inner_ar = new CreditExposureGroupVo("inner_ar", groupData.getArNetAmt());
		String arDeltaNetAmt = groupData.getArDeltaNetAmt();
		inner_ar.setDelta(arDeltaNetAmt);
		inner_ar.setStatus(getStatus(arDeltaNetAmt));
		groupVoList.add(inner_ar);
		
		CreditExposureGroupVo inner_prepay = new CreditExposureGroupVo("inner_prepay", groupData.getPrepayNetAmt());
		String prepayDeltaNetAmt = groupData.getPrepayDeltaNetAmt();
		inner_prepay.setDelta(prepayDeltaNetAmt);
		inner_prepay.setStatus(getStatus(prepayDeltaNetAmt));
		groupVoList.add(inner_prepay);
		
		// -----------------境外
		CreditExposureGroupVo oversea_ar = new CreditExposureGroupVo("oversea_ar", "");
		oversea_ar.setDelta("");
		oversea_ar.setStatus("flat");
		groupVoList.add(oversea_ar);
		
		CreditExposureGroupVo oversea_prepay = new CreditExposureGroupVo("oversea_prepay", "");
		oversea_prepay.setDelta("");
		oversea_prepay.setStatus("flat");
		groupVoList.add(oversea_prepay);
		
		// -----------------计算整体
		String groupAr = groupData.getArNetAmt();
		String groupArDelta = groupData.getArDeltaNetAmt();
		CreditExposureGroupVo group_ar = new CreditExposureGroupVo("group_ar", groupAr);
		group_ar.setDelta(groupArDelta);
		group_ar.setStatus(getStatus(groupArDelta));
		
		groupVoList.add(group_ar);
		
		String groupPrepay = groupData.getPrepayNetAmt();
		String groupPrepayDelta = groupData.getPrepayDeltaNetAmt();
		CreditExposureGroupVo group_prepay = new CreditExposureGroupVo("group_prepay", groupPrepay);
		group_prepay.setDelta(groupPrepayDelta);
		group_prepay.setStatus(getStatus(groupPrepayDelta));
		groupVoList.add(group_prepay);
		
		String groupTotal = MathUtil.add(groupAr, groupPrepay, 1);
		String groupDeltaTotal = MathUtil.add(groupArDelta, groupPrepayDelta, 1);
		
		CreditExposureGroupVo group_total = new CreditExposureGroupVo("group_total", groupTotal);
		group_total.setDelta(groupDeltaTotal);
		group_total.setStatus(getStatus(groupDeltaTotal));
		groupVoList.add(group_total);
		
		return groupVoList;
	}
	
	/**
	 * 
	 * @param data
	 * @return
	 */
	private String getStatus(String data) {
		String status = "flat";
		if(StringUtils.isBlank(data)) {
			return status;
		}
		
		if(Double.parseDouble(data) > 0) {
			status = "up";
		} else if(Double.parseDouble(data) < 0) {
			status = "down";
		} else {
			status = "flat";
		}
		
		return status;
	}

}
