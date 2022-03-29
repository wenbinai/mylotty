package org.example.lotty.domain.rule.service.logic.impl;

import org.example.lotty.domain.rule.model.req.DecisionMatterReq;
import org.example.lotty.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;

/**
 * 年龄规则
 */
@Component
public class UserAgeFilter extends BaseLogic {

    @Override
    public String matterValue(DecisionMatterReq decisionMatter) {
        return decisionMatter.getValMap().get("age").toString();
    }
}
