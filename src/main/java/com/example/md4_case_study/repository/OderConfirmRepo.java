package com.example.md4_case_study.repository;

import com.example.md4_case_study.model.OderConfirm;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface OderConfirmRepo extends CrudRepository<OderConfirm,Integer> {

    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "update login_jwt.oder_confirm set status_confirm = 1 app_user_id_user=:idUser and time_oder like concat('%',:time_oder,'%'); ")
    void updateStatusConfirm(@Param("idUser") int idUser, @Param("time_oder")String time);
}
