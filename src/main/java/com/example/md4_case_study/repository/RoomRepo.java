package com.example.md4_case_study.repository;


import com.example.md4_case_study.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepo extends JpaRepository<Room,Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM md4_case_study.room where name_room like concat('%',:name,'%');")
    List<Room> findAllByNameContaining(String name);


}