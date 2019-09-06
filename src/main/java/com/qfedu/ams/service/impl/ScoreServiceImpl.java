package com.qfedu.ams.service.impl;

import com.github.pagehelper.PageHelper;
import com.qfedu.ams.dao.ScoreMapper;
import com.qfedu.ams.entity.Score;
import com.qfedu.ams.service.ScoreService;
import com.qfedu.ams.vo.UserScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired(required = false)
    private ScoreMapper scoreMapper;
//    @Override
//    public List<Score> findAll(Integer page, Integer limit) {
//
//        PageHelper.startPage(page, limit);
//        return scoreMapper.findAll();
//    }

    @Override
    public void deleteScore(Integer id) {
        scoreMapper.deleteScore(id);
    }

    @Override
    public void updateScore(Score score) {

         scoreMapper.updateScore(score);
    }

    @Override
    public Score findById(Integer id) {
        return scoreMapper.findById(id);
    }

    @Override
    public int deleteMany(List<Integer> ids) {

        int i = scoreMapper.deleteMany(ids);

        return i;
    }

    @Override
    public List<UserScore> findAllScore(Integer page, Integer limit) {

        PageHelper.startPage(page,limit);
        List<UserScore> list = scoreMapper.findAllScore();
        return list;
    }

    @Override
    public List<Score> findList(String name, String subjectName, Integer page, Integer limit) {

        PageHelper.startPage(page,limit);
        HashMap<String,Object> map = new HashMap<>();

        map.put("subjectName",subjectName);
        map.put("name",name);

        List<Score> list = scoreMapper.findList(map);

        return list;

    }
}
