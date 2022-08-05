package com.example.md4_case_study.repository;

import com.example.md4_case_study.model.ListUserSelect;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ListUserSelectRepo extends CrudRepository<ListUserSelect,Integer> {

//    @Query(nativeQuery = true,value = "select quantity from login_jwt.list_user_select where drink_id_drink=:id");
}
