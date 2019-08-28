package com.qfedu.ams.entity;

public class Score {
    private Integer id;

    private Integer choicescore;

    private Integer totaljudgescore;

    private Integer totalshortscore;

    private Integer totalscore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChoicescore() {
        return choicescore;
    }

    public void setChoicescore(Integer choicescore) {
        this.choicescore = choicescore;
    }

    public Integer getTotaljudgescore() {
        return totaljudgescore;
    }

    public void setTotaljudgescore(Integer totaljudgescore) {
        this.totaljudgescore = totaljudgescore;
    }

    public Integer getTotalshortscore() {
        return totalshortscore;
    }

    public void setTotalshortscore(Integer totalshortscore) {
        this.totalshortscore = totalshortscore;
    }

    public Integer getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(Integer totalscore) {
        this.totalscore = totalscore;
    }
}