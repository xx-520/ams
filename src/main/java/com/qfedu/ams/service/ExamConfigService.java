package com.qfedu.ams.service;

import com.qfedu.ams.entity.ExamConfig;
import com.qfedu.ams.entity.User;
import com.qfedu.ams.vo.VoExamConfig;

import java.util.List;

public interface ExamConfigService {

    public List<VoExamConfig> selectUserList(String name, String subjectName, Integer page, Integer limit);

    int insert(ExamConfig record);

    ExamConfig selectByPrimaryKey(Integer id);

    int deleteByPrimaryKey(Integer id);

    public void deleteExamConfigByIds(Integer[] ids);

    int updateByPrimaryKey(ExamConfig record);

    public List<User> selectUser();

    public List<ExamConfig> findAllExamConfig();
}
