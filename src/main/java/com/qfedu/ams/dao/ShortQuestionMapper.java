package com.qfedu.ams.dao;

import com.qfedu.ams.entity.ShortQuestion;

import java.util.List;
import java.util.Map;

/**
    简答题dao层
 */
public interface ShortQuestionMapper {

    List<ShortQuestion> findAll();

    int deleteByPrimaryKey(Integer id);

    void falseDeletes(Integer[] ids);

    int insert(ShortQuestion record);

    ShortQuestion selectByPrimaryKey(Integer id);

    void update(ShortQuestion shortQuestion);

    Map<String ,Object> findByIndexAndSize(Integer page, Integer limit);

    void inserts(List<ShortQuestion> list);

}