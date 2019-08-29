package com.qfedu.ams.dao;

import com.qfedu.ams.entity.Score;
//分数表
public interface ScoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}