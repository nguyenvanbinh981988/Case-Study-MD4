package com.example.md4_case_study.service;



import com.example.md4_case_study.model.Room;
import com.example.md4_case_study.repository.RoomRepo;
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
//    public Iterable<Room> findAllByNameContaining(String name) {
//        return roomRepo.findAllByNameContaining(name);
//    }
}
