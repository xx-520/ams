package com.qfedu.ams.dao;

import com.qfedu.ams.vo.MarkShort;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MarkShortMapper {

    //根据考试的场次，查询简答题的答案
    public List<MarkShort> findShortByExamId(@Param("username")Integer username,
                                             @Param("name")String name,@Param("totalShortScore")Integer totalShortScore,
                                             @Param("subjectName")String subjectName,@Param("referenceanswer")String referenceanswer,@Param("userId")Integer userId);

    public MarkShort findByUserId(@Param("userId")  Integer userId, @Param("examId") Integer examId);


    public void updateMarkShort(MarkShort markShort);
}
