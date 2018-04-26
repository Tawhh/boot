/**
 * @copy right Dossp Company All rights reserved
 * @Title: DailyGroupController.java
 * @Date: 2018/4/20 17:33
 * @Package com.dossp.crp.daily.group.controller
 */
package com.dossp.crp.daily.group.controller;

import com.dossp.common.model.JsonMsg;
import com.dossp.common.util.DateUtil;
import com.dossp.crp.daily.group.model.DailyGroupPnlModel;
import com.dossp.crp.daily.group.model.DailyGroupPositionModel;
import com.dossp.crp.daily.group.service.DailyGroupService;
import com.dossp.crp.daily.group.vo.DailyGroupChartVo;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author weihh
 *         </p>
 *         日期：2018/4/20 17:33
 *         </p>
 *         描述：
 */
@Controller
@RequestMapping(value = "/api/daily/group")
public class DailyGroupController {

    private static final Logger log = LoggerFactory.getLogger(DailyGroupController.class);
    @Autowired
    private DailyGroupService groupService;


    /**
     * @return
     */
    @RequestMapping(value = "index")
    public String to_list() {
        return "daily/daily";
    }

    /**
     * @param request
     * @return
     */
    @RequestMapping(value = "do_list")
    @ResponseBody
    public JsonMsg do_list(HttpServletRequest request) {
        JsonMsg msg = new JsonMsg("查询数据错误");
        Map map = new HashMap();
        String date = DateUtil.formateLocaleDate("yyyy-MM-dd");
        String tradeDate = groupService.getMaxDate();
        if (StringUtils.isBlank(tradeDate)) {
            tradeDate = date;
        }
        try {
            DailyGroupChartVo chartVo = groupService.getChartData(tradeDate);
            map.put("chart", chartVo);

            List<DailyGroupPnlModel> pnlList = groupService.getPnlData(tradeDate);
            map.put("pnlRetList", pnlList);

            List<DailyGroupPositionModel> positionList = groupService.getPositionData(tradeDate);
            map.put("positionList", positionList);
            map.put("dataDate", tradeDate);

            msg.setObj(map);
            msg.setSuccess(true);
            msg.setMsg("查询成功");
        } catch (Exception e) {
            log.error("group data error", e);
        }

        return msg;
    }
}
