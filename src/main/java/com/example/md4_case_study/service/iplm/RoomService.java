package com.example.md4_case_study.service.iplm;

import com.example.md4_case_study.model.Room;
import com.example.md4_case_study.repository.RoomRepo;
import com.example.md4_case_study.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoomService implements IRoomService {
    @Autowired
    RoomRepo roomRepo;

    @Override
    public Iterable<Room> findAll() {
        return roomRepo.findAll();
    }

    @Override
    public Optional<Room> findById(Long id) {
        return roomRepo.findById(id);
    }

    @Override
    public Room save(Room room) {
        return roomRepo.save(room);
    }

    @Override
    public void remove(Long id) {
        roomRepo.deleteById(id);

    }

//    @Override
//    public List<Room> findAllRoomB(int roomType,String roomKind,int minPriceRoom,int maxPriceRoom) {
//        return roomRepo.findAllRoom(roomType,roomKind,minPriceRoom,maxPriceRoom);
//    }


}