package org.example.lotty.domain.activity.model.aggregates;

import org.example.lotty.domain.activity.model.vo.ActivityVO;
import org.example.lotty.domain.activity.model.vo.AwardVO;
import org.example.lotty.domain.activity.model.vo.StrategyVO;

import java.util.List;

/**
 * 活动配置聚合信息
 */
public class ActivityConfigRich {
    // 活动配置
    private ActivityVO activity;
    // 策略配置(策略明细)
    private StrategyVO strategy;
    // 奖品配置
    private List<AwardVO> awardList;

    public ActivityConfigRich() {
    }

    public ActivityConfigRich(ActivityVO activity, StrategyVO strategy, List<AwardVO> awardList) {
        this.activity = activity;
        this.strategy = strategy;
        this.awardList = awardList;
    }

    public ActivityVO getActivity() {
        return activity;
    }

    public void setActivity(ActivityVO activity) {
        this.activity = activity;
    }

    public StrategyVO getStrategy() {
        return strategy;
    }

    public void setStrategy(StrategyVO strategy) {
        this.strategy = strategy;
    }

    public List<AwardVO> getAwardList() {
        return awardList;
    }

    public void setAwardList(List<AwardVO> awardList) {
        this.awardList = awardList;
    }


}
