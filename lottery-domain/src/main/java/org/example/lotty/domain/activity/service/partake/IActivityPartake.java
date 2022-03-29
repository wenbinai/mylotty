package org.example.lotty.domain.activity.service.partake;

import org.example.lotty.domain.activity.model.req.PartakeReq;
import org.example.lotty.domain.activity.model.res.PartakeResult;
import org.example.lotty.domain.activity.model.vo.ActivityPartakeRecordVO;
import org.example.lotty.domain.activity.model.vo.DrawOrderVO;
import org.example.lotty.domain.activity.model.vo.InvoiceVO;
import org.example.lotty.common.Result;

import java.util.List;

/**
 * 抽奖活动参与接口
 */
public interface IActivityPartake {

    /**
     * 参与活动
     *
     * @param req 入参
     * @return 领取结果
     */
    PartakeResult doPartake(PartakeReq req);

    /**
     * 保存奖品单
     *
     * @param drawOrder 奖品单
     * @return 保存结果
     */
    Result recordDrawOrder(DrawOrderVO drawOrder);

    /**
     * 更新发货单 MQ 状态
     *
     * @param uId     用户ID
     * @param orderId 订单ID
     * @param mqState MQ 发送状态
     */
    void updateInvoiceMqState(String uId, Long orderId, Integer mqState);

    /**
     * 扫描发货单 MQ 状态，把未发送 MQ 的单子扫描出来，做补偿
     *
     * @param dbCount 指定分库
     * @param tbCount 指定分表
     * @return 发货单
     */
    List<InvoiceVO> scanInvoiceMqState(int dbCount, int tbCount);

    /**
     * 更新活动库存
     *
     * @param activityPartakeRecordVO 活动领取记录
     */
    void updateActivityStock(ActivityPartakeRecordVO activityPartakeRecordVO);


}
