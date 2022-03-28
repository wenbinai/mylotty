package org.example.mylotty.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.mylotty.infrastructure.po.Strategy;
import org.example.mylotty.infrastructure.po.StrategyDetail;

import java.util.List;

@Mapper
public interface IStrategyDetailDao {
    /**
     * 查询策略表详细配置
     *
     * @param strategyId 策略ID
     * @return 返回结果
     */
    List<StrategyDetail> queryStrategyDetailList(Long strategyId);

    /**
     * 查询无库存策略奖品ID
     *
     * @param strategyId 策略ID
     * @return 返回结果
     */
    List<String> queryNoStockStrategyAwardList(Long strategyId);

    /**
     * 扣减库存
     *
     * @param strategyDetailReq 策略ID、奖品ID
     * @return 返回结果
     */
    int deductStock(StrategyDetail strategyDetailReq);

}
