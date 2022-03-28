package org.example.mylotty.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.mylotty.infrastructure.po.Award;

@Mapper
public interface IAwardDao {
    Award queryAwardInfo(String awardInfo);
}
