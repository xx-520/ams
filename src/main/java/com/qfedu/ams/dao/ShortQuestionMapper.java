package com.qfedu.ams.dao;

import com.qfedu.ams.entity.ShortQuestion;

public interface ShortQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShortQuestion record);

    int insertSelective(ShortQuestion record);

    ShortQuestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShortQuestion record);

    int updateByPrimaryKeyWithBLOBs(ShortQuestion record);

    int updateByPrimaryKey(ShortQuestion record);
}