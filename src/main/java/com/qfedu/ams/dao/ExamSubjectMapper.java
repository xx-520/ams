package com.qfedu.ams.dao;

import com.qfedu.ams.entity.ExamSubject;

import java.util.List;

/**
 * 学科管理 dao层
 *
 * @author xx
 */
public interface ExamSubjectMapper {

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
    int deleteByPrimaryKey(Integer subjectid);

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

    /**
     * 修改学科信息
     *
     * @param record 传入 record对象
     * @return
     */
    int updateByPrimaryKey(ExamSubject record);
}