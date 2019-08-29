package com.qfedu.ams.entity;

public class ChoiceQuestionWithBLOBs extends ChoiceQuestion {
    private String question;

    private String choicea;

    private String choiceb;

    private String choicec;

    private String choiced;

    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getChoicea() {
        return choicea;
    }

    public void setChoicea(String choicea) {
        this.choicea = choicea == null ? null : choicea.trim();
    }

    public String getChoiceb() {
        return choiceb;
    }

    public void setChoiceb(String choiceb) {
        this.choiceb = choiceb == null ? null : choiceb.trim();
    }

    public String getChoicec() {
        return choicec;
    }

    public void setChoicec(String choicec) {
        this.choicec = choicec == null ? null : choicec.trim();
    }

    public String getChoiced() {
        return choiced;
    }

    public void setChoiced(String choiced) {
        this.choiced = choiced == null ? null : choiced.trim();
    }
}