package com.example.md4_case_study.service.iplm;


import com.example.md4_case_study.model.AppUser;
import com.example.md4_case_study.model.RoomBook;
import com.example.md4_case_study.repository.IRoomBookRepo;
import com.example.md4_case_study.service.IRoomBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoomBookService implements IRoomBookService {
    @Autowired
    IRoomBookRepo iRoomBookRepo;

    @Override
    public Page<RoomBook> getAll(Pageable pageable){
        return iRoomBookRepo.findAll(pageable);
    }


    @Override
    public RoomBook save(RoomBook roomBook){
        return iRoomBookRepo.save(roomBook);
    }

    @Override
    public void delete(Long idRoomBook){
        iRoomBookRepo.deleteById(idRoomBook);
    }

    @Override
    public Optional<RoomBook> findByAppUser(AppUser appUser){
        return iRoomBookRepo.findByAppUser(appUser);
    }

    @Override
    public Page<RoomBook> findByNameGuestContain(Pageable pageable, String guest){
        return iRoomBookRepo.findByNameGuestContaining(pageable,guest);
    }

    @Override
    public Page<RoomBook> findByNameGuest(String nameGuest) {
        return iRoomBookRepo.findByNameGuest(nameGuest);
    }

}
