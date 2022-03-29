package org.example.lotty.domain.rule.repository;

import org.example.lotty.domain.rule.model.aggregates.TreeRuleRich;

/**
 * 规则信息仓储服务接口
 */
public interface IRuleRepository {

    /**
     * 查询规则决策树配置
     *
     * @param treeId 决策树ID
     * @return 决策树配置
     */
    TreeRuleRich queryTreeRuleRich(Long treeId);

}
