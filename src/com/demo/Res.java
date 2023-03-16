package com.demo;

public class Res {
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserSex() {
        return userSex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private  String userSex;
    private  String userName;

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    private  Boolean flag;
}
