package com.example.md4_case_study.service;

import com.example.md4_case_study.model.Room;

import java.util.List;

public interface IRoomService {

    List<Room> listRoom();

    void save(Room room);


}
