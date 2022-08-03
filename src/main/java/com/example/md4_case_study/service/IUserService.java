package com.example.md4_case_study.service;

import com.example.md4_case_study.model.AppUser;

import java.util.List;

public interface IUserService {
    List<AppUser> getAll();
    AppUser save(AppUser user);
    String delete(int id);
}
