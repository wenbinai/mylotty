package org.example.lotty.application.process.draw.res;


import org.example.lotty.common.Result;

/**
 * @description:
 */
public class RuleQuantificationCrowdResult extends Result {

    /**
     * 活动ID
     */
    private Long activityId;

    public RuleQuantificationCrowdResult(String code, String info) {
        super(code, info);
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

}
