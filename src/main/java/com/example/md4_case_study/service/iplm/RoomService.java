package com.example.md4_case_study.service.iplm;

import com.example.md4_case_study.model.Room;
import com.example.md4_case_study.model.RoomBook;
import com.example.md4_case_study.repository.RoomRepo;
import com.example.md4_case_study.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService implements IRoomService {
    @Autowired
    RoomRepo roomRepo;

    @Override
    public Page<Room> getAll(Pageable pageable) {
        return roomRepo.findAll(pageable);
    }

    @Override
    public Room findByNameRoom(String nameRoom) {
        return roomRepo.findByNameRoom(nameRoom);
    }

    @Override
    public Room save(Room room) {
        return roomRepo.save(room);
    }

    @Override
    public void delete(Long idRoom) {
        roomRepo.deleteById(idRoom);
    }

    @Override
    public Optional<Room> findById(Long idRoom) {
        return roomRepo.findById(idRoom);
    }

//    @Override
//    public List<Room> findAllRoomB(int roomType,String roomKind,int minPriceRoom,int maxPriceRoom) {
//        return roomRepo.findAllRoom(roomType,roomKind,minPriceRoom,maxPriceRoom);
//    }


}