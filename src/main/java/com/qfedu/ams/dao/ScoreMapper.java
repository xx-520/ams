package com.qfedu.ams.dao;

import com.qfedu.ams.entity.Score;
import com.qfedu.ams.vo.UserScore;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

//分数表
public interface ScoreMapper {
    /**
     * 根据用户ID查找用户分数
     */
    public void selectScore(Integer id);
//
//    //查询所有分数
//    public List<Score> findAll();

    //删除分数（假删）
    public void deleteScore(Integer id);

    //修改分数表信息
    public void updateScore(Score score);

    //根据ID查找
    public Score findById(Integer id);

    //批量删除
   public int deleteMany(List<Integer> ids);

       //查询所有分数
    public List<UserScore> findAllScore();


//    public List<UserScore> findBySubjectName(String subjectName);


    public List<Score> findList(HashMap<String,Object> map);


}