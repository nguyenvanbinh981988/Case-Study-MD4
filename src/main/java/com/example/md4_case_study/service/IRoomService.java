package com.example.md4_case_study.service;

import com.example.md4_case_study.model.Room;
import com.example.md4_case_study.model.RoomBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;


public interface IRoomService {
    Page<Room> getAll(Pageable pageable);
    Room save(Room room);

    void delete(Long idRoom);
    Room findByNameRoom(String nameRoom);

    public Room findById(Long idRoom);
//    public List<Room> findAllRoomB(int roomType,String roomKind,int minPriceRoom,int maxPriceRoom);
}