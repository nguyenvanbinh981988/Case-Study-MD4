package com.example.md4_case_study.repository;

import com.example.md4_case_study.model.ListUserSelect;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

public interface ListUserSelectRepo extends CrudRepository<ListUserSelect,Integer> {
    @Query(nativeQuery = true,value = "select quantity from login_jwt.list_user_select where drink_id_drink=:id ")
    int quantitySelect(@Param("id") int id);

    @Query(nativeQuery = true,value = "select * from login_jwt.list_user_select where app_user_id_user=:idUser and time_select like concat('%',:timeSelect,'%');")
    List<ListUserSelect>  listUserSelectByIdAndBySelect(@Param("idUser") int idUser, @Param("timeSelect")String time);
    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "update login_jwt.list_user_select set status_confirm = 1 where app_user_id_user=:idUser and time_select like concat('%',:time_oder,'%'); ")
    void updateStatusConfirm(@Param("idUser") int idUser, @Param("time_oder")String time);
}
