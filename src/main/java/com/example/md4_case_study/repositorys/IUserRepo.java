package com.example.md4_case_study.repositorys;

import com.example.md4_case_study.model.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepo extends CrudRepository<AppUser,Integer> {
}
