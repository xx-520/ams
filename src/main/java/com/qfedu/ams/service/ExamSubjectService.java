package com.qfedu.ams.service;

import com.qfedu.ams.entity.ExamSubject;

import java.util.List;
import java.util.Map;

/**
 * 学科管理 service接口层
 *
 * @author xx
 */
public interface ExamSubjectService {

    /**
     * 查询所有学科信息
     *
     * @return
     */
    List<ExamSubject> findAll();

    /**
     * 删除学科信息
     *
     * @param subjectid 传入一个学科 id
     * @return
     */
    void deleteByPrimaryKey(Integer subjectid);

    /**
     * 添加学科信息
     *
     * @param record 传入一个完整的 record对象
     * @return
     */
    int insert(ExamSubject record);

    /**
     * 查找指定学科信息
     *
     * @param subjectid 传入学科ID
     * @return
     */
    ExamSubject selectByPrimaryKey(Integer subjectid);

    Map<String ,Object> findByIndexAndSize( Integer page, Integer limit);

}
