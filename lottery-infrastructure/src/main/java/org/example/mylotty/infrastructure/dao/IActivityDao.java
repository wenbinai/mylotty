package org.example.mylotty.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.mylotty.infrastructure.po.Activity;

@Mapper
public interface IActivityDao {
    void insert(Activity req);

    Activity queryActivityById(Long activityId);
}
