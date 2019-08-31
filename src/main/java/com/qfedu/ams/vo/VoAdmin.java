package com.qfedu.ams.vo;

import com.qfedu.ams.entity.Role;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/8/31
 * Time: 14:07
 */
public class VoAdmin {
    private Integer id;

    private String username;

    private String password;

    private Integer roleid;

    private Integer status;

    private Role role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
