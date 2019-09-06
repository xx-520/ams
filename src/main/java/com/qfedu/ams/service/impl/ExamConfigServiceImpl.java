package com.qfedu.ams.service.impl;

import com.github.pagehelper.PageHelper;
import com.qfedu.ams.dao.ExamConfigMapper;
import com.qfedu.ams.entity.ExamConfig;
import com.qfedu.ams.entity.User;
import com.qfedu.ams.service.ExamConfigService;
import com.qfedu.ams.vo.VoExamConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamConfigServiceImpl implements ExamConfigService {
    @Autowired(required = false)
    private ExamConfigMapper examConfigMapper;

    @Override
    public List<VoExamConfig> selectUserList(String name, String subjectName, Integer page, Integer limit) {
        PageHelper.startPage( page, limit );
        return examConfigMapper.selectECList( name, subjectName );
    }

    @Override
    public int insert(ExamConfig record) {
        return examConfigMapper.insert( record );
    }

    @Override
    public ExamConfig selectByPrimaryKey(Integer id) {
        return examConfigMapper.selectByPrimaryKey( id );
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return examConfigMapper.deleteByPrimaryKey( id );
    }

    @Override
    public void deleteExamConfigByIds(Integer[] ids) {
        examConfigMapper.deleteExamConfigByIds( ids );
    }

    @Override
    public int updateByPrimaryKey(ExamConfig record) {
        return examConfigMapper.updateByPrimaryKey( record );
    }

    @Override
    public List<User> selectUser() {
        return examConfigMapper.selectUser();
    }

    @Override
    public List<ExamConfig> findAllExamConfig() {
        List<ExamConfig> examConfigList = examConfigMapper.findAllExamConfig();
        return examConfigList;
    }
}
