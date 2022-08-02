package com.example.md4_case_study.repositorys;

import com.example.md4_case_study.model.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepo extends CrudRepository<User,Integer> {
}
