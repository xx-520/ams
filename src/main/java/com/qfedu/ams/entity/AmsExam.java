package com.qfedu.ams.entity;

import java.util.List;

/**
 * @author xx
 */
public class AmsExam {
    private Integer id;

    private String choiceid;

    private String judgeid;

    private String shortid;

    private Integer examnum;

    private Integer status;

    private List<ChoiceQuestion> choiceQuestionslist;

    private List<JudgeQuestion> judgeQuestionslist;

    private List<ShortQuestion> shortQuestionslist;


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

    public String getChoiceid() {
        return choiceid;
    }

    public void setChoiceid(String choiceid) {
        this.choiceid = choiceid == null ? null : choiceid.trim();
    }

    public String getJudgeid() {
        return judgeid;
    }

    public void setJudgeid(String judgeid) {
        this.judgeid = judgeid == null ? null : judgeid.trim();
    }

    public String getShortid() {
        return shortid;
    }

    public void setShortid(String shortid) {
        this.shortid = shortid == null ? null : shortid.trim();
    }

    public Integer getExamnum() {
        return examnum;
    }

    public void setExamnum(Integer examnum) {
        this.examnum = examnum;
    }

    public List<ChoiceQuestion> getChoiceQuestionslist() {
        return choiceQuestionslist;
    }

    public void setChoiceQuestionslist(List<ChoiceQuestion> choiceQuestionslist) {
        this.choiceQuestionslist = choiceQuestionslist;
    }

    public List<JudgeQuestion> getJudgeQuestionslist() {
        return judgeQuestionslist;
    }

    public void setJudgeQuestionslist(List<JudgeQuestion> judgeQuestionslist) {
        this.judgeQuestionslist = judgeQuestionslist;
    }

    public List<ShortQuestion> getShortQuestionslist() {
        return shortQuestionslist;
    }

    public void setShortQuestionslist(List<ShortQuestion> shortQuestionslist) {
        this.shortQuestionslist = shortQuestionslist;
    }
}