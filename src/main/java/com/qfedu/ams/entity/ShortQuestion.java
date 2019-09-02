package com.qfedu.ams.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import jdk.nashorn.internal.ir.annotations.Ignore;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;

import java.util.List;

/**
 * 简答题表
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShortQuestion {
    private Integer id;

    private Integer score;

    private String question;

    private String  referenceanswer;

    private Integer subjectid;

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

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public String getReferenceanswer() {
        return referenceanswer;
    }

    public void setReferenceanswer(String referenceanswer) {
        this.referenceanswer = referenceanswer;
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