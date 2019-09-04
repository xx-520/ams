package com.qfedu.ams.vo;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/3
 * Time: 22:46
 */
public class TreeEntity {
    private Integer id;  //节点的id值
    private String name; //节点的名称
    private Boolean isParent; //是否是父节点
    private Integer pid; //当前节点对应父节点的id值

    public TreeEntity(Integer id, String name, Boolean isParent, Integer pid){
        this.id = id;
        this.name = name;
        this.isParent = isParent;
        this.pid = pid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getParent() {
        return isParent;
    }

    public void setParent(Boolean parent) {
        isParent = parent;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
