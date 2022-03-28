package org.example.lotty.domain.strategy.service.draw;

import org.example.lotty.domain.strategy.model.aggregates.StrategyRich;
import org.example.lotty.domain.strategy.repository.IStrategyRepository;
import org.example.mylotty.infrastructure.po.Award;
import org.example.mylotty.infrastructure.po.Strategy;

import javax.annotation.Resource;

/**
 * 抽奖策略数据支撑, 一些通用的数据服务
 */
public class DrawStrategySupport extends DrawConfig {

    @Resource
    private IStrategyRepository strategyRepository;

    /**
     * 查询策略配置信息
     *
     * @param strategyId 策略ID
     * @return 策略配置信息
     */
    protected StrategyRich queryStrategyRich(Long strategyId) {
        return strategyRepository.queryStrategyRich(strategyId);
    }

    /**
     * 查询奖品详情信息
     *
     * @param awardId 奖品ID
     * @return 中奖详情
     */
    protected Award queryAwardInfoByAwardId(String awardId) {
        return strategyRepository.queryAwardInfo(awardId);
    }

}
