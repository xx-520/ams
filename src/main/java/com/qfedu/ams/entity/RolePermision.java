package com.qfedu.ams.entity;

public class RolePermision {
    private Integer rolePerId;

    private Integer rid;

    private Integer pid;

    private Integer status;

    public RolePermision(Integer rid, Integer pid) {
        this.rid = rid;
        this.pid = pid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRolePerId() {
        return rolePerId;
    }

    public void setRolePerId(Integer rolePerId) {
        this.rolePerId = rolePerId;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}