package org.laobai.bath.struct;

import java.io.Serializable;
// 结果集
public class Result implements Serializable {
    // 状态码
    private int code;
    // 解释信息
    private String msg;

    public static Result ok() {
        return new Result(200, "OK");
    }

    public static Result error() {
        return new Result(500, "ERROR");
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
