package org.example.lotty.domain.strategy.repository.impl;

import org.example.lotty.domain.strategy.model.aggregates.StrategyRich;
import org.example.lotty.domain.strategy.repository.IStrategyRepository;
import org.example.mylotty.infrastructure.dao.IAwardDao;
import org.example.mylotty.infrastructure.dao.IStrategyDao;
import org.example.mylotty.infrastructure.dao.IStrategyDetailDao;
import org.example.mylotty.infrastructure.po.Award;
import org.example.mylotty.infrastructure.po.Strategy;
import org.example.mylotty.infrastructure.po.StrategyDetail;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class StrategyRepository implements IStrategyRepository {

    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Resource
    private IAwardDao awardDao;

    @Override
    public StrategyRich queryStrategyRich(Long strategyId) {
        Strategy strategy = strategyDao.queryStrategy(strategyId);
        List<StrategyDetail> strategyDetails = strategyDetailDao.queryStrategyDetailList(strategyId);
        return new StrategyRich(strategyId, strategy, strategyDetails);
    }

    @Override
    public Award queryAwardInfo(String awardId) {
        return awardDao.queryAwardInfo(awardId);
    }

    @Override
    public List<String> queryNoStockStrategyAwardList(Long strategyId) {
        return strategyDetailDao.queryNoStockStrategyAwardList(strategyId);
    }

    @Override
    public boolean deductStock(Long strategyId, String awardId) {
        StrategyDetail req = new StrategyDetail();
        req.setStrategyId(strategyId);
        req.setAwardCount(awardId);
        int count = strategyDetailDao.deductStock(req);
        return count == 1;
    }
}
