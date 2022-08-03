package com.example.md4_case_study.service.iplm;

import com.example.md4_case_study.model.Room;
import com.example.md4_case_study.repository.RoomRepo;
import com.example.md4_case_study.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomService implements IRoomService {
    @Autowired
    RoomRepo roomRepo;
    @Override
    public List<Room> listRoom() {
      return (List<Room>) roomRepo.findAll();
    }

    @Override
    public void save(Room room) {
        roomRepo.save(room);
    }
}
