package com.qfedu.ams.service;



import com.qfedu.ams.entity.ShortQuestion;

import java.util.List;
import java.util.Map;

public interface ShortQuestionSevice {

    List<ShortQuestion> findAll();

    int falseDelete(Integer id);

    void falseDeletes(Integer[] ids);

    int insert(ShortQuestion record);

    ShortQuestion selectByPrimaryKey(Integer id);

    void update(ShortQuestion record);

    Map<String ,Object> findByIndexAndSize(Integer page, Integer limit);
}
