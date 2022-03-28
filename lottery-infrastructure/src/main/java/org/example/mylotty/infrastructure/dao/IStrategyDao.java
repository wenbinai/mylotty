package org.example.mylotty.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.mylotty.infrastructure.po.Strategy;

@Mapper
public interface IStrategyDao {
    Strategy queryStrategy(Long strategyId);

}
