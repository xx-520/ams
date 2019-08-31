package com.qfedu.ams.entity;

import java.util.List;

public class ChoiceQuestion {
    private Integer id;

    private Integer score;

    private String question;

    private String choicea;

    private String choiceb;

    private String choicec;

    private String choiced;

    private String rightanswer;

    private Integer subjectid;

    private Integer status;

    private List<ExamSubject> ESlist;

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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getChoicea() {
        return choicea;
    }

    public void setChoicea(String choicea) {
        this.choicea = choicea;
    }

    public String getChoiceb() {
        return choiceb;
    }

    public void setChoiceb(String choiceb) {
        this.choiceb = choiceb;
    }

    public String getChoicec() {
        return choicec;
    }

    public void setChoicec(String choicec) {
        this.choicec = choicec;
    }

    public String getChoiced() {
        return choiced;
    }

    public void setChoiced(String choiced) {
        this.choiced = choiced;
    }

    public String getRightanswer() {
        return rightanswer;
    }

    public void setRightanswer(String rightanswer) {
        this.rightanswer = rightanswer;
    }

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<ExamSubject> getESlist() {
        return ESlist;
    }

    public void setESlist(List<ExamSubject> ESlist) {
        this.ESlist = ESlist;
    }
}