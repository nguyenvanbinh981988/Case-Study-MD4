package com.example.md4_case_study.service.iplm;

import com.example.md4_case_study.model.AppUser;
import com.example.md4_case_study.repository.AppUserRepo;
import com.example.md4_case_study.service.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppUserService implements IAppUserService {
    @Autowired
    AppUserRepo appUserRepo;

    @Override
    public List<AppUser> getAll() {
        return (List<AppUser>) appUserRepo.findAll();
    }

    @Override
    public void save(AppUser appUser) {
        appUserRepo.save(appUser);
    }

    @Override
    public void delete(Long id) {
        appUserRepo.deleteById(id);
    }

    @Override
    public Optional<AppUser> findAppUserById(long id) {
        return appUserRepo.findById(id);
    }

    @Override
    public void saveRole(long id) {
        appUserRepo.saveRole(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = appUserRepo.findByUserName(username);
        return new User(appUser.getNameUser(),appUser.getPasswordUser(),appUser.getRoles());
    }
}
