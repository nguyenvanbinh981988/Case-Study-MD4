package com.example.md4_case_study.service;

import com.example.md4_case_study.model.Role;

import java.util.List;

public interface IRoleService {
    List<Role> getRole();
    void save(Role roles);

}
