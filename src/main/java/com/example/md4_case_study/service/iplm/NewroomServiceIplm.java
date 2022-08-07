package com.example.md4_case_study.service.iplm;

import com.example.md4_case_study.model.NewRoom;
import com.example.md4_case_study.repository.INewRoomRepo;
import com.example.md4_case_study.service.INewroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewroomServiceIplm implements INewroomService {
    @Autowired
    INewRoomRepo iNewRoomRepo;
    @Override
    public Page<NewRoom> getAll(Pageable pageable) {
        return iNewRoomRepo.findAll(pageable);
    }

    @Override
    public NewRoom save(NewRoom newRoom) {
        return iNewRoomRepo.save(newRoom);
    }

    @Override
    public void delete(long idRoom) {
iNewRoomRepo.deleteById(idRoom);
    }

    @Override
    public NewRoom findById(long idRoom) {
        return iNewRoomRepo.findById(idRoom).get();
    }

    @Override
    public List<NewRoom> findByName(String nameRoom) {
        return iNewRoomRepo.findAllByNameRoomContaining(nameRoom);
    }
}
