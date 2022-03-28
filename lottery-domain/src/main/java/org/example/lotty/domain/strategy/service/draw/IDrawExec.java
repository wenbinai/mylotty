package org.example.lotty.domain.strategy.service.draw;

import org.example.lotty.domain.strategy.model.req.DrawReq;
import org.example.lotty.domain.strategy.model.res.DrawResult;

public interface IDrawExec {
    DrawResult doDrawExec(DrawReq req);
}
