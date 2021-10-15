package org.example.mylotty.rpc;

import org.example.mylotty.rpc.req.ActivityReq;
import org.example.mylotty.rpc.res.ActivityRes;

public interface IActivityBooth {
    ActivityRes queryActivityById(ActivityReq req);
}
