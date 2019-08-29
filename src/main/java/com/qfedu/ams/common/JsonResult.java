package com.qfedu.ams.common;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/8/26
 * Time: 21:20
 */
public class JsonResult {
    private int code; // 1表示成功    0表示失败
    private Object info;

    public JsonResult() {
    }

    public JsonResult(int code, Object info) {
        this.code = code;
        this.info = info;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }
}
