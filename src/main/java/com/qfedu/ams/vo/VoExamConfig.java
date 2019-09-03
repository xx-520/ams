package com.qfedu.ams.vo;

import com.qfedu.ams.entity.ExamSubject;
import com.qfedu.ams.entity.User;

import java.util.Date;

public class VoExamConfig {
    private Integer id;
    private Date startTime;
    private Date endTime;
    private Integer examNum;
    private User user;
    private ExamSubject examSubject;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getExamNum() {
        return examNum;
    }

    public void setExamNum(Integer examNum) {
        this.examNum = examNum;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ExamSubject getExamSubject() {
        return examSubject;
    }

    public void setExamSubject(ExamSubject examSubject) {
        this.examSubject = examSubject;
    }
}
