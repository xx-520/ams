package com.qfedu.ams.dao;

import com.qfedu.ams.entity.ShortQuestion;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
    简答题dao层
 */
public interface ShortQuestionMapper {

    List<Integer> CQfindAll(@Param("subjectid") Integer subjectid, @Param("snum") Integer snum);

    List<ShortQuestion> findAll();

    int deleteByPrimaryKey(Integer id);

    void falseDeletes(Integer[] ids);

    int insert(ShortQuestion record);

    ShortQuestion selectByPrimaryKey(Integer id);

    void update(ShortQuestion shortQuestion);

    Map<String ,Object> findByIndexAndSize(Integer page, Integer limit);

    void inserts(List<ShortQuestion> list);

}