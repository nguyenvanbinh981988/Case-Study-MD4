package com.example.md4_case_study.model;

import lombok.Data;

public class UserLoging {
    private long id;
    private  String token;

    public UserLoging(long id, String token) {
        this.id = id;
        this.token = token;
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
}
