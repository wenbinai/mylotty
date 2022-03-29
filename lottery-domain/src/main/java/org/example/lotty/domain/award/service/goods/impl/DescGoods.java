package org.example.lotty.domain.award.service.goods.impl;

import org.example.lotty.domain.award.model.req.GoodsReq;
import org.example.lotty.domain.award.model.res.DistributionRes;
import org.example.lotty.domain.award.service.goods.DistributionBase;
import org.example.lotty.domain.award.service.goods.IDistributionGoods;
import org.example.lotty.common.Constants;
import org.springframework.stereotype.Component;

/**
 * @description: 描述类商品，以文字形式展示给用户
 */
@Component
public class DescGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.GrantState.COMPLETE.getCode());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

}
