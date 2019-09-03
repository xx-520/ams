package com.qfedu.ams.service;

import com.qfedu.ams.entity.Score;
import com.qfedu.ams.vo.UserScore;

import java.util.List;

public interface ScoreService {

//    //查询所有成绩
//    public List<Score> findAll(Integer page,Integer limit);

    //删除分数（假删）
    public void deleteScore(Integer id);

    //修改分数表信息
    public void updateScore(Score score);

    //根据ID查找
    public Score findById(Integer id);

    //批量删除
    public int deleteMany(List<Integer> ids);


    //查询所有分数
    public List<UserScore> findAllScore(Integer page,Integer limit);

    public List<Score> findList(String name,String subjectName,Integer page,Integer limit);


}
