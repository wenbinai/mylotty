package org.example.lotty.domain.strategy.repository;

import org.example.lotty.domain.strategy.model.aggregates.StrategyRich;
import org.example.mylotty.infrastructure.po.Award;

import java.util.List;

public interface IStrategyRepository {
    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);

    List<String> queryNoStockStrategyAwardList(Long strategyId);

    /**
     * 扣减库存
     *
     * @param strategyId
     * @param awardId
     * @return
     */
    boolean deductStock(Long strategyId, String awardId);
}
