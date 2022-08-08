package com.example.md4_case_study.service;

import com.example.md4_case_study.model.AppUser;
import com.example.md4_case_study.model.Room;
import com.example.md4_case_study.model.RoomBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IRoomBookService {
    Page<RoomBook> getAll(Pageable pageable);
    RoomBook save(RoomBook roomBook);

    void delete(long idRoomBook);

    List<RoomBook> findByRoom(Room room);

    Optional<RoomBook> findByAppUser(AppUser appUser);

    Page<RoomBook> findByNameGuestContain(Pageable pageable, String nameGuest);


    List<RoomBook> findByNameGuest(String nameGuest);

}
