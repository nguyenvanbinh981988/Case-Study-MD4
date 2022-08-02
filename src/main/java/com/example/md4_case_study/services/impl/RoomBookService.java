package com.example.md4_case_study.services.impl;


import com.example.md4_case_study.model.RoomBook;
import com.example.md4_case_study.repositorys.IRoomBookRepo;
import com.example.md4_case_study.services.IRoomBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RoomBookService implements IRoomBookService {
    @Autowired
    IRoomBookRepo iRoomBookRepo;

    @Override
    public Page<RoomBook> getAll(Pageable pageable) {
        return iRoomBookRepo.findAll(pageable);
    }

    @Override
    public RoomBook save(RoomBook roomBook) {
        return iRoomBookRepo.save(roomBook);
    }

    @Override
    public void delete(long id) {
iRoomBookRepo.deleteById(id);
    }

    @Override
    public RoomBook findById(long id) {
        return iRoomBookRepo.findById(id).get();
    }

}
