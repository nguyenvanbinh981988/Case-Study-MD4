package com.example.md4_case_study.service.implement;

import com.example.md4_case_study.model.User;
import com.example.md4_case_study.repositorys.IUserRepo;
import com.example.md4_case_study.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    IUserRepo iUserRepo;

    @Override
    public List<User> getAll() {
        return (List<User>) iUserRepo.findAll();
    }

    @Override
    public User save(User user) {
        return iUserRepo.save(user);
    }

    @Override
    public String delete(int id) {
        iUserRepo.deleteById(id);
        return "ok";
    }
}
