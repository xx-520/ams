package com.qfedu.ams.service;

import com.qfedu.ams.entity.ExamSubject;

/**
 * 学科管理 service接口层
 *
 * @author xx
 */
public interface ExamSubjectService {

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
