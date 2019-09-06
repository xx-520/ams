package com.qfedu.ams.dao;

import com.qfedu.ams.entity.ExamConfig;
import com.qfedu.ams.entity.User;
import com.qfedu.ams.vo.VoExamConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//考试时间表
public interface ExamConfigMapper {

    int deleteByPrimaryKey(Integer id);

    public void deleteExamConfigByIds(Integer[] ids);

    int insert(ExamConfig record);

//    int insertSelective(ExamConfig record);

    ExamConfig selectByPrimaryKey(Integer id);

    public List<VoExamConfig> selectECList(@Param("name") String name, @Param("subjectName") String subjectName);

//    int updateByPrimaryKeySelective(ExamConfig record);

    int updateByPrimaryKey(ExamConfig record);

    public List<User> selectUser();

    public List<ExamConfig> findAllExamConfig();
}