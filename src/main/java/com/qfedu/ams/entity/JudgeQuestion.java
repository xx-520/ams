package com.qfedu.ams.entity;

public class JudgeQuestion {
    private Integer id;

    private Integer score;

    private Integer choicea;

    private Integer choiceb;

    private Boolean judgeanswer;

    private Integer subjectid;

    private String question;

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

    public Integer getChoicea() {
        return choicea;
    }

    public void setChoicea(Integer choicea) {
        this.choicea = choicea;
    }

    public Integer getChoiceb() {
        return choiceb;
    }

    public void setChoiceb(Integer choiceb) {
        this.choiceb = choiceb;
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
}