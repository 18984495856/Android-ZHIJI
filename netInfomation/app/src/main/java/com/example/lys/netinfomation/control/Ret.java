package com.example.lys.netinfomation.control;

/**
 * Created by Lys on 2017/5/24.
 */

/**
 * 这是一个用来给方法作为返回值的对象，用于那种只有成功和失败两种状态，但是成功和失败的原因有多种的方法
 * 会把reason作为日志添加
 */
public class Ret {
    private boolean OK = false;//是否成功
    private String reason = null; //原因

    public Ret(boolean OK,String reason){
        this.OK =OK;
        this.reason = reason;
        MangerRecode.addRecordInfo(reason);
    }

    public boolean isOK() {
        return OK;
    }

    public void setOK(boolean OK) {
        this.OK = OK;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        MangerRecode.addRecordInfo(reason);
        this.reason = reason;
    }
}
