package com.example.md4_case_study.service;

public interface ISecurityUserService {
    String validatePasswordResetToken(long id, String token);

}

