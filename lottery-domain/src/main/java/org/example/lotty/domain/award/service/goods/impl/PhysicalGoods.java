package org.example.lotty.domain.award.service.goods.impl;

import org.example.lotty.domain.award.model.req.GoodsReq;
import org.example.lotty.domain.award.model.res.DistributionRes;
import org.example.lotty.domain.award.service.goods.DistributionBase;
import org.example.lotty.domain.award.service.goods.IDistributionGoods;
import org.example.lotty.common.Constants;
import org.springframework.stereotype.Component;

/**
 * @description: 实物发货类商品
 */
@Component
public class PhysicalGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        // 模拟调用实物发奖
        logger.info("模拟调用实物发奖 uId：{} awardContent：{}", req.getuId(), req.getAwardContent());

        // 更新用户领奖结果
        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.GrantState.COMPLETE.getCode());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

}
