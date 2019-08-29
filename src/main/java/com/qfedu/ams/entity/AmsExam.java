package com.qfedu.ams.entity;

public class AmsExam {
    private Integer id;

    private Integer userid;

    private String choiceid;

    private String judgeid;

    private String shortid;

    private Integer examnum;

    private Integer status;

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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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
}