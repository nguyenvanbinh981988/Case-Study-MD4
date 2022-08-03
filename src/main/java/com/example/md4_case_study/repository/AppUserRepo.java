package com.example.md4_case_study.repository;

import com.example.md4_case_study.model.AppUser;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AppUserRepo extends CrudRepository<AppUser, Long> {
    @Query(nativeQuery = true,value = "select * from app_user where name_user like concat('%',:name,'%'); ")
    AppUser findByUserName(@Param("name") String name);
    @Modifying
    @Query(nativeQuery = true,value = "insert into app_user_roles values(:id,1);")
    AppUser saveRole(@Param("id") long id);
    List<AppUser> findByEmail( String email);}
