package org.example.lotty.domain.rule.service.logic.impl;

import org.example.lotty.domain.rule.model.req.DecisionMatterReq;
import org.example.lotty.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;

/**
 * 性别规则
 */
@Component
public class UserGenderFilter extends BaseLogic {

    @Override
    public String matterValue(DecisionMatterReq decisionMatter) {
        return decisionMatter.getValMap()
                .get("gender")
                .toString();
    }
}
