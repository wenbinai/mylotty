package org.example.mylotty.interfaces;

import org.apache.dubbo.config.annotation.Service;
import org.example.mylotty.common.Constants;
import org.example.mylotty.common.Result;
import org.example.mylotty.infrastructure.dao.IActivityDao;
import org.example.mylotty.infrastructure.po.Activity;
import org.example.mylotty.rpc.IActivityBooth;
import org.example.mylotty.rpc.req.ActivityReq;
import org.example.mylotty.rpc.dto.ActivityDto;
import org.example.mylotty.rpc.res.ActivityRes;

import javax.annotation.Resource;

@Service
public class ActivityBooth implements IActivityBooth {

    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {
        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()), activityDto);
    }
}
