package com.example.md4_case_study.service;

import com.example.md4_case_study.model.User;

import java.util.List;

public interface IUserService {
    List<User> getAll();
    User save(User user);
    String delete(int id);
}
