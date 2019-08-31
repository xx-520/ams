package com.qfedu.ams.vo;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/8/30
 * Time: 20:56
 */
public class Cmenu {
    private Integer cpid;
    private String cmenu;
    private String cpermisionName;
    private String cresourceType;
    private String curl;

    public Integer getCpid() {
        return cpid;
    }

    public void setCpid(Integer cpid) {
        this.cpid = cpid;
    }

    public String getCmenu() {
        return cmenu;
    }

    public void setCmenu(String cmenu) {
        this.cmenu = cmenu;
    }

    public String getCpermisionName() {
        return cpermisionName;
    }

    public void setCpermisionName(String cpermisionName) {
        this.cpermisionName = cpermisionName;
    }

    public String getCresourceType() {
        return cresourceType;
    }

    public void setCresourceType(String cresourceType) {
        this.cresourceType = cresourceType;
    }

    public String getCurl() {
        return curl;
    }

    public void setCurl(String curl) {
        this.curl = curl;
    }
}
