package com.example.md4_case_study.repository;

import com.example.md4_case_study.model.AppUser;
import com.example.md4_case_study.model.Drink;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DrinkRepo extends CrudRepository<Drink,Integer> {
    @Query(nativeQuery = true,value = "select * from login_jwt.drink where service_type_id=1 ")
    List<Drink> listDrink();
}
