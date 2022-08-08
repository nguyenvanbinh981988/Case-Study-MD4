package com.example.md4_case_study.repository;

import com.example.md4_case_study.model.NotificationConfirm;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface NotificationConfirmRepo extends CrudRepository<NotificationConfirm,Integer> {
    @Query(nativeQuery = true,value = "select * from notification_confirm where app_user_id_user=:idUser")
    List<NotificationConfirm> notificationConfirmsByIdUser(@Param("idUser") int idUser);
}
