package com.qfedu.ams.vo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/8/30
 * Time: 20:56
 */
public class Pmenu {
    private Integer pid;
    private String pmenu;
    private String resourceType;
    private String url;

    private List<Cmenu> cmenu;

    public List<Cmenu> getCmenu() {
        return cmenu;
    }

    public void setCmenu(List<Cmenu> cmenu) {
        this.cmenu = cmenu;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPmenu() {
        return pmenu;
    }

    public void setPmenu(String pmenu) {
        this.pmenu = pmenu;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
