package com.example.md4_case_study.repository;

import com.example.md4_case_study.model.Room;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoomRepo extends PagingAndSortingRepository<Room,Long> {
    Room findByNameRoom(String nameRoom);
}


