package com.qfedu.ams.dao;

import com.qfedu.ams.entity.Count;

import java.util.List;

public interface CountDao {

    // 查询科目及总分
    public List<Count> findAllCount();

}
