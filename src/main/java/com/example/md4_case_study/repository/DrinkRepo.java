package com.example.md4_case_study.repository;

import com.example.md4_case_study.model.AppUser;
import com.example.md4_case_study.model.Drink;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface DrinkRepo extends CrudRepository<Drink,Integer> {
    @Query(nativeQuery = true,value = "select * from login_jwt.drink where service_type_id=1 ")
    List<Drink> listDrink();


    @Query(nativeQuery = true,value = "select quantity_drink from login_jwt.drink where id_drink=:id ")
    int quantityExist(@Param("id") int id);
    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "update login_jwt.drink set quantity_drink=:quantity where id_drink=:id")
    void updateQuantity(@Param("id") int id,@Param("quantity") int quantity);
}
