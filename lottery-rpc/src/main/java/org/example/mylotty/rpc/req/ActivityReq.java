package org.example.mylotty.rpc.req;

import java.io.Serializable;

public class ActivityReq implements Serializable {
    private long activityId;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }
}
