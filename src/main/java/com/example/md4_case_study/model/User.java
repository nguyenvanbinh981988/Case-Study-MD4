package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_User;
    private String name;
    private String user_Cccd;
    private String phone;
    private String position;
    private String Account;
    private String passWord;
}
