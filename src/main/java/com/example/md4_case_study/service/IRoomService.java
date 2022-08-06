package com.example.md4_case_study.service;

import com.example.md4_case_study.model.Room;

import java.util.List;
import java.util.Optional;


public interface IRoomService {
    Iterable<Room> findAll();

    Optional<Room> findById(Long id);

    Room save(Room room);

    void remove(Long id);

    List<Room> findByName(String nameRoom);
}