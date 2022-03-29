package org.example.lotty.application.process.deploy.impl;


import org.example.lotty.application.process.deploy.IActivityDeployProcess;
import org.example.lotty.domain.activity.model.aggregates.ActivityInfoLimitPageRich;
import org.example.lotty.domain.activity.model.req.ActivityInfoLimitPageReq;
import org.example.lotty.domain.activity.service.deploy.IActivityDeploy;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: 活动部署实现
 */
@Service
public class ActivityDeployProcessImpl implements IActivityDeployProcess {

    @Resource
    private IActivityDeploy activityDeploy;

    @Override
    public ActivityInfoLimitPageRich queryActivityInfoLimitPage(ActivityInfoLimitPageReq req) {
        return activityDeploy.queryActivityInfoLimitPage(req);
    }
}
