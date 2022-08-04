package com.example.md4_case_study.repository;

import com.example.md4_case_study.model.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepo extends CrudRepository<Room,Integer> {
}
