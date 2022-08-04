package com.example.md4_case_study.service;


import com.example.md4_case_study.model.AppUser;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface IAppUserService extends UserDetailsService {
    List<AppUser> getAll();
    void save(AppUser appUser);
    void delete(Long id);

    Optional<AppUser> findAppUserById(long id);


    List<AppUser> findByEmail( String email);



    AppUser findAppUserByName(String name);

    void saveRole(long id);

}
