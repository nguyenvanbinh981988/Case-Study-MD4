package com.example.md4_case_study.model;

import lombok.Data;

public class UserLoging {
    private long id;
    private  String token;

    private String userName;

    public UserLoging(long id, String token,String userName) {
        this.id = id;
        this.token = token;
        this.userName = userName;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
