package com.example.md4_case_study.repositorys;


import com.example.md4_case_study.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepo extends JpaRepository<Room,Long> {
//    Iterable<Room> findAllByNameContaining(String name);

}