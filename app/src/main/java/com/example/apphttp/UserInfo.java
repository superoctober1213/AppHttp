package com.example.apphttp;

public class UserInfo {

    private String sCommand;
    private String sCustomerName;
    private String getsCustomerCardIdNo;
    private String sContactTel;
    private String sCreateTime;
    private String sOtherParam;

    public UserInfo(String sCommand, String sCustomerName, String getsCustomerCardIdNo, String sContactTel, String sCreateTime, String sOtherParam) {
        this.sCommand = sCommand;
        this.sCustomerName = sCustomerName;
        this.getsCustomerCardIdNo = getsCustomerCardIdNo;
        this.sContactTel = sContactTel;
        this.sCreateTime = sCreateTime;
        this.sOtherParam = sOtherParam;
    }

    public String getsCommand() {
        return sCommand;
    }

    public void setsCommand(String sCommand) {
        this.sCommand = sCommand;
    }

    public String getsCustomerName() {
        return sCustomerName;
    }

    public void setsCustomerName(String sCustomerName) {
        this.sCustomerName = sCustomerName;
    }

    public String getGetsCustomerCardIdNo() {
        return getsCustomerCardIdNo;
    }

    public void setGetsCustomerCardIdNo(String getsCustomerCardIdNo) {
        this.getsCustomerCardIdNo = getsCustomerCardIdNo;
    }

    public String getsContactTel() {
        return sContactTel;
    }

    public void setsContactTel(String sContactTel) {
        this.sContactTel = sContactTel;
    }

    public String getsCreateTime() {
        return sCreateTime;
    }

    public void setsCreateTime(String sCreateTime) {
        this.sCreateTime = sCreateTime;
    }

    public String getsOtherParam() {
        return sOtherParam;
    }

    public void setsOtherParam(String sOtherParam) {
        this.sOtherParam = sOtherParam;
    }
}
