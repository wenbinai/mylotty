package org.example.lotty.domain.rule.service.engine;

import org.example.lotty.domain.rule.model.req.DecisionMatterReq;
import org.example.lotty.domain.rule.model.res.EngineResult;

/**
 * 规则过滤器引擎
 */
public interface EngineFilter {
    /**
     * 规则过滤器接口
     *
     * @param matter 规则决策物料
     * @return 规则决策结果
     */
    EngineResult process(final DecisionMatterReq matter);
}
