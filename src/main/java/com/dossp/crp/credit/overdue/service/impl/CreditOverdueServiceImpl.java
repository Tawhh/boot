/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: CreditOverdueServiceImpl.java 
 *
 * @Date:  2018年4月18日  上午10:39:20
 *
 * @Package com.dossp.crp.credit.overdue.service.impl
 */

package com.dossp.crp.credit.overdue.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dossp.crp.credit.overdue.mapper.CreditOverdueMapper;
import com.dossp.crp.credit.overdue.model.CreditOverdueModel;
import com.dossp.crp.credit.overdue.service.CreditOverdueService;
import com.dossp.crp.credit.overdue.vo.CreditOverdueArVo;
import com.dossp.crp.credit.overdue.vo.CreditOverduePrepayVo;
import com.dossp.crp.credit.overdue.vo.CreditOverdueVo;

/**
 * @author yufenghui
 *         </p>
 *         日期：2018年4月18日 上午10:39:20
 *         </p>
 *         描述：
 *
 */
@Service
public class CreditOverdueServiceImpl implements CreditOverdueService {

	@Autowired
	private CreditOverdueMapper creditOverdueMapper;

	/**
	 * @return
	 */
	@Override
	public CreditOverdueVo getData() {
		CreditOverdueVo vo = new CreditOverdueVo();
		// 查询集团整体
		CreditOverdueModel groupData = creditOverdueMapper.getGroupData();

		// 查询专业化公司
		List<CreditOverdueModel> corpData = creditOverdueMapper.getCorpData();

		String[] arOverdue = generateGroupArOverdue(groupData);
		String[] prepayOverdue = generateGroupPrepayOverdue(groupData);
		List<CreditOverdueArVo> arTableList = generateCorpArOverdue(corpData);
		List<CreditOverduePrepayVo> prepayTableList = generateCorpPrepayOverdue(corpData);

		vo.setDataDate(groupData.getDataDate());
		vo.setArOverdue(arOverdue);
		vo.setPrepayOverdue(prepayOverdue);
		vo.setArTableList(arTableList);
		vo.setPrepayTableList(prepayTableList);

		return vo;
	}

	/**
	 * @param corpData
	 * @return
	 */
	private List<CreditOverduePrepayVo> generateCorpPrepayOverdue(List<CreditOverdueModel> corpData) {
		int len = corpData.size();
		List<CreditOverduePrepayVo> voList = new ArrayList<CreditOverduePrepayVo>();

		for (int i = 0; i < len; i++) {
			CreditOverdueModel m = corpData.get(i);
			String purDueAttAmt = m.getPurDueAttAmt();
			String purDueSecAmt = m.getPurDueSecAmt();
			String purDueSusAmt = m.getPurDueSusAmt();

			if (StringUtils.isBlank(purDueAttAmt) && StringUtils.isBlank(purDueSecAmt)
					&& StringUtils.isBlank(purDueSusAmt)) {
				continue;
			}

			CreditOverduePrepayVo vo = new CreditOverduePrepayVo(m.getCorpName(), purDueAttAmt, purDueSecAmt, purDueSusAmt);
			voList.add(vo);
		}

		return voList;
	}

	/**
	 * @param corpData
	 * @return
	 */
	private List<CreditOverdueArVo> generateCorpArOverdue(List<CreditOverdueModel> corpData) {
		int len = corpData.size();
		List<CreditOverdueArVo> voList = new ArrayList<CreditOverdueArVo>();

		for (int i = 0; i < len; i++) {
			CreditOverdueModel m = corpData.get(i);
			String arDueAttAmt = m.getArDueAttAmt();
			String arDueSecAmt = m.getArDueSecAmt();
			String arDueSusAmt = m.getArDueSusAmt();
			String arDueLossAmt = m.getArDueLossAmt();

			if (StringUtils.isBlank(arDueAttAmt) && StringUtils.isBlank(arDueSecAmt) && StringUtils.isBlank(arDueSusAmt)
					&& StringUtils.isBlank(arDueLossAmt)) {
				continue;
			}

			CreditOverdueArVo vo = new CreditOverdueArVo(m.getCorpName(), arDueAttAmt, arDueSecAmt, arDueSusAmt, arDueLossAmt);
			voList.add(vo);
		}

		return voList;
	}

	/**
	 * @param groupData
	 * @return
	 */
	private String[] generateGroupPrepayOverdue(CreditOverdueModel groupData) {
		String[] prepayOverdue = new String[4];
		prepayOverdue[0] = groupData.getPurDueTotalAmt();
		prepayOverdue[1] = groupData.getPurDueAttAmt();
		prepayOverdue[2] = groupData.getPurDueSecAmt();
		prepayOverdue[3] = groupData.getPurDueSusAmt();

		return prepayOverdue;
	}

	/**
	 * @param groupData
	 * @return
	 */
	private String[] generateGroupArOverdue(CreditOverdueModel groupData) {
		String[] arOverdue = new String[5];
		arOverdue[0] = groupData.getArDueTotalAmt();
		arOverdue[1] = groupData.getArDueAttAmt();
		arOverdue[2] = groupData.getArDueSecAmt();
		arOverdue[3] = groupData.getArDueSusAmt();
		arOverdue[4] = groupData.getArDueLossAmt();

		return arOverdue;
	}

}
