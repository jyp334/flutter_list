package com.flutter.flutter_list.entity;

public class WeiXin {

    private int type;//1:登录 2.分享 3:微信支付
    private int errCode;//微信返回的错误码
    private String code;//登录成功才会有的code
    private String errMsg;

    public WeiXin(int type, int errCode, String code) {
        this.type = type;
        this.errCode = errCode;
        this.code = code;
    }

    public WeiXin(int type, int errCode, String code, String errMsg) {
        this.type = type;
        this.errCode = errCode;
        this.code = code;
        this.errMsg = errMsg;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "WeiXin{" +
                "type=" + type +
                ", errCode=" + errCode +
                ", code='" + code + '\'' +
                '}';
    }
}
