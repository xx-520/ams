package com.qfedu.ams.entity;

import java.util.List;

public class JudgeQuestion {
    private Integer id;

    private Integer score;

    // 0为 false  1为 true
    private Boolean judgeanswer;

    private Integer subjectid;

    private String question;

    private Integer status;

    private List<ExamSubject> ESlist;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Boolean getJudgeanswer() {
        return judgeanswer;
    }

    public void setJudgeanswer(Boolean judgeanswer) {
        this.judgeanswer = judgeanswer;
    }

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public List<ExamSubject> getESlist() {
        return ESlist;
    }

    public void setESlist(List<ExamSubject> ESlist) {
        this.ESlist = ESlist;
    }
}