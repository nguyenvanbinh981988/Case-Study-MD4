package com.example.md4_case_study.repository;

import com.example.md4_case_study.model.NotificationAdmin;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface NotificationAdminRepo extends CrudRepository<NotificationAdmin,Integer> {
    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "update login_jwt.notification_admin set status_confirm = 1 where app_user_id_user=:idUser and time_select like concat('%',:time_select,'%'); ")
    void updateStatusConfirmAdmin(@Param("idUser") int idUser, @Param("time_select")String time);
}
