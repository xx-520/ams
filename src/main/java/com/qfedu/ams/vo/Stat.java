package com.qfedu.ams.vo;

public class Stat {
    private Integer uid;
    private String username;
    private String subjectName;
    private Integer choiceScore;
    private Integer totalJudgeScore;
    private Integer totalShortScore;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getChoiceScore() {
        return choiceScore;
    }

    public void setChoiceScore(Integer choiceScore) {
        this.choiceScore = choiceScore;
    }

    public Integer getTotalJudgeScore() {
        return totalJudgeScore;
    }

    public void setTotalJudgeScore(Integer totalJudgeScore) {
        this.totalJudgeScore = totalJudgeScore;
    }

    public Integer getTotalShortScore() {
        return totalShortScore;
    }

    public void setTotalShortScore(Integer totalShortScore) {
        this.totalShortScore = totalShortScore;
    }
}
