package org.example.lotty.rpc.activity.booth.res;

import org.example.lotty.common.Result;
import org.example.lotty.rpc.activity.booth.dto.AwardDTO;

import java.io.Serializable;

/**
 * 抽奖结果
 */
public class DrawRes extends Result implements Serializable {

    private AwardDTO awardDTO;

    public DrawRes(String code, String info) {
        super(code, info);
    }

    public AwardDTO getAwardDTO() {
        return awardDTO;
    }

    public void setAwardDTO(AwardDTO awardDTO) {
        this.awardDTO = awardDTO;
    }

}

