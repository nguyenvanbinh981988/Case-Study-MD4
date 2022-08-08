package com.example.md4_case_study.repository;

import com.example.md4_case_study.model.QuantityNotificationUser;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface QuantityNotificationRepo extends CrudRepository<QuantityNotificationUser,Integer> {

    @Query(nativeQuery = true,value = "select  quantity_notification from login_jwt.quantity_notification_user  where  app_user_id_user=:idUser ;")
    int countQuantityNotificationUser(@Param("idUser") int idUser);

    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "update login_jwt.quantity_notification_user set quantity_notification =:quantity where app_user_id_user=:idUser ; ")
    void updateStatusConfirm(@Param("idUser") int idUser, @Param("quantity")int quantity);
}
