package org.example.lotty.domain.activity.service.partake;

import org.example.lotty.domain.activity.model.req.PartakeReq;
import org.example.lotty.domain.activity.model.vo.ActivityBillVO;
import org.example.lotty.domain.activity.repository.IActivityRepository;

import javax.annotation.Resource;

/**
 * 活动领取操作, 一些通用的数据服务
 */
public class ActivityPartakeSupport {
    @Resource
    protected IActivityRepository activityRepository;

    protected ActivityBillVO queryActivityBill(PartakeReq req) {
        return activityRepository.queryActivityBill(req);
    }

}
