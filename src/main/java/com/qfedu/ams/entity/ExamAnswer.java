package com.qfedu.ams.entity;

public class ExamAnswer {
    private Integer id;

    private Integer examid;

    private String choiceAnswer;

    private String judgeAnswer;

    private String shortAnswer;

    private Integer examnum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExamid() {
        return examid;
    }

    public void setExamid(Integer examid) {
        this.examid = examid;
    }

    public String getChoiceAnswer() {
        return choiceAnswer;
    }

    public void setChoiceAnswer(String choiceAnswer) {
        this.choiceAnswer = choiceAnswer == null ? null : choiceAnswer.trim();
    }

    public String getJudgeAnswer() {
        return judgeAnswer;
    }

    public void setJudgeAnswer(String judgeAnswer) {
        this.judgeAnswer = judgeAnswer == null ? null : judgeAnswer.trim();
    }

    public String getShortAnswer() {
        return shortAnswer;
    }

    public void setShortAnswer(String shortAnswer) {
        this.shortAnswer = shortAnswer == null ? null : shortAnswer.trim();
    }

    public Integer getExamnum() {
        return examnum;
    }

    public void setExamnum(Integer examnum) {
        this.examnum = examnum;
    }
}